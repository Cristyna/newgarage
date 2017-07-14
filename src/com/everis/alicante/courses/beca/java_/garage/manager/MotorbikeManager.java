package com.everis.alicante.courses.beca.java_.garage.manager;

import java.util.ArrayList;
import java.util.List;

import com.everis.alicante.courses.beca.java_.garage.domain.Motorbike;

public class MotorbikeManager {
	private List<Motorbike> elements = new ArrayList<>();

	public List<Motorbike> list() {
		return elements;
	}

	public Motorbike save(final Motorbike element) {
		elements.add(element);
		return element;

	}

	public void delete(final Motorbike element) {
		elements.remove(element);
	}

	public Motorbike get(final int i) {
		return elements.get(i);
	}
}
