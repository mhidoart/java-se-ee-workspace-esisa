package com.draw_things.free;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawPad extends JPanel  implements MouseMotionListener {
   private Vector<Point> points;
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		setBackground(Color.DARK_GRAY);
		g.setColor(Color.WHITE);
	addMouseMotionListener(this);
		for (int i = 1; i < points.size(); i++)  {
			g.drawLine(points.get(i-1).x, points.get(i-1).y, points.get(i-1).x, points.get(i-1).y);
		}
		
	}
	
	
	public DrawPad() {
		// TODO Auto-generated constructor stub
		points=new Vector<>();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		points.add(new Point(e.getX(), e.getY()));
		System.out.println("yes");
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
