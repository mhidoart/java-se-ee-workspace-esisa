package com.esisa;

import java.awt.Color;

import javax.swing.JOptionPane;

public class Pixel extends Point{
	private Color color;
	public Pixel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pixel(int x, int y) {
		super(x, y);
		/*
// au lieu de l'instruction on haut on peut
		setX(5);
		setY(10);
		 */
	}

	public Pixel(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public void print() {
		JOptionPane.showMessageDialog(null,"( " + getX() + ", " + getY() + ", " + color + " )");

	}
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Pixel)
		{
			Pixel p = (Pixel) obj;
			return (p.getX() == getX() && p.getY() == getY() && color.equals(p.color));

		}
		else
		{
			return false;
		}

	}
}

