package com.esisa.java.modifiers;

public class visibility {
	private int p1;
	int p2;//defaullt public -- public par default || niveau package
	protected int p3;
	public int p4;
	public  visibility()
	{
		p1=10;
		p2=20;
		p3=30;
		p4=40;
	}
	@Override
	public String toString() {
		return "visibility [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4=" + p4 + "]";
	}
	
}
