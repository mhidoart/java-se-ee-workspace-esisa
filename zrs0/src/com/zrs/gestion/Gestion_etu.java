package com.zrs.gestion;

import java.lang.reflect.Array;
import java.util.Vector;

public class Gestion_etu {
private Vector<Etudiant> v;
	public Gestion_etu() {
		// TODO Auto-generated constructor stub
		v=new Vector<>();
	}
public void add(Etudiant e)
{
	if(!v.contains(e))
	{
		v.add(e);
		System.out.println("etudiant ajouter");
	}
	else
	{
		System.err.println("echec d'ajout");
	}
}
public Etudiant getetu(int index)
{
	if(index >=0 && index <v.size())
	{
		return v.get(index);
	}
	else
	{
		return null;
	}
}

}
