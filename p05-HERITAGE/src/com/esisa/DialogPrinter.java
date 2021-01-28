package com.esisa;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class DialogPrinter  implements Printer{

	public DialogPrinter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print(String[] t) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,Arrays.toString(t));
	}

}
