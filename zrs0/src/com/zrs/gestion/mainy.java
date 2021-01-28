package com.zrs.gestion;

import java.awt.Dimension;

import javax.swing.JFrame;

public class mainy extends JFrame {
private Management_panel m ;
	public mainy() {
		// TODO Auto-generated constructor stub
		setSize(new Dimension(500, 500));
		setLocation(100, 100);
		m=new Management_panel();
		setContentPane(m);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new mainy();
	}

}
