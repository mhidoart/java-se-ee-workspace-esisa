package com.esisa.java.swing.contactmanager;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ContactListePanel extends JPanel{
	
	private JTable table;
	private DefaultTableModel model;
	
	public ContactListePanel() {
		
		String titles[]= {"id","nom","Naissance","Telephone","Email"};
		model=new DefaultTableModel(titles,0);
		table = new JTable(model);
		setLayout(new BorderLayout());
		add("Center",new JScrollPane(table));
		//Contact p=new  Contact(01, "mehdi", new Date("27/10/1997"), "0690686278", "mhidoart@gmail.com");
		//this.add(p);
	}
	public void add(Contact contact)
	{Object row[]= {""+contact.getId(),contact.getName(),contact.getBirthday().toString(),contact.getTel(),contact.getEmail()};
		model.addRow(row);
		
		
	}
	public void set(Vector<Contact> liste)
	{model.setRowCount(0);
		for (Contact contact : liste) {
			add(contact);
		}
	}

}
