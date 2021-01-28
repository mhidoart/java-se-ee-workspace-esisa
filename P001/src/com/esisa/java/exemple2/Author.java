package com.esisa.java.exemple2;

import com.esisa.java.Date;

public class Author extends Object{
	private int id;
	private String name;
	private Date birthday;
	public Author() {
		super();
	}
	public Author(int id, String name, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	//surcharge 
	public void setBirthday(int day,int month ,int year) {
		this.birthday =new Date(day,month,year);
	}
	//override
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", birthday=" + birthday + "]";
	}

	public Author(int id, String name, int day,int month,int year) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = new Date(day,month,year);
	}

}
