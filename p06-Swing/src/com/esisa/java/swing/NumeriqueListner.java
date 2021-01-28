package com.esisa.java.swing;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.jws.soap.InitParam;
import javax.xml.bind.ParseConversionEvent;

public class NumeriqueListner implements KeyListener {

	public NumeriqueListner() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if((e.getKeyChar()<'0' || e.getKeyChar()>'9'))
		{
			e.setKeyChar('\0');
		}
	}

}
