package com.esisa.java.swing.contactmanager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.esisa.java.swing.components.ChoicePanel;

public class ContactManagerFrame  extends JFrame implements ActionListener{
	private ContactManager manager;
	private ContactFormDialog contactformdialog;
	private ContactListeDialog contactlistdialog;
	public ContactManagerFrame() {
		// TODO Auto-generated constructor stub
		manager=new ContactManager();
		contactformdialog=new ContactFormDialog(this,manager);
		contactlistdialog=new ContactListeDialog(this, manager);
		contactlistdialog.setTarget("resources/saves/contacts.txt");
		//......liste de tous les boit diyalog
		createMenu();
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void createMenu()
	{
	//	JMenuBar menu = new JMenuBar();
	//	setJMenuBar(menu);

		String labels[][]= {
			{"Gestion de contacts",
				"nouveau contact",
				"liste de contact",
				"chercher contact par id",
				"recherche contact par nom",
				"-",
				"Quitter"
				}
		};
		Menu menu=new Menu(labels,"resources/icons/",".png");
		menu.addactionlistner(this);
				setJMenuBar(menu);
		/*
		JMenu m1=new JMenu();
		menu.add(m1);
		JMenuItem ml1= new JMenuItem();
		JMenuItem ml2= new JMenuItem();
		JMenuItem ml3= new JMenuItem();
		JMenuItem ml4= new JMenuItem();
		JMenuItem ml5= new JMenuItem();
		m1.add(ml1);
		m1.add(ml2);
		m1.add(ml3);
		m1.add(ml4);
		m1.addSeparator();
		m1.add(ml5);
		*/
	}
	public static void main(String[] args) {
		new ContactManagerFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JMenuItem item =(JMenuItem) e.getSource();
		if(item.getText().equals("nouveau contact"))
		{
			contactformdialog.setVisible(true);
		}
		else if(item.getText().equals("liste de contact")) {
			contactlistdialog.refresh();
			contactlistdialog.setVisible(true);
		}
	
		
	}

}
