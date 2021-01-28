package com.esisa.java.swing.listeners;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler;

public class NumericListener extends KeyAdapter {  // keyAdapter bach manimplemontewch  public void keyReleased(KeyEvent e) et public void keyPressed(KeyEvent e) and la clas Key Adapte implement Keylisterner

	public void keyTyped(KeyEvent e) {
		if(e.getKeyChar() < '0'  || e.getKeyChar() > '9'){
			e.setKeyChar('\0');
		}
	}

}
