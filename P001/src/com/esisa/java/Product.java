package com.esisa.java;

public class Product {
	private  int id;
	private String name;// par defaut est inclu dans java.lang.*
	private double price;
	private Date date;

	public Product() {
	}
	//surcharge ou surdeffinition
	public Product(int id, String name, double price,Date date) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.date=date;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	//surcharge ou sur deffinition
	public void setDate(int day,int month, int year) {
		this.date = new Date(day,month,year);
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void print()
	{
		System.out.print("produit( " + id + " , " + name + " , " + price + " , ");
		if (date != null) date.print();
		System.out.println(" )");
	}


}
