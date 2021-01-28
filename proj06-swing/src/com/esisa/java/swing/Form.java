package com.esisa.java.swing;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Form extends JPanel {
	private int labelWidth = 100;
	private JPanel container;

	public Form() {
		this("");
	}

	public Form(String title) {
		setLayout(new FlowLayout());
		container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		add(container);
		// setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		// setBorder(BorderFactory.);
		// con

		if (!title.equals("")) {
			if (!title.contains(":"))
				title = "" + title + ":";
			Border border = BorderFactory.createEtchedBorder();
			container.setBorder(BorderFactory.createTitledBorder(border, title));

		}
	}

	public Form(int labelWidth) {
		// super();
		this();
		this.labelWidth = labelWidth;
	}

	public Form(String title, int labelWidth) {
		// super();
		this(title);
		this.labelWidth = labelWidth;
	}

	public void add(String label, int size) {
		LabelTextField t1 = new LabelTextField(label, size, labelWidth);
		container.add(t1);
	}

	public void addUniqueChoiceField(String label, String ...choices) {
		ChoicePanel p1 = new ChoicePanel(ChoicePanel.UNIQUE,label, labelWidth, choices);
		container.add(p1);

	}

	public void addMultipleChoiceField(String label, String ...choices) {
		ChoicePanel p1 = new ChoicePanel(ChoicePanel.MULTIPE,label, labelWidth, choices);
		container.add(p1);

	}

}
