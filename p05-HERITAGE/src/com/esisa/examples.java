package com.esisa;

import java.awt.Color;

public class examples {

	public examples() {
		// TODO Auto-generated constructor stub
		//exp01();
		//exp02();
		//	exp03();
		//exp04();
		//exp05();
		//exp06();
		exp07();
	}
	public void exp01() {
		Point p=new Point(10,30);
		p.print();
	}
	public void exp02() {
		Pixel p1 =new Pixel();
		//p1.setX(10);
		//p1.setY(20);
		p1.print();
	}
	public void exp03()
	{
		Pixel p1= new Pixel(10,20);
		p1.print();

		Pixel p2=new Pixel(20,10,new Color(255, 0, 0));
		p2.print();

	}
	public void exp04() {
		/// affectation fille mere
		Point p1 = new Pixel(5,9,Color.BLUE);//virtualisation et polymorfisme
		//p1.print();
		//	System.out.println(p1.getClass().getSimpleName());
		//affectation Mere fille
		Pixel p2= (Pixel) p1;
		Point m1 = new Point(0,30);
	}

	public void exp05() {
		Point p1=new Point(50,14);
		Pixel p2 =new Pixel(10,53,Color.black);
		afficher2(p1);
		afficher2(p2);
	}

	public void exp06() {
		Object p1 = new Point(10,20);
		Object p2= new Pixel(10,20,Color.BLUE);
		Point p3=(Point)p1;
		p3.print();
		Point p4=(Point)p2;
		//p4.print();
		Point p5 = new Point(10,20);
		System.out.println(p1 == p5);
		System.out.println("p1.equals(p5) =  " + p1.equals(p5));
		System.out.println("p1.equals(p2) =  " + p1.equals(p2));
		Color c1=new Color(10,200,120);
		Color c2=new Color(10,200,120);
		System.out.println(c1);// ce qui a creer la class color avait redefini la methode to string et equals
		System.out.println(c1.equals(c2));
		Object p6=new Pixel(10,20,Color.BLACK);
		System.out.println("p2.equals(p6) =  " + p2.equals(p6));/// c'est un defaut
	}

	void afficher(Point p) {
		p.print();
	}
	void afficher2(Object x) {
		System.out.println(x);

	}
	public void exp07(){
		DtaManager dm=new DtaManager(); 
		//dm.setPrinter ( new ConsolePrinter());
		//dm.setPrinter ( new DialogPrinter());//affectation fille mere cette ligne ne  marche plus
		dm.addPrinter(new DialogPrinter());
		dm.addPrinter(new ConsolePrinter());

		dm.add("swing");
		dm.add("anass");
		dm.add("jpane");
		dm.add("componement");
		dm.print();
	}
	public static void main(String[] args) {
		new examples();
	}

}
