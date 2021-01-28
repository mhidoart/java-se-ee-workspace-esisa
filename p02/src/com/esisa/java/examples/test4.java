package com.esisa.java.examples;

import com.esisa.java.modifiers.Person;
import com.esisa.java.modifiers.Grade;;


public class test4 {
	private Person p1,p2,p3;
	public test4() {
		exp02();
	}
	public static void main(String[] args) {
		new test4();

	}

	void exp01() {
		System.out.println(Person.getCounter());
		p1 = new Person("Omar","Omar@gmail.com","0690626278");
		p2 = new Person("khalid","khalid@gmail.com","0618752016");
		p3 = new Person("Amine","Amine@gmail.com","0653667121");

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(Person.getCounter());
	}
	void exp02() {
		Grade  g1 =new Grade(18);
		g1.setValue(21);
		System.out.println(g1);
		System.out.println("MAX VALUE est + " + Grade.MAX_VALUE);
	}
}
