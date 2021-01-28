package com.esisa.java;

import java.util.Iterator;
import java.util.Vector;

public class Collections {

	public Collections() {
		// TODO Auto-generated constructor stub
		//exp01();
		//exp02();
		exp03();//  for each
	}
	public void exp01() {
		Vector v1 =new Vector();
		v1.add(20);
		v1.add("une chaine");
		v1.add(12.5);

		for (int i = 0; i < v1.size(); i++) {
			System.out.println(v1.get(i));

		}

	}

	public void exp02() {
		Vector<Integer> v1 =new Vector<>();
		v1.add(20);
		v1.add(5);
		v1.add(3);
		v1.add(6);

		for (int i = 0; i < v1.size(); i++) {
			System.out.println(v1.get(i));

		}

	}

	public void exp03() {
		Vector<Point> v1 =new Vector<>();
		v1.add(new Point(10,30));
		v1.add(new Point(10,10));
		v1.add(new Point(10,17));
		v1.add(new Point(50,03));
		for(Point p : v1)
		{
			System.out.println(p);
		}


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Collections();
	}

}
