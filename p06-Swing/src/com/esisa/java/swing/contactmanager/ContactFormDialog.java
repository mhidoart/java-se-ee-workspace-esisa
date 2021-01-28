package com.esisa.java.swing.contactmanager;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JDialog;
import javax.swing.JFrame;


public class ContactFormDialog extends JDialog{

	public ContactFormDialog(){
		// TODO Auto-generated constructor stub
		setLocation(new Point(100, 100));
		setSize(new Dimension(300, 300));
		ContactForm p1=new ContactForm();
		
		pack();
		setVisible(true);
		
	}
public static void main(String[] args) {
	new ContactFormDialog();
}

}
