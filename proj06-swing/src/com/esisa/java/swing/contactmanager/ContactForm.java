package com.esisa.java.swing.contactmanager;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.esisa.java.swing.components.Form;

public class ContactForm extends Form {

	public ContactForm() {

		super("Nouveau Contact",120);
		add("Identificateur :", 10);
		add("Nom :", 20);
		add("Date de naissance :", 12);
		add("Téléphone :", 15);
		add("Adresse email :", 30);

	}

	public Contact getContact() {
		Contact c =new Contact(
				getintvalue(0),getValue(1),new Date(getValue(2)),getValue(3),getValue(4));
		return c;
		
	}

	public void setContact(Contact contact) {////*******************************************
		setvalue(0,""+contact.getId());
		setvalue(1,""+contact.getName());
		setvalue(2,""+contact.getBirthday().toString());
		setvalue(3,""+contact.getTel());
		setvalue(4,""+contact.getEmail());
	}

}
