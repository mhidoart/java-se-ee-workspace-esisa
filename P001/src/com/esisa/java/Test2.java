package com.esisa.java;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 =new Product(101,"clavier",260,null);
		//affectation de reference
		Product p2 = p1;
		p2.setName("ecran");
		p1.print();

		Product p3 =new Product(101,"ecran",260,null);
		p3.print();
		System.out.println(p1 == p2);//comparaison de references
		System.out.println(p1 == p3);
	}

}
