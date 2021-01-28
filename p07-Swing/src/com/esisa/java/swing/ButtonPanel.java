package com.esisa.java.swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel{

	public ButtonPanel(String ...labels) {

		setLayout(new FlowLayout(FlowLayout.RIGHT));

		for (int i = 0; i < labels.length; i++) {
			JButton b1 =  new JButton(labels[i]);
			add(b1);
		}
	}

}
