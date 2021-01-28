package com.esisa.swing.conpenoment;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BUttonPanel extends JPanel {

	public BUttonPanel(String ...labels) {
		// TODO Auto-generated constructor
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		for (int i = 0; i < labels.length; i++) {
			JButton b1 = new JButton(labels[i]);
			add(b1);
		}
	}
	public JButton getbutton(int index)
	{
		return ((JButton) getComponent(index));
	}
	public int lenght()
	{
		return getComponentCount();
	}
	public void addActionListner(ActionListener a)
	{
		for (int i = 0; i < lenght(); i++) {
			getbutton(i).addActionListener(a);
		}	
	}

	public void addActionListner(int index,ActionListener a)
	{
	
			getbutton(index).addActionListener(a);
	
	}
}
