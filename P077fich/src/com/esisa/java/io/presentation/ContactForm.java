package com.esisa.java.io.presentation;

import com.esisa.java.io.presentation.components.Form;

public class ContactForm extends Form{

	public ContactForm() {
		// TODO Auto-generated constructor stub
		super("Nouveau contact",120);
		add("identificateur",10);
		add("nom",20);
		add("prenom",30);
		add("Adresse email",60);
	}

}
