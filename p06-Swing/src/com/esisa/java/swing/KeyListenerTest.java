package com.esisa.java.swing;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerTest implements KeyListener {

	public KeyListenerTest() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keypressed()"+ e.getKeyChar() +" , "  + e.getKeyCode());
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("realease()"+ e.getKeyChar() +" , "  + e.getKeyCode());

		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keytyped()"+ e.getKeyChar() +" , "  + e.getKeyCode());

		
	}

}
