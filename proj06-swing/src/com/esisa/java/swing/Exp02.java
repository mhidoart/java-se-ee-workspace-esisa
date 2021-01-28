package com.esisa.java.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.esisa.java.swing.contactmanager.Menu;
import com.esisa.java.swing.listeners.AlphaListener;
import com.esisa.java.swing.listeners.ExitAction;
import com.esisa.java.swing.listeners.KeyListenerTest;
import com.esisa.java.swing.listeners.MouseDrawPanel;
import com.esisa.java.swing.listeners.NumericListener;
import com.esisa.java.swing.listeners.ToUpperLitner;

public class Exp02 extends JFrame {

	public Exp02() {
		init();
		//exp01();
		//exp02();
		//exp03();
		//exp04();
		//exp05();
		//exp06();
		//exp07();
		//exp08(); 
		//exp09();
		//exp10();
		//exp11();
		exp12();
		setVisible(true);
	}
	
	void exp01() {
		setSize(500, 300);
		setLocation(100, 100);
		//setBounds(arg0, arg1, arg2, arg3);// location dof fram
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(2, 2)); // bach kan9smo jfram des colonnes et  lignes
		JLabel l1 = new JLabel("Nom : ");
		JTextField t1 = new JTextField(20);
		JButton b1 = new JButton("Valider");
		p1.add(l1);
		p1.add(t1);
		p1.add(b1);
		
		setContentPane(p1);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	void exp02() {
		setSize(600, 300);
		setLocation(100, 100);
		//setBounds(arg0, arg1, arg2, arg3);// location d Jfram
		JPanel p1 = new JPanel();
		p1.setLayout(new BorderLayout()); // bach kan9smo jfram des colonnes et  lignes
		JLabel l1 = new JLabel("Nom : ");
		JTextField t1 = new JTextField(20);
		JButton b1 = new JButton("Valider");
		p1.add("West",l1);
		p1.add("North",t1);
		p1.add("South",b1);
		
		setContentPane(p1);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		setVisible(true);
	}
	
	void init() {
		setSize(500, 300);
		setLocation(100, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	void exp03() {
		JPanel container = new  JPanel();
		container.setLayout(new BorderLayout());
		JButton b1 = new JButton("Valider");
		JButton b2 = new JButton("Annuler");
		JPanel p1 = new JPanel();
		p1.setBackground(Color.GRAY);
		p1.add(b1);
		p1.add(b2);
		
		container.add("South", p1);
		setContentPane(container);
		setVisible(true);
	}

	void exp04() {
		JPanel container = new  JPanel();
		container.setLayout(new BorderLayout());
		
		ButtonPanel p1 = new ButtonPanel("valider", "Enregistrer", "Annuler"); // pour ajouter les Button mais on a creer class ButtonPanel
		container.add("South", p1);
		
		JPanel form = new JPanel();
		form.setLayout(new BoxLayout(form, BoxLayout.Y_AXIS));
		container.add("Center", form);
		
		form.add(new LabelTextField("Nom : ",20));
		form.add(new LabelTextField("Prenom : ",20));
		form.add(new LabelTextField("Tel : ",12));
		
		setContentPane(container);
		setVisible(true);
	}
	
	void exp05() {
		
		JPanel container = new  JPanel();
		container.setLayout(new BorderLayout());
		
		ButtonPanel p1 = new ButtonPanel("valider",/* "Enregistrer",*/ "Annuler"); // pour ajouter les Button mais on a creer class ButtonPanel
		container.add("South", p1);
		
		Form form = new Form("Saisie d'un document");
		//form.setLayout(new BoxLayout(form, BoxLayout.Y_AXIS));
		container.add("Center", form);
		
		form.add("ID : ",10);
		form.add("Titre : ",40);
		form.add("Editeur : ",30);
		form.add("Année d'edition : ",10);
		form.addUniqueChoiceField("Langues", "Français","Anglais", "Arabe");
		form.addUniqueChoiceField("Etat", "Disponible","Non disponible");
		form.addMultipleChoiceField("Forma", "Papier","Electronique");
		
		
		setContentPane(container);
		
		
		pack();
		//setResizable(false);
	}
	
	void exp06() {
		
		String l1 ="Langues";
		ChoicePanel p1 = new ChoicePanel(l1, "Français" , "Anglais","Arabe");
		ChoicePanel p2 = new ChoicePanel(ChoicePanel.MULTIPE, l1, "Français" , "Anglais","Arabe");
		
		getContentPane().add("North", p1);
		getContentPane().add("South", p2);
		
		
	}
	
	void exp07() { //???
		ImagePanel p1 = new ImagePanel("resources/jp1.jpg");
		getContentPane().add("Center", p1);
	}
	
	void exp08() {
		JButton b1 = new JButton("Quitter");
		
		b1.addActionListener(new ExitAction());
		getContentPane().add("South", b1);
		
	}
	
	void exp09() {
		
		Calculator c1 = new Calculator();
		
		
		
	}
	
	void exp10() {
		JTextField t1 = new JTextField();
		getContentPane().add("North", t1);
		
		//t1.addKeyListener(new KeyListenerTest());
		//t1.addKeyListener(new AlphaListener());
		//t1.addKeyListener(new  NumericListener());
		//t1.addKeyListener(new ToUpperLitner());
	}
	
	void exp11() {
		ButtonPanel p1 = new ButtonPanel("Nouveau", "Enrigistrer", "Annuler");
		p1.addActionListener(new ActionListenerTest());
		getContentPane().add("South", p1);

	}
	void exp12()
	{
		String labels[][]= {
				{"File","New","Open","Save","-","Quitter"},
				{"Edit","Copy","Cut","Past"}
		};
		Menu menu=new Menu(labels);
		setJMenuBar(menu);
	}
	
	public static void main(String[] args) {
		new Exp02();

	}

}
