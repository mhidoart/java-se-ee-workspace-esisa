package com.esisa.java;

public class Examples {

	public Examples() {
		// TODO Auto-generated constructor stub
		exp01();
	}
	public  void exp01()
	{/*
		String s1="une chaine ";
		String s2=new String("une autre chaine ");
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println("une 3eme chaine".length());
		String s4="une chaine";
		String s5=s1;
		String s6=new String("une autre chaine");
		System.out.println(s4 == s5);
		System.out.println(s4.equals(s1));
		System.out.println(s5 == s1);
		System.out.println(s6 == s2);
		System.out.println(s6.equals(s2));
	 */
		//exp002();
		//exp03();
		//exp04();
		//	exp05();
		exp06();
	}
	public void exp02()//tri mon algorithm
	{
		String s1="souris";
		String s2="ecran";
		String s3="clavier";
		s1.compareTo(s2);
		if(s1.compareTo(s2) <= 0 && s1.compareTo(s3) <= 0)
		{
			System.out.println(s1);
			if(s2.compareTo(s3) <= 0)
			{
				System.out.println(s2);
				System.out.println(s3);
			}
			else
			{
				System.out.println(s3);
				System.out.println(s2);

			}
		}
		else
		{
			if(s2.compareTo(s1) <= 0 && s2.compareTo(s3) <= 0)
			{
				System.out.println(s2);
				if(s1.compareTo(s3) <= 0 )
				{
					System.out.println(s1);
					System.out.println(s3);
				}
				else
				{
					System.out.println(s3);
					System.out.println(s1);
				}
			}
			else
			{

				System.out.println(s3);
				if(s1.compareTo(s2) <= 0 )
				{
					System.out.println(s1);
					System.out.println(s2);
				}
				else
				{
					System.out.println(s2);
					System.out.println(s1);
				}

			}
		}
	}

	public void exp002()
	{
		String s1="souris";
		String s2="ecran";
		String s3="clavier";
		if((s1.compareTo(s2))<0 && (s1.compareTo(s3) < 0))
		{
			if(s2.compareTo(s3)<0) System.out.println(s1 + ", " + s2 + ", " + s3 );
			else System.out.println(s1 + ", " + s3 + ", " + s2 );
		}
		else if((s2.compareTo(s1)<0) && (s2.compareTo(s3)<0)){
			if(s1.compareTo(s3)<0) System.out.println(s2 + ", " + s1 + ", " + s3 );
			else System.out.println(s2 + ", " + s3 + ", " + s1 );
		}
		else {
			if(s1.compareTo(s2)<0) System.out.println(s3 + ", " + s1 + ", " + s2);
			else System.out.println(s3 + ", " + s2 + ", " + s1);
		}

	}
	public void exp03()
	{
		String s1="une chaine de caractere";
		String s2="chaine";
		System.out.println(s1.toLowerCase().contains(s2.toLowerCase()));
		System.out.println(s1.toUpperCase());
	}
	public	void exp04()
	{
		String s1="245";
		int x=Integer.parseInt(s1); /// classe wrapper (envoloppe)
		System.out.println(x);

		double y= Double.parseDouble(s1);
		System.out.println(y);
		Integer x2=new Integer(123); //depricated depuis la version 9
		Integer x3=123;//autoboxing depuis la version 5
		int x4=x3; //unboxing depuis la version 5
		int x5=x3.intValue();
		//liste des 8 type wrappers
		///Byte,Short,Integer,Long,Float,Double,Character,Boolean
		String s2="ABC";
		int x6=0;
		try {
			x6=Integer.parseInt(s2);
		}
		catch(Exception e)
		{
			System.out.println("ERREUR : " + e.getMessage());
		}
		System.out.println("s6 = " + x6);
		int x7 =234;
		String s3="" + x7;
		System.out.println(s3);
	}
	public  void exp05()
	{
		String s1="une chaine";
		String s2=s1.toUpperCase();
		s2=s2.replace("CHAINE","NOUVELLE CHAINE");
		System.out.println(s2);
		for(int i=0;i<s2.length();i++)
		{
			System.out.println(s2.charAt(i));
		}
		String s3=s2.substring(4, 12);
		System.out.println(s3);

	}
	public void exp06() {
		String s1="Une chaine de caractere est une instance de la classe string :";
		String s2=s1.toLowerCase();
		String word="de";
		//System.out.println(s2.indexOf(word));
		///	System.out.println(s2.indexOf(word,0));
		int n=0;
		int p;
		p=s2.indexOf(word);
		while(p>=0)
		{
			System.out.println(p);
			n++;
			p=s2.indexOf(word,p+1);
		}
		System.out.println("nombre s'occurance :  " + n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Examples();
	}

}
