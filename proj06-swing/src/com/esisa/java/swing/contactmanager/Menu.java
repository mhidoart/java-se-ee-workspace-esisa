package com.esisa.java.swing.contactmanager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar {
	private String iconFolder="resources/icons/";
	private String extention=".png";
	private Vector<JMenuItem> items;


	public Menu(String m[][],String iconFolder,String extention)
	{this.iconFolder=iconFolder;
	this.extention=extention;
	createMenubar(m);

	}
	public void createMenubar(String m[][])
	{ items=new Vector<>();
		for (int i = 0; i < m.length; i++) {
			createMenu(m[i]);
		}
	}
	public Menu(String m[][]) {
		createMenubar(m);
	}
	public void createMenu(String t[])
	{
		JMenu m=new JMenu(t[0]);
		add(m);
		for (int i = 1; i < t.length; i++) {
			if(t[i].equals("-"))
			{
				m.addSeparator();
			}
			else
			{
				Icon icon=new ImageIcon(iconFolder + t[i].toLowerCase()+ extention);
				JMenuItem item=new JMenuItem(t[i],icon);
				items.add(item);
				m.add(item);
			}
		}
	}
	public void addactionlistner(ActionListener a)
	{
		for (JMenuItem item : items) {
			item.addActionListener(a);
		}
	}
}
