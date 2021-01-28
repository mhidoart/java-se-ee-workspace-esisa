package com.esisa.java.modifiers;

public class Grade {
	public static final double MAX_VALUE = 20;
	private double value;

	public Grade(double value) {

		setValue(value);
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		if (value <= MAX_VALUE) {
			this.value = value;

		}
	}

	@Override
	public String toString() {
		return "Grade [value=" + value +  "/" + MAX_VALUE + "]";
	}


}
