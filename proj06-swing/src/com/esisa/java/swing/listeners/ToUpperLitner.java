package com.esisa.java.swing.listeners;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ToUpperLitner implements KeyListener {

	public void keyPressed(KeyEvent e) {
		
	}

	public void keyReleased(KeyEvent e) {
		
	}

	public void keyTyped(KeyEvent e) {
		//String s = ""+ e.getKeyChar();
		//e.setKeyChar(s.toUpperCase().charAt(0));
		
		if(e.getKeyChar() >= 'a'  && e.getKeyChar() <= 'z'){
			e.setKeyChar((char)(e.getKeyChar() - 'a' + 'A'));
		}
		
	}

}
