package com.everis.alicante.courses.beca.java_.garage.domain;

public class Car {
	private String plate, color, model;
	private Integer numWheels;

	public Car(String plate, String color, String model) {
		super();
		this.plate = plate;
		this.color = color;
		this.model = model;
		this.numWheels = 4;
	}

	@Override
	public String toString() {
		return "Car [plate=" + plate + ", color=" + color + ", model=" + model + ", numWheels=" + numWheels + "]\n";
	}

}
