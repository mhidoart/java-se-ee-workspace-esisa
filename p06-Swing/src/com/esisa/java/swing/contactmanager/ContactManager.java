package com.esisa.java.swing.contactmanager;

import java.util.Vector;

public class ContactManager {
	private Vector<Contact> list;
	public ContactManager() {
		// TODO Auto-generated constructor stub
		list=new Vector<>();
	}
	public void add(Contact contact)
	{
		list.add(contact);
	}
	public Contact get(int id)
	{Contact tmp=null;
	for (Contact c : list) {
		if(c.getId()== id)
		{
			tmp=c;break;
		}
	}
	return tmp;
	}
	public  Vector<Contact> seek(String keyword)
	{keyword=keyword.toLowerCase();
		Vector<Contact> tmp;
		tmp=new Vector<>();
		for (Contact c : list) {
			if(c.getNom().toLowerCase().contains(keyword) )
			{
				tmp.add(c);
			}
		}
		return tmp;
	}
	public Vector<Contact> getAllContact(){
		return list;
	}
}
