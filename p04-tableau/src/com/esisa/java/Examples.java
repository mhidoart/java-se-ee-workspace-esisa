package com.esisa.java;

public class Examples {

	public Examples() {
		// TODO Auto-generated constructor stub
		//exp01();
		//exp2(); //remplissage random
		//exp03();
		//exp04();
		//exp05();
		//exp06();//remplissage random
		//exp07();
		//exp08();
		//exp09();
		//exp010();
		exp11();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Examples();
	}

	public void exp01() {
		//  1. par initialisation
		int t1[] = {40,50,20,10,1,0};
		//print(t1);
		//sort(t1);
		sort2(t1);
		print(t1);
	}

	public void exp2() {

		//1.2 par instanciation
		int t1[],n=5;
		t1=new int [n];
		//remplir le tableau avec des entier aeatoir entre 100 et 999
		for (int i = 0; i < t1.length; i++) {
			t1[i]= 100 +(int)( Math.random()* 900);
		}
		sort(t1);
		print(t1);

	}

	public void exp03()
	{
		//1.3 par instanciation et initialisation;
		int t1[];
		t1=new int[] {90,80,20,10,30,2};
		sort2(t1);
		print(t1);
	}
	public void exp04() {

		Array t1=new Array();
		t1.add(20);
		t1.add(30);
		t1.add(40);
		for (int i = 0; i < t1.size(); i++) {
			System.out.println(t1.get(i));
		}
	}

	public void exp05()//tableau d'objet
	{
		Point p1=new Point(10,20);
		Point T1[]= {p1,new Point(10,15),new Point(10,12) };
		for (int i = 0; i < T1.length; i++) {
			System.out.println(T1[i]);
		}
	}
	public void exp06()
	{
		Point t1[]=new Point[10];
		//creation :
		for (int i = 0; i < t1.length; i++) {
			t1[i]= new Point(((int)( Math.random()* 101)),((int)( Math.random()*101)));
		}
		//affichage :
		for (int i = 0; i < t1.length; i++) {
			System.out.println(t1[i]);
		}
	}
	public void exp07()
	{
		Point t1[];
		t1=new Point[] {new Point(10,30),new Point(0,0),new Point(6,3)};
		//affichage :
		for (int i = 0; i < t1.length; i++) {
			System.out.println(t1[i]);
		}

		System.out.println("2 eme tableau ");
		Point t2[]=new Point[t1.length];
		//copier
		for (int j = 0; j < t1.length; j++) {
			t2[j]=new Point(t1[j]);
			//	t2[j]=t1[j];
		}
		//t2[0]=new Point(23,23);
		t2[1].setX(1000);
		print(t1);
		//affichage :
		for (int i = 0; i < t1.length; i++) {
			System.out.println(t2[i]);
		}

	}
	public void exp08()
	{
		int m[][]= {
				{30,12,24,15},
				{19,45},
				{20,35,43}
		};
		for (int i = 0; i < m.length/*nbr de ligne*/; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " - ");

			}
			System.out.println();
		}
	}

	public void exp010()
	{
		int m[][];
		m=new int[5][10];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j]=i*j;
			}
		}
		for (int i = 1; i < m.length/*nbr de ligne*/; i++) {
			for (int j = 1; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");

			}
			System.out.println();
		}
	}
	public void exp09()
	{
		int m[][];
		m=new int[5][10];
		for(int k=0;k<10;k++)
		{
			m[0][k]=k;
		}
		for(int k=0;k<5;k++)
		{
			m[k][0]=k;
		}

		for (int i = 1; i < m.length; i++) {
			for (int j = 1; j < m[i].length; j++) {
				m[i][j]=m[0][j]*m[i][0];
			}
		}
		for (int i = 0; i < m.length/*nbr de ligne*/; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");

			}
			System.out.println();
		}
	}
	public void exp11()
	{
		int m[][];
		m=new int[3][];
		m[0]=new int[3];
		m[1]=new int[] {10,20,30,40};
		m[2]=new int[2];
		//afficher
		for (int i = 0; i < m.length/*nbr de ligne*/; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");

			}
			System.out.println();
		}
	}
	//surrcharge de la methode print 
	public void print(Point t[])
	{
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
	}
	public void print(int t[])
	{
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
	}
	public void sort(int t[])
	{
		int temp;
		for (int i = 1; i < t.length; i++) {
			for (int j = 0; j < t.length; j++) {
				if (t[i]<t[j])
				{
					temp=t[i];
					t[i]=t[j];
					t[j]=temp;
				}
			}

		}
	}
	public void sort2(int t[])
	{int index;
	int petit;
	int temp;
	for (int i = 0; i < t.length; i++) {
		petit=t[i];
		index=i;
		for (int j = i+1; j < t.length; j++) {
			if(t[j]< petit)
			{
				petit=t[j];
				index=j;
			}
		}
		temp=t[i];
		t[i]=petit;
		t[index]=temp;
	}
	}


}
