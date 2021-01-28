package com.java.gestion;

public class Personne {
	private int id;
	private String nom;
	private String prenom;

	public Personne(int id,String nom,String prenom) {
		this.id=id;
		this.nom=nom;
		this.prenom=prenom;

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getId() {
		return id;
	}
	

}
