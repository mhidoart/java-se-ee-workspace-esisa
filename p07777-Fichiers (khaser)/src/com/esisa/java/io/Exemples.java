package com.esisa.java.io;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;;
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
		//exp05();
		//exp06();
		//exp07();
		//exp08();
		//exp09();
		exp10();
		exp11();
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
			File f=new File("resources/Exp01.java");
			FileReader in = new FileReader(f);
			char t[]=new char[100];
			int n=in.read(t);//retourn le nombre d'octets lus
			while(n>0) {
				String s=new String(t, 0, n);
				System.out.print(s);
				n=in.read(t);

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	void exp06() {
		try {
			File f=new File("resources/Exp01.java");
			int  n= (int)f.length();
			FileReader in = new FileReader(f);
			char t[]=new char[n];
			in.read(t);//retourn le nombre d'octets lus

			String s=new String(t);
			System.out.print(s);

			in.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("erreur : "+ e.getMessage());
		}
	}
	void exp07() {
		try {
			File f=new File("resources/Exp01.java");
			int  n= (int)f.length();
			FileReader in = new FileReader(f);

			char t[]=new char[n];
			in.read(t);//retourn le nombre d'octets lus
			in.close();

			FileWriter out = new FileWriter("resources/Exp02.java");
			out.write(t);
			out.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("erreur : "+ e.getMessage());
		}
	}
	void exp08() {
		try {
			FileOutputStream out=new FileOutputStream("resources/Exp03.dat");
			for (int i = 0; i < 20; i++) {
				byte b=(byte)(Math.random()*128);
				out.write(b);
				System.out.println(b);
			}
			out.close();
			} catch (Exception e) {
			// TODO: handle exception
			System.out.println("erreur : " + e.getMessage());
		}
	}
	void exp09() {
		try {
			FileInputStream in=new FileInputStream("resources/Exp03.dat");
			
				byte b=(byte)in.read();
			while(b>=0)
			{
				System.out.println(b);
				 b=(byte)in.read();
			}
				
			
			in.close();
			} catch (Exception e) {
			// TODO: handle exception
			System.out.println("erreur : " + e.getMessage());
		}
	}
	void exp10() {
		try {
			FileOutputStream f = new FileOutputStream("resources/Exp04.dat");
			DataOutputStream out =new DataOutputStream(f);
			int i1=20;
			double d1=654.321;
			String s ="une chaine de charactere";
			out.writeInt(i1);
			out.writeDouble(d1);
			out.writeInt(s.length());
			out.writeBytes(s);
			out.writeInt(0);
			out.close();
			
			} catch (Exception e) {
			// TODO: handle exception
			System.out.println("erreur : " + e.getMessage());
		}
	}
	void exp11() {
		try {
			FileInputStream f = new FileInputStream("resources/Exp04.dat");
			DataInputStream in =new DataInputStream(f);
			int i1;
			double d1;
			String s1;
			i1=in.readInt();
			System.out.println(i1);
			
			d1=in.readDouble();
			System.out.println(d1);
			
			i1=in.readInt();
			System.out.println(i1);
			byte t[]=new byte[i1];
			in.read(t);
			s1=new String(t);
			System.out.println(s1);
			in.close();
			
			} catch (Exception e) {
			// TODO: handle exception
			System.out.println("erreur : " + e.getMessage());
		}
	}
	public static void main(String[] args) {
		new Exemples();
	}

}
