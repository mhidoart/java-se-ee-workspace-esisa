package com.epoque.java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class calcul extends JPanel implements ActionListener {
	public JLabel screen;
	private double  curr=0.0;
	private String op="";
	public calcul() {
		// TODO Auto-generated constructor stub
		setLayout(new BorderLayout());
		affEcran();
		buttongride();
	}

	public void buttongride()
	{
		String m[][]=
			{
					{"7","8","9","+"},
					{"4","5","6","-"},
					{"1","2","3","*"},
					{"0",",","=","/"},
			};
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(4, 4,2,2));
		for (int i = 0; i < m.length; i++) {

			for (int j = 0; j < m[i].length; j++) {
				JButton b1=new JButton(m[i][j]);
				b1.addActionListener(this);

				p1.add(b1);
			}
		}
		add("Center",p1);

	}
	public void affEcran()
	{
		screen=new JLabel(""+curr);
		screen.setFont(new Font("Consolas", Font.BOLD, 32));
		screen.setHorizontalAlignment(JLabel.RIGHT);
		screen.setBorder(BorderFactory.createLoweredBevelBorder());
		screen.setBackground(new Color(220, 200, 250));
		screen.setOpaque(true);

		add("North", screen);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b1=new JButton();
		b1= (JButton)e.getSource();
		String s=b1.getText();
		if (s== "-"|| s=="+" || s== "*"|| s== "/")
		{
			op=s;
			screen.setText(screen.getText()+ s);
		}
		else
		{
			if (op=="")
			{
				screen.setText( s);
				curr= Double.parseDouble( screen.getText());
			}
			else
			{
				switch (op) {
				case "-":
					curr=curr-Double.parseDouble( s);
					break;
				case "+":
					curr=curr+Double.parseDouble( s);
					break;
				case "*":
					curr=curr*Double.parseDouble( s);
					break;
				case "/":
					curr=curr/Double.parseDouble( s);
					break;

				default:
					break;
				}
				screen.setText(""+curr);
				op="";

			}
		}

	}


}
