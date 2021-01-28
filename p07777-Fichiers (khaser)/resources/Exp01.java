package com.esisa.java.io;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.FileNotFoundException;;
public class Exemples {

	public Exemples() {
		// TODO Auto-generated constructor stub
		try {
		//	exp01();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("erreur : " + e.getMessage());
		}
		//exp02();
		//exp03();
		exp04();
		
	}
	void exp01() throws Exception {
		
	FileReader f=new FileReader("");
		
	}
	void exp02(){
		try {
			FileReader f=new FileReader("");
			f.read();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("erreur : " + e.getMessage());
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("erreur : " + e.getMessage());
		}
	}
	void exp03() {
		try {
			FileReader f=new FileReader("src/com/esisa/java/io/Exemples.java");
			int c;
			while((c=f.read())>0) {
				System.out.print((char)c);
			}
			f.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("erreur : " + e.getMessage());

		}
	}
	void exp04() {
		try {
			FileReader f=new FileReader("src/com/esisa/java/io/Exemples.java");
			FileWriter out =new FileWriter("resources/Exp01.java");
			int c;
			while((c=f.read())>0) {
				out.write((char)c);
			}
			f.close();
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("erreur : " + e.getMessage());

		}
	}
	void exp05() {
		try {
			FileReader in = new FileReader("resources/Exp01.java");
			char t[]=new char[100];
			int n=in.read(t);//retourn le nombre d'octets lus
			while(n>0) {
				String s=new String(t, 0, n);
				System.out.println(s);
				n=in.read(t);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		new Exemples();
	}

}
