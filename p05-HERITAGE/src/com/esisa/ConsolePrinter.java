package com.esisa;

public class ConsolePrinter implements Printer {

	public ConsolePrinter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print(String[] t) {//il est necessaire d'inplementer ceci
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
	}

}
