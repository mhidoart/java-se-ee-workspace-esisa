package com.esisa.java.io.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.esisa.java.io.business.ContactManager;
import com.esisa.java.io.models.Company;
import com.esisa.java.io.presentation.components.ButtonPanel;



	public class CompanyFormDialog extends JDialog implements ActionListener
	{	private CompanyForm form;
		private ContactManager manager;
		public CompanyFormDialog(JFrame owner, ContactManager manager) {
			// TODO Auto-generated constructor stub
			super(owner,true);
			this.manager=manager;
			form= new CompanyForm();
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
				Company company = form.getCompany();
				manager.add(company);
				JOptionPane.showMessageDialog(this, "Entreprise Bien enregistrée : "+ company.getName());
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

