package com.esisa.java.swing.contactmanager;

import java.io.FileWriter;
import java.util.Vector;

public class ContactManager {

	private Vector<Contact> list;

	public ContactManager() {
		list = new Vector<>();
	}

	public void Add(Contact contact) {
		list.add(contact);
	}

	public Contact get(int id) {

		for (Contact contact : list) {
			if(contact.getId() == id) {
				return contact;
			}
		}
		return null;
	}

	public Vector<Contact> seek(String keyword) {
		Vector<Contact> v = new Vector<>();
		keyword = keyword.toLowerCase(); // bach kanrdo string minuscul 
		for (Contact contact : list) {
			if(contact.getName().contains(keyword)) {
				v.add(contact);
			}
		}
		return v;
	}

	public Vector<Contact> getAllContacts() {
		return list;
	}
	public void save(String target)
	{
		try {
			FileWriter f=new FileWriter(target);
			for (Contact contact : list) {
				f.write(contact.toString()+"\n");
			}
			f.close();
		}catch (Exception e) {
			System.out.println("erreur : "+ e.getMessage());
		}
	}



}
