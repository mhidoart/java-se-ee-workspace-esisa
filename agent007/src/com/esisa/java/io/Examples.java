package com.esisa.java.io;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;


public class Examples 
{
	//gestion des erreurs avec un catch sin throw

	public Examples() 
	{

		exp11();
	}
	//fichiers TXT
	void exp00()//les exceptions
	{
		try {
			exp01();
		} catch (Exception e) {

			System.out.println("Erreur : " + e.getMessage());
		}

	}
	void exp01() throws Exception
	{
		FileReader f=new FileReader("");
	}
	void exp02() 
	{
		try 
		{
			FileReader f=new FileReader("");//filenotfound
			f.read(); //ioexception

		} 
		catch (FileNotFoundException e)
		{
			System.out.println("Erreur : " + e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("Erreur : " + e.getMessage());

		}
	}

	void exp03() //lecture d un fichier
	{
		try
		{
			FileReader f=new FileReader("src/com/esisa//java/io/Examples.java");
			int c;
			while((c= f.read())>0)
			{
				System.out.print((char)c);
			}
			f.close();
		} 
		catch (Exception e) 
		{
			System.out.println("Erreur : " + e.getMessage());
		}
	}
	void exp04() //copier le contenu dun  fichier dans un autre
	{
		try
		{
			FileReader f=new FileReader("src/com/esisa//java/io/Examples.java");
			FileWriter out= new FileWriter("resources/Exp01.java") ;
			int c;
			while((c= f.read())>0)
			{
				out.write(c);
				System.out.print((char)c);
			}
			f.close();
			out.close();
		} 
		catch (Exception e) 
		{
			System.out.println("Erreur : " + e.getMessage());
		}
	}
	void exp05() //afficher le contenu d un fichier
	{
		try 
		{
			FileReader in = new FileReader("resources/Exp01.java");
			char t[]= new char[100];
			int n = in.read(t);//retourne le nbr d octets lus

			while ( n>0)
			{
				//afficher un tableau de chAR
				String s= new String(t, 0, n); 
				//System.out.println(s);//mots casses
				System.out.print(s);
				n=in.read(t);

			}

			in.close();
		} catch (Exception e)
		{
			System.out.println("Erreur : " + e.getMessage());
		}
	}
	void exp06() //afficher le contenu d un fichier  par FILE
	{
		try 
		{
			File f = new File("resources/Exp01.java");
			int n = (int)f.length(); // n lignes 
			FileReader in = new FileReader("resources/Exp01.java");
			char t[]= new char[n]; //creer un tableau avec n cases
			in.read(t);//retourne le nbr d octets lus


			String s= new String(t); 
			System.out.print(s);


			in.close();
		} catch (Exception e)
		{
			System.out.println("Erreur : " + e.getMessage());
		}
	}
	void exp07() //copier fichier dans un autre par un tableau
	{
		try 
		{
			File f = new File("resources/Exp01.java");
			int n = (int)f.length(); // n lignes 
			FileReader in = new FileReader("resources/Exp01.java");
			char t[]= new char[n]; //creer un tableau avec n cases
			in.read(t);//retourne le nbr d octets lus
			in.close();
			FileWriter out = new FileWriter("resources/Exp02.java");
			out.write(t);
			out.close();


		} catch (Exception e)
		{
			System.out.println("Erreur : " + e.getMessage());
		}
	}
	//fichiers binaires
	void exp08() //Output stream
	{
		try 
		{
			FileOutputStream out = new FileOutputStream("resources/Exp03.dat");
			for (int i = 0; i < 20; i++) 
			{
				byte b= (byte)(Math.random() *128);
				out.write(b);
				System.out.println(b);
			}
			out.close();
		} 
		catch (Exception e) 
		{

			System.out.println("Erreur : " + e.getMessage());
		}
	}

	void exp09() //InputStream
	{
		try 
		{
			FileInputStream in = new FileInputStream("resources/Exp03.dat");
			byte b= (byte) in.read();
			while(b>=0)
			{
				System.out.println(b);
				b=(byte)in.read();
			}

			in.close();
		} 
		catch (Exception e) 
		{

			System.out.println("Erreur : " + e.getMessage());
		}
	}
	void exp10() //DataOutputStream
	{
		try
		{
			FileOutputStream f= new FileOutputStream("resources/Exp04.dat");
		 DataOutputStream out = new DataOutputStream(f); 
		 int i1=20;
		 double d1=654.345;
		 String s = " Une chaine de caracteres";
		 
		 out.writeInt(i1);
		 out.writeDouble(d1);
		 out.writeInt(s.length());
		 out.writeBytes(s);
		 out.writeInt(0);
		 out.close();
			
		} catch (Exception e) 
		{

			System.out.println("Erreur : " + e.getMessage());
		}
	}
	void exp11() //DatainputStream
	{
		try
		{
		FileInputStream f= new FileInputStream("resources/Exp04.dat");
		 DataInputStream in = new DataInputStream(f); 
		 int i1;
		 double d1;
		 String s1;
		 i1= in.readInt();
		 System.out.println(i1);
		 
		 d1=in.readDouble();
		 System.out.println(d1);
		 
		 i1= in.readInt();
		 System.out.println(i1);
		 
		 byte t[]= new byte[i1];
		 in.read(t);
		 s1=new String(t);
		 System.out.println(s1);
		 
		 
		 in.close();
		
		} catch (Exception e) 
		{

			System.out.println("Erreur : " + e.getMessage());
		}
	}
	public static void main(String[] args) 
	{
		new Examples();
	}

}
