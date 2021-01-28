package com.esisa.calc;

import javax.swing.JFrame;

public class CalculatorFrame extends JFrame {

	public CalculatorFrame() {
		// TODO Auto-generated constructor stub
		Calculator calculator=new Calculator();
		setContentPane(calculator);
		
		pack();
	//	setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);//centrer une fenetre
		setVisible(true);
	}
	public static void main(String[] args) {
		new CalculatorFrame();
	}

}
