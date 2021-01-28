package com.esisa.java.modifiers;

public class Person {
	//propriete e class
	private static int counter = 0;// compteur d'instance
	int id;
	private String name;
	private String email;
	private String tel;

	public Person(String name, String email, String tel) {
		counter++;
		this.id=counter;
		this.name = name;
		this.email = email;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getId() {
		return id;
	}

	public static int getCounter() {
		return counter;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", tel=" + tel + "]";
	}

}
