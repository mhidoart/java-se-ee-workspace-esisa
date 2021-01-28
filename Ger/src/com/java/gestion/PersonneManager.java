package com.java.gestion;

import javax.swing.JFrame;

public class PersonneManager extends JFrame{
private PersonnePanel p;
	public PersonneManager() {
		// TODO Auto-generated constructor stub
		p=new PersonnePanel();
		setSize(500, 500);
		setLocation(100, 100);
		setContentPane(p);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

}
