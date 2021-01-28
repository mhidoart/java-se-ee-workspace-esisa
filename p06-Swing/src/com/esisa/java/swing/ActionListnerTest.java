package com.esisa.java.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;

import javax.swing.JButton;

public class ActionListnerTest implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b1= (JButton) e.getSource();
		System.out.println(b1.getText());
	}

	

}
