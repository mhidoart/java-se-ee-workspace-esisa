package com.esisa.calc;

import java.awt.Point;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class DrawFrame extends JFrame {

	public DrawFrame() {
		// TODO Auto-generated constructor stub
		//exp01();
		//exp02();
		exp03();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setVisible(true);
	}
	void exp01()
	{
		DrawPanel p1=new DrawPanel();
		setContentPane(p1);

		Vector<Point> v=new Vector<>();
		for (int i = 0; i < 100; i++) {
			//Point n=new Point((int)( Math.random()* 1000),(int)( Math.random()* 1000));
			//	v.add(n);
			int y =(int)( Math.random()* 100); 
			v.add(new Point(i*10, y));
		}
		p1.setShape(v);
	}

	void exp02()
	{
		DrawPanel p1=new DrawPanel();
		setContentPane(p1);

		Vector<Point> v=new Vector<>();

		for (int i = 0; i < 1000; i++) {
			//Point n=new Point((int)( Math.random()* 1000),(int)( Math.random()* 1000));
			//	v.add(n);
			int y =(int)( Math.cos(i/20.)*200); 
			v.add(new Point(i, y));
		}

		p1.setShape(v);

	}
	void exp03()
	{		MOUSEDrawPanel p1=new MOUSEDrawPanel();
	setContentPane(p1);

	}

	public static void main(String[] args) {
		new DrawFrame();
	}

}
