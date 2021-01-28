package com.esisa.java.io.presentation.components;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel
{
	
	public ButtonPanel(String...Labels ) 
	{
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		for (int i = 0; i < Labels.length; i++) {
			JButton b1= new JButton(Labels[i]);
			add(b1);
		}
	}
	public JButton getButton(int index)
	{
		return (JButton)getComponent(index);
	}
	public int  length()
	{
		return getComponentCount();
	}
	
	public void addActionListener(ActionListener a)
	{
		for (int i = 0; i < length(); i++) 
		{
			getButton(i).addActionListener(a);
		}
		
	}
	public void addActionListener(int index, ActionListener a)
	{
		getButton(index).addActionListener(a);
		
	}

}
