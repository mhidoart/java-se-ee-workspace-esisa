package com.esisa.java;

public class Point {
	private int x,y;
	public Point() {
		// TODO Auto-generated constructor stub

	}
	public Point(int i, int j) {
		// TODO Auto-generated constructor stub
		x=i;
		y=j;
	}
	//constructeur de copy  on utilise jamais ce constructour car il ya la methode clone
	public Point(Point a)
	{
		this.x=a.x;
		this.y=a.y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
