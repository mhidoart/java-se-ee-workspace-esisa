package com.esisa.java.swing.contactmanager;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.esisa.swing.conpenoment.Form;

public class ContactForm extends Form{

	public ContactForm() {
		// TODO Auto-generated constructor stub
		super(" Nouveau Contact ");
		add("Identificateur",10);
		add("nom", 10);
		add("Date de naissance", 12);
		add("Téléphone ", 15);
		add("Adresse email :", 30);
	}
	public Contact getcontact()
	{
		return null;
	}
	public void setContact(Contact contact)
	{

	}
	public static void main(String[] args) {
		new ContactForm();
	}
}
