package com.esisa.swing.conpenoment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Form extends JPanel {
	private int labelWidth = 100;
	private JPanel container;
	
	public Form() {
		this("");
	}
	
	public Form(String title) {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		container=new JPanel();
		container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));
		add(container);
		
		//setBorder(BorderFactory.createLineBorder(Color.RED));
		//container.setBorder(BorderFactory.createLineBorder(Color.blue));
		if(!title.equals(""))
		{
			if(!title.contains(":")) title=" "+title+":";
			Border border = BorderFactory.createEtchedBorder();
			container.setBorder(BorderFactory.createTitledBorder(border, title));
		}
		
	}
	
	
	public Form(int labelWidth) {
		this();
		this.labelWidth = labelWidth;
	}
	
	public Form(String title ,int labelWidth) {
		this(title);
		this.labelWidth = labelWidth;
	}


	public void add (String label,int size) {
		LabeledTextField y1= new LabeledTextField(label, size,labelWidth);
		container.add(y1);
	}
	
	public void addUniqueChoiceField(String label,String ...choices) {
		ChoicePanel p1 = new ChoicePanel(ChoicePanel.UNIQUE, label,labelWidth,choices);
		container.add(p1);
	}
	public void addMultipleChoiceField(String label,String ...choices) {
		ChoicePanel p1 = new ChoicePanel(ChoicePanel.MULTIPLE, label,labelWidth,choices);
		container.add(p1);
	}
}
