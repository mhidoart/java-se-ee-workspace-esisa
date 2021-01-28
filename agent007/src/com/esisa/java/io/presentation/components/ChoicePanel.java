package com.esisa.java.io.presentation.components;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ChoicePanel extends JPanel {
	public static final int UNIQUE=0;
	public static final int MULTIPLE=1;
	public ChoicePanel(String Label,String...choices) {
		this(UNIQUE,Label,choices);
	}

	public ChoicePanel(int type,String Label,String...choices) {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		if(!Label.contains(":")) Label=Label + " : ";
		add(new JLabel(Label));

		if(type==UNIQUE) {
			ButtonGroup g1=new ButtonGroup();
			for (int i = 0; i < choices.length; i++) {
				JRadioButton b1=new JRadioButton(choices[i]);
				add(b1);
				g1.add(b1);
			}
		}

		else if(type == MULTIPLE) {
			for (int i = 0; i < choices.length; i++) {
				JCheckBox b1=new JCheckBox(choices[i]);
				add(b1);
			}
		}
	}
	public ChoicePanel(int type,String Label,int LabelWidth,String...choices) {
		this(type,Label,choices);
		JLabel l1=(JLabel)getComponent(0);

		l1.setPreferredSize(new Dimension(LabelWidth,l1.getPreferredSize().height));
	}


}


