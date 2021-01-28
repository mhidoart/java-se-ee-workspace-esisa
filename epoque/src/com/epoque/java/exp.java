package com.epoque.java;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class exp extends JFrame{
private JPanel p1;
	public exp() {
		// TODO Auto-generated constructor stub
		p1=new JPanel();
		setSize(600, 600);
		setLocation(100, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		calcul c = new calcul();
		setContentPane(c);
		pack();
		System.out.println("hi");
		
	}
	
	public static void main(String[] args) {
		new exp();
	}

}
