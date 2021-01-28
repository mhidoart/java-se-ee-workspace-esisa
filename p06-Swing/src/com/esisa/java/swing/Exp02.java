package com.esisa.java.swing;

import java.awt.BorderLayout;
import java.awt.BufferCapabilities;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.esisa.swing.conpenoment.BUttonPanel;
import com.esisa.swing.conpenoment.LabledTextField;

public class Exp02 extends JFrame {

	public Exp02() {
		// TODO Auto-generated constructor stub
		init();
		//Exp01();
		//Exp03();
		//Exp04();
		//Exp05();
		//exp09();
		exp10();
		setVisible(true);
	}
	void Exp01()
	{

		setSize(700,500);
		setLocation(1000, 500);

		JPanel p1=new JPanel();
		//p1.setLayout(new GridLayout(2,2));
		//	p1.setLayout(new FlowLayout());
		p1.setLayout(new BorderLayout());
		JLabel l1= new JLabel("NOM : ");
		JTextField t1=new JTextField(20);
		JButton b1 = new JButton(" valider ");
		p1.add("West",l1);
		p1.add("North",t1);
		p1.add("South",b1);

		setContentPane(p1);// le tableau sur le mur


		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	void Exp03()
	{

		JPanel container= new JPanel();
		container.setLayout(new BorderLayout());
		JButton b1=new JButton("valider");
		JButton b2=new JButton("annuler");
		JPanel p1=new JPanel();
		p1.setBackground(Color.gray);
		p1.add(b1);
		p1.add(b2);		
		container.add("South",p1);
		setContentPane(container);
		setVisible(true);
	}

	void Exp04()
	{

		JPanel container= new JPanel();
		container.setLayout(new BorderLayout());
		BUttonPanel p1= new  BUttonPanel("valider","enregistrer","annuler");
		container.add("South",p1);
		JPanel form=new JPanel();
		form.setLayout(new BoxLayout(form, BoxLayout.Y_AXIS));
		container.add("Center",form);
		form.add(new LabledTextField("nom", 20));
		form.add(new LabledTextField("prenom", 20));
		form.add(new LabledTextField("Tel", 12));

		setContentPane(container);
		setVisible(true);
	}
	void Exp05()
	{
		JPanel container= new JPanel();
	container.setLayout(new BorderLayout());
	Calculator c0 = new Calculator("0",",","=","/");
	container.add("South",c0);
		JPanel form=new JPanel();
		form.setLayout(new BoxLayout(form, BoxLayout.Y_AXIS));
		container.add("Center",form);
		Calculator c = new Calculator("1","2","3","*");
		form.add("Center",c);
		
		Calculator c2 = new Calculator("4","5","6","-");
		form.add("Center",c2);
		Calculator c3 = new Calculator("7","8","9","+");
		container.add("North",c3);
		
		setContentPane(container);
		setVisible(true);
		pack();
	}
	void exp09()
	{
		JTextField t1=new JTextField();
		getContentPane().add("North", t1);
		//t1.addKeyListener(new KeyListenerTest());
		//t1.addKeyListener(new AlphaListner());
		//t1.addKeyListener(new NumeriqueListner());
		t1.addKeyListener(new ToUpperLitner());

	}
	void exp10()
	{
		BUttonPanel b1=new BUttonPanel("nouveau","enregistrer","annuler");
		b1.addActionListner(new ActionListnerTest()) ;
		getContentPane().add("South", b1);
	}
	void init()
	{
		setSize(700,500);
		setLocation(1000, 500);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
		new Exp02();
	}
}
