package com.esisa.java.io.presentation.components;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.Serializable;

import javax.swing.JComboBox;
import javax.swing.JLabel;

import javax.swing.JPanel;

public class ComboCoicePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox<Object> combo;

	public ComboCoicePanel(String label,int labelWidth, Object ...items) {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout(FlowLayout.LEFT));
		if(!label.contains(":"))label=label+" : ";
		JLabel l1=new JLabel(label);
		l1.setPreferredSize(new Dimension(labelWidth, l1.getPreferredSize().height));
		add(l1);


		combo = new JComboBox<>(items);
		add(combo);
	}

	public Object getValue() {
		return combo.getSelectedItem();
	}
}
