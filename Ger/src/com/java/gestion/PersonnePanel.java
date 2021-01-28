package com.java.gestion;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;



public class PersonnePanel extends JPanel implements ActionListener{
private JPanel container;
private Vector<Personne> v;
	public PersonnePanel() {
		// TODO Auto-generated constructor stub
		v=new Vector<>();
		setLayout(new FlowLayout());
		container=new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		container.setName("gestion persona");
		Border border = BorderFactory.createEtchedBorder();
		container.setBorder(BorderFactory.createTitledBorder(border, "gestion etu"));
		LabelTextField id =new LabelTextField("id", 10);
		LabelTextField nom =new LabelTextField("nom", 20);
		LabelTextField prenom =new LabelTextField("prenom", 20);
		container.add("Center",id);
		container.add("Center",nom);
		container.add("Center",prenom);
		add("Center",container);
		ButtonPanel b=new ButtonPanel("Ajouter","Annuler");
		container.add("South", b);
		b.addActionListener(this);
		
		
	}
	public String getValue(int index) {
		Component cmp = container.getComponent(index);
		if(cmp instanceof LabelTextField) {
			return ((LabelTextField)cmp).getValue();
		}
		
		return null;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton b=(JButton) e.getSource();
		System.out.println(b.getText());
		if(b.getText().equals("Annuler"))
		{
			System.exit(0);
		}
		else if(b.getText().equals("Ajouter"))
		{
			for (int i = 0; i < container.getComponentCount()-1; i++) {
				String s =this.getValue(i);
				System.out.println(s);
				
			}
		
			
		}
		
	}
	

}
