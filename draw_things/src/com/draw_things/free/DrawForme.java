package com.draw_things.free;

import java.awt.Dimension;

import javax.swing.JFrame;

public class DrawForme extends JFrame {

	public DrawForme() {
		// TODO Auto-generated constructor stub
		creation();
	}
	private void creation()
	{
		setSize(new Dimension(500, 500));
		setLocation(100, 100);
		setVisible(true);
		
		//draw region
		
		DrawPad p1=new DrawPad();
		setContentPane(p1);
	}
	
	
	public static void main(String[] args) {
		new DrawForme();
	}

}
