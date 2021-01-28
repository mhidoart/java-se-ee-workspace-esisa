package com.esisa.java.io.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.esisa.java.io.business.ContactManager;
import com.esisa.java.io.business.ContactManagerDefault;
import com.esisa.java.io.models.Company;
import com.esisa.java.io.models.Contact;
import com.esisa.java.io.presentation.components.ButtonPanel;

public class ContactFormDialog extends JDialog implements ActionListener{
		private ContactForm form;
		private ContactManager manager;
		
		public ContactFormDialog(JFrame owner, ContactManager manager)
		{
			super(owner,true);
			this.manager=manager;
			form= new ContactForm(manager.companies());
			getContentPane().add("Center",form);
			ButtonPanel p1=new ButtonPanel("Save","Clear","Cancel");
			p1.setFocusable(false);
			p1.addActionListener(this);
			//c.setLayout(new BoxLayout(c,BoxLayout.Y_AXIS));
			
			getContentPane().add("South",p1);
			pack();
			setLocationRelativeTo(owner);//centre de la form
			//setVisible(true);
		}
		
	@Override
		public void actionPerformed(ActionEvent e) 
		{
			JButton button = (JButton)e.getSource();
			if(button.getText().equals("Save"))
			{
				Contact contact = form.getContact();
				manager.add(contact);
				JOptionPane.showMessageDialog(this, "Entreprise Bien enregistrée : "+ contact.getFirstName()+contact.getLastName());
				form.clear();
			}
			else if ( button.getText().equals("Clear"))
			{
				form.clear();
			}
			else if(button.getText().equals("Cancel"))
			{
				dispose(); 
			}
		
		}

}



