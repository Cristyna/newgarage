package com.everis.alicante.courses.beca.java_.garage.domain;

public class Motorbike {
	private String plate, color, model;
	private	int numWheels;

	public Motorbike(String plate, String color, String model) {
		super();
		this.plate = plate;
		this.color = color;
		this.model = model;
		this.numWheels = 2;
	}

	@Override
	public String toString() {
		return "Motorbike [plate=" + plate + ", color=" + color + ", model=" + model + ", numWheels=" + numWheels + "]\n";
	}
	
}
