package com.esisa.java.swing;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.peer.KeyboardFocusManagerPeer;

public class ToUpperLitner extends KeyAdapter {



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		/*
		String s=""+e.getKeyChar();
	e.setKeyChar(s.toUpperCase().charAt(0));
		System.out.println(	);
		*/
		if(e.getKeyChar() >='a' && e.getKeyChar() <= 'z')
		{
			e.setKeyChar((char)(e.getKeyChar()-'a'+'A'));
		}
		
	}

}
