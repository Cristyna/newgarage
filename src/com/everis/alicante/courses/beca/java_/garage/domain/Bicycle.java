package com.everis.alicante.courses.beca.java_.garage.domain;

public class Bicycle {
	private String color, model;
	private	int numWheels;

	public Bicycle(String color, String model) {
		this.color = color;
		this.model = model;
		this.numWheels = 2;
	}

	@Override
	public String toString() {
		return "Bicycle [color=" + color + ", model=" + model + ", numWheels=" + numWheels + "]\n";
	}
	
}
