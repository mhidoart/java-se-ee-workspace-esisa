package com.somatra.reactifpanel;

import javax.swing.JFrame;

public class Frame extends JFrame{

	public Frame() {
		// TODO Auto-generated constructor stub
		build_frame();
		Panel p1=new Panel();
		setContentPane(p1);
	}
	private void build_frame()
	{
		setLocation(100,100);
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Frame();
	}
	

}
