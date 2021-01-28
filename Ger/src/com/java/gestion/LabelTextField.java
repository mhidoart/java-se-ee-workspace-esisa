package com.java.gestion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LabelTextField extends JPanel {

	public LabelTextField(String label, int size) {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		if (!label.contains(":"))
			label = label + " : ";
		JLabel l1 = new JLabel(label);
		JTextField t1 = new JTextField(size);

		add(l1);
		add(t1);

		// setBorder(BorderFactory.createLineBorder(Color.BLUE));
	}

	public LabelTextField(String label, int size, int labelWdth) {

		this(label, size);
		JLabel l1 = (JLabel) getComponent(0);
		l1.setPreferredSize(new Dimension(labelWdth, getPreferredSize().height));
	}

	public String getValue() {
		JTextField t1 = (JTextField) getComponent(1);

		return t1.getText();
	}

	public void setValue(String value) {
		JTextField t1 = (JTextField) getComponent(1);
		t1.setText(value);	
	}
	public void setFocus()
	{
		JTextField t1 =(JTextField) getComponent(1);
		t1.requestFocus();
	}
}
