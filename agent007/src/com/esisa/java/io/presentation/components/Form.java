package com.esisa.java.io.presentation.components;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Component;
import java.util.Vector;
//import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class Form extends JPanel{
	private int LabelWidth=100;
	private JPanel container;
	//private Vector<LabelTextField> texts;

	public Form() {
		this("");
	}


	public Form(String title) {
		setLayout(new FlowLayout(FlowLayout.LEFT)); //kan9ad biha la form dyali
		container=new JPanel();
		container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS)); // an7et  les composants haka 
		add(container);


		//container.setBorder(BorderFactory.createLineBorder(Color.red));
		//container.setBorder(BorderFactory.createLineBorder(Color.blue));
		if(!title.equals("")) {
			if(!title.contains(":")) title=" "+title+" : ";
			Border border=BorderFactory.createEtchedBorder();
			//container.setBorder(BorderFactory.createLineBorder(Color.black));
			container.setBorder(BorderFactory.createTitledBorder(border,title)); // 9sem l border w kteb hadik
		}
	}


	public Form(int labelWidth) {
		//super(); // 3la la mere
		this(); // pointe 3la rasso
		this.LabelWidth = labelWidth;
	}


	public void add(String Label ,int size) {
		LabelTextField t1=new LabelTextField(Label, size,LabelWidth);
		container.add(t1);
	}
	public Form(String title,int LabelWidth) {
		this(title);
		this.LabelWidth=LabelWidth;
	}

	public void addUniqueChoicesField(String Label,String...choices) {
		ChoicePanel p1=new ChoicePanel(ChoicePanel.UNIQUE,Label,LabelWidth,choices);
		container.add(p1);
	}

	public void addMultipleChoicesField(String Label,String...choices) {
		ChoicePanel p1=new ChoicePanel(ChoicePanel.MULTIPLE,Label,LabelWidth,choices);
		container.add(p1);
	}
	
	public void addComboChoiceField(String Label,Object...items) {
		ComboChoicePanel p1 = new ComboChoicePanel(Label, LabelWidth, items);
		container.add(p1);
	}
	
	public Object getObjectValue(int index) //recuperer la valeur du comboo!!!
	{
		Component cmp = container.getComponent(index);

		if ( cmp instanceof LabelTextField)
		{
			return ((LabelTextField) cmp).getValue();
		}
		else if ( cmp instanceof ComboChoicePanel){
			return((ComboChoicePanel)cmp).getValue();
		}

		return null;

	}
	
	public String getValue(int index)
	{
		Component cmp = container.getComponent(index);

		if ( cmp instanceof LabelTextField)
		{
			return ((LabelTextField) cmp).getValue();

		}
		else if ( cmp instanceof ChoicePanel)
		{
			//return ;

		}

		return null;

	}

	public int getIntValue(int index)
	{
		try 
		{
			return Integer.parseInt(getValue(index));
		} 
		catch (Exception e)
		{
			return 0;
		}
	}
	public double getDoubleValue(int index)
	{
		try 
		{
			return  Double.parseDouble(getValue(index));
		} 
		catch (Exception e)
		{
			return (double) 0;
		}
	}
	public void setValue(int index,String value)
	{

		Component cmp = container.getComponent(index);

		if ( cmp instanceof LabelTextField)
		{
			((LabelTextField) cmp).setValue(value);

		}	
		else if ( cmp instanceof ChoicePanel)
		{
			

		}
		
	}
	public void setValues(String...values)
	{
		
		for (int i = 0; i < values.length; i++) 
		{
			setValue(i, values[i]);
		}
	}
	
	
	public void clear()
	{
		for (int i = 0; i < container.getComponentCount(); i++) 
		{
			setValue(i, "");
			
		}
		
	}
	public void setFocus(int index)
	{

		Component cmp = container.getComponent(index);

		if ( cmp instanceof LabelTextField)
		{
			((LabelTextField) cmp).setFocus();

		}	
		else if ( cmp instanceof ChoicePanel)
		{
			

		}
		
	}

}
