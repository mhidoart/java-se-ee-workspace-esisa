package com.esisa.java.swing.listeners;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// les class  abstract  si une methode nom imlemante

public class AlphaListener implements KeyListener{

	
	public void keyPressed(KeyEvent e) {
		if( (e.getKeyChar() < 'a' || e.getKeyChar() > 'z') && (e.getKeyChar() < 'A' || e.getKeyChar() > 'Z')){
			e.setKeyChar('\0');
		}
		
	}
	
	public void keyReleased(KeyEvent e) {}

	public void keyTyped(KeyEvent e) {}



}
