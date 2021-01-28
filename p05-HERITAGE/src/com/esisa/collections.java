package com.esisa;

import java.util.LinkedList;
import java.util.Vector;

public class collections {

	public collections() {
		// TODO Auto-generated constructor stub
		exp01();
	}
	public void exp01() {
		Vector<Object> v1 = new Vector<>();
		v1.add("une chaine");
		v1.add(new Point(10,30));
		v1.add(20);// Autoboxing + Affectation Fille Mére
		System.out.println(v1);
		Point p1 = (Point)v1.get(1);
		p1.print();
	}
	
	public void exp02() {
		LinkedList<Object> v1 = new LinkedList<>();
		v1.add("une chaine");
		v1.add(new Point(10,30));
		v1.add(20);// Autoboxing + Affectation Fille Mére
		System.out.println(v1);
		Point p1 = (Point)v1.get(1);
		p1.print();
	}
	public static void main(String[] args) {
		new collections();
	}

}
