package com.esisa.java;

public class Array {
	private int values[];
	public Array() {
		values=new int[0];
	}

	public void add(int element)
	{

		//1.creation  d'un nouveau tableau de taille suffisante :
		int tmp[]= new int [values.length+1];

		//2.copie des elements du premier tableau dans le deuxieme
		for (int i = 0; i < values.length; i++) {
			tmp[i]=values[i];
		}
		//3.placer element a la fin du tableau
		tmp[values.length]=element;
		//pointer le deuxieme tableau par le premier
		values=tmp;

	}
	public int size()
	{
		return values.length;
	}
	public int get(int index)
	{
		return values[index];
	}
	public void insert(int element,int index)
	{

	}
	public String tostring()
	{
		return "";
	}

}
