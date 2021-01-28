package com.esisa.java.swing.contactmanager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

import com.esisa.java.swing.ButtonPanel;

public class ContactListeDialog extends JDialog implements ActionListener {
	private ContactManager manager;
	ContactListePanel list;
	private String target;
	
	public void setTarget(String target) {
		this.target = target;
	}
	public ContactListeDialog(JFrame owner,ContactManager manager) {
		
		super(owner,true);
		this.manager=manager;
		
		 list =new ContactListePanel();
		
		getContentPane().add("Center", list);
		ButtonPanel p1 =new ButtonPanel("Enregistrer","Fermer");
		p1.addActionListener(this);
		getContentPane().add("South",p1);
		pack();
		setLocationRelativeTo(owner);
	}
	public void refresh() {
		list.set(manager.getAllContacts());
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton src=(JButton)e.getSource();
		if(src.getText().equals("Enregistrer"))
		{
			manager.save(target);
			dispose();
		}
		else if(src.getText().equals("Fermer"))
		{
			dispose();
		}
		
	}

}
