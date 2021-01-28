package com.esisa.java.io.presentation.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LabelTextField extends JPanel{
	private JLabel label;
	private JTextField text;
	public LabelTextField(String Label,int size) {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		if(!Label.contains(":"))Label=Label+" : ";
		this.label=new JLabel(Label);
		this.text=new JTextField(size);
		add(this.label);
		add(this.text);

		//setBorder(BorderFactory.createLineBorder(Color.black));

	}
	public LabelTextField(String Label, int size,int Labelwidth) {
		this(Label, size);
		this.label=(JLabel)getComponent(0);
		this.label.setPreferredSize(new Dimension(Labelwidth,getPreferredSize().height));
	}
	public String getValue() {
		JTextField t1 = (JTextField)getComponent(1);
		//return text.getText() ;
		return t1.getText();
	}
	public void setValue(Object value) 
	{
		//text.setText("" + value);
		JTextField t1 = (JTextField)getComponent(1);
		//return text.getText() ;
		 t1.setText((String) value);
	}
	public void setFocus()
	{
		JTextField t1= (JTextField)getComponent(1);
		t1.requestFocus();
	}
}
