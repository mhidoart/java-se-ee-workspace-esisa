package com.esisa.java.swing;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class AlphaListner implements KeyListener{

	public AlphaListner() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void keyPressed(KeyEvent e) {}
	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {
		if((e.getKeyChar() < 'a'  ||  e.getKeyChar() > 'z') &&
				(e.getKeyChar() < 'A'  ||  e.getKeyChar() > 'Z') )
		{
			e.setKeyChar('\0');
		}
	}

}
