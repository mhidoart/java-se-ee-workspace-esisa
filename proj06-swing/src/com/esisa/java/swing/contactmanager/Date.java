package com.esisa.java.swing.contactmanager;

public class Date {
	
	private int day ;
	private int month ;
	private int year ;

	public Date() {
		// TODO Auto-generated constructor stub
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date(String value) // ""dd/mm/yyyy"
	{
		String t[]=value.split("/");
		try {
			this.day = Integer.parseInt(t[0]);
			this.month = Integer.parseInt(t[1]);
			this.year = Integer.parseInt(t[2]);
		} catch (Exception e) {
			System.out.println("erreur de convertion de date : "+ value);
		}
		
	}

	@Override
	public String toString() {
		return  day + "/" + month + "/" + year;
	}
	

}
