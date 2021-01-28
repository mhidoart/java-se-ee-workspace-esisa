package com.zrs.gestion;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Management_panel extends JPanel {
private JPanel c;
	public Management_panel() {
		setLayout(new FlowLayout());
		c = new JPanel();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
		c.setName("gestion etudianté");
		Border border = BorderFactory.createEtchedBorder();
		c.setBorder(BorderFactory.createTitledBorder(border, "gestion etu"));
		LabelTextField name,pre,id;
		id=new LabelTextField("id", 20,100);
		name=new LabelTextField("nom", 50,100);
		pre=new LabelTextField("prenom :", 50,100);
		c.add(id);
		c.add(name);
		c.add(pre);
		add("Center", c);
		setOpaque(true);
	}

}
