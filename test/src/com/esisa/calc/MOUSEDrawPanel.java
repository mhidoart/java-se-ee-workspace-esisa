package com.esisa.calc;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class MOUSEDrawPanel extends JPanel implements MouseListener,MouseMotionListener{
	private Vector<Point> cercle;
	private Vector<Point> shape;
	private Vector<Vector<Point> > shape2;
	private Vector<Point> next;
	private boolean draw =false;
	private boolean tr=true;
	private int ray=30;
	public MOUSEDrawPanel() {
		// TODO Auto-generated constructor stub
		cercle = new Vector<>();
		shape=new Vector<>();
		shape2=new Vector<>();
		setBackground(Color.blue);
		addMouseListener(this);
		addMouseMotionListener(this);
		setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.yellow);
		int d=ray*2;
		/*
		for (Point p : cercle) 
		{
			g.drawOval(p.x-ray, p.y-ray,d, d);
		}
		 */
		for (Vector<Point> v : shape2) {
			for (int i = 1; i < v.size(); i++) {
				g.drawLine(v.get(i-1).x, v.get(i-1).y, v.get(i).x, v.get(i).y);
				
			}
		}

	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		/*
		if(e.getButton()==MouseEvent.BUTTON1)
		{
			cercle.add(new Point(e.getX(), e.getY()));
			repaint();
		}
		 */

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		Point xy=new Point(e.getX(), e.getY());
		cercle.add(xy);
		repaint();
		if(e.getButton()== MouseEvent.BUTTON1)
		{
			next=new Vector<>();
			shape2.add(next);
		}
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		/*
		if(e.getButton()== MouseEvent.BUTTON1)
		{
			tr=false;
			System.out.println("insertion");
			shape2.add(tmp);
			tmp=new Vector<>();
			System.out.println("instanciation");

		}
		 */
		if(e.getButton()== MouseEvent.BUTTON1)
		{
			draw=false;
		}
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		next.add(new Point(e.getX(), e.getY()));
		repaint();


	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		if(tr==false)
		{

		}


	}

}
