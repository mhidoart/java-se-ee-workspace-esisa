package com.esisa.java.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Calculator extends JPanel implements ActionListener{

	public Calculator() {
		// TODO Auto-generated constructor stub
		
		JButton b1 = new JButton("1");
		b1.addActionListener(this);
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		add(b1);
	}
	public Calculator(String s)
	{
		JButton b1 = new JButton(s);
		b1.addActionListener(this);
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		add(b1);
	}
	public Calculator(String ...labels)
	{
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		for (int i = 0; i < labels.length; i++) {
			JButton b1 = new JButton(labels[i]);
			b1.addActionListener(this);
			add(b1);
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
