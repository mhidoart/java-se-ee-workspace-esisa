package com.esisa.java;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date(21,9,2018);
		//d1.print();
		
		Product p1 =new Product(101,"ecran",2400,d1);
		p1.print();
		p1.setDate(10,9,2018);
		p1.print();
		p1.getDate().setYear(1997);
		p1.print();
		d1.print();System.out.println();
		p1.setDate(new Date(10,9,2017));
		p1.print();
		
	}
	

}
