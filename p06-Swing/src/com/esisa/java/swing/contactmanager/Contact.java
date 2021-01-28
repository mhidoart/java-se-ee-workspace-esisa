package com.esisa.java.swing.contactmanager;

public class Contact {
	private int id;
	private String nom;
	private Date birthday;
	private String tel;
	private String email;
	public Contact(int id, String nom, Date birthday, String tel, String email) {
		super();
		this.id = id;
		this.nom = nom;
		this.birthday = birthday;
		this.tel = tel;
		this.email = email;
	}
	public Contact() {
		// TODO Auto-generated constructor stub

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


}
