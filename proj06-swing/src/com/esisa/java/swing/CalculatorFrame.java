package com.esisa.java.swing;

import javax.swing.JFrame;

public class CalculatorFrame extends JFrame {

	public CalculatorFrame() {
		Calculator calculator = new Calculator();
		setContentPane(calculator);
		pack();
		setResizable(false); // nach tfixa matb9ach tbdal la taille dyal fram
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new CalculatorFrame();

	}

}
