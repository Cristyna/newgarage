package com.everis.alicante.courses.beca.java_.garage;

import java.util.Scanner;

import com.everis.alicante.courses.beca.java_.garage.domain.Bicycle;
import com.everis.alicante.courses.beca.java_.garage.domain.Car;
import com.everis.alicante.courses.beca.java_.garage.domain.Motorbike;
import com.everis.alicante.courses.beca.java_.garage.manager.BicycleManager;
import com.everis.alicante.courses.beca.java_.garage.manager.CarManager;
import com.everis.alicante.courses.beca.java_.garage.manager.MotorbikeManager;
import com.everis.alicante.courses.becajava.garage.ui.GarageMenu;

public class GarageRunner {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// System.out.println(GarageMenu.getInstance().play());
		String option;
		final BicycleManager bicycleManager = new BicycleManager();
		final CarManager carManager = new CarManager();
		final MotorbikeManager motorbikeManager = new MotorbikeManager();
		loadData(carManager, motorbikeManager, bicycleManager);
		do {
			String option = (GarageMenu.getInstance().play());
			switch (option) {
			case "1.1":
				System.out.println(carManager.list());
				break;
			case "1.2":
				carManager.save(carBuilder());
				break;
			case "1.3":
				break;
			case "2.1":
				System.out.println(motorbikeManager.list());
				break;
			case "2.2":
				motorbikeManager.save(motorbikeBuilder());
				break;
			case "2.3":
				break;
			case "3.1":
				System.out.println(bicycleManager.list());
				break;
			case "3.2":
				bicycleManager.save(bicycleBuilder());
				break;
			case "3.3":
				break;
			}
		} while (!option.equals("0"));

	}

	private static Car carBuilder() {
		System.out.println("What is your car plate?");
		String matricula = in.nextLine();
		System.out.println("What is your car color?");
		String color = in.nextLine();
		System.out.println("What is your car model?");
		String model = in.nextLine();
		return new Car(matricula, color, model);
	}

	private static Motorbike motorbikeBuilder() {
		System.out.println("What is your motorbike plate?");
		String matricula = in.nextLine();
		System.out.println("What is your motorbike color?");
		String color = in.nextLine();
		System.out.println("What is your motorbike model?");
		String model = in.nextLine();
		return new Motorbike(matricula, color, model);
	}

	private static Bicycle bicycleBuilder() {
		System.out.println("What is your bicycle color?");
		String color = in.nextLine();
		System.out.println("What is your bicycle model?");
		String model = in.nextLine();
		return new Bicycle(color, model);
	}

	private static Car selectCar(CarManager carManager) {
		System.out.println(carManager.list());
		String color = in.nextLine();
		System.out.println("Selecciona un elemento de la lista");
		String model = in.nextLine();
		return new Bicycle(color, model);
	}
private void loadData(CarManager carManager, MotorbikeManager motorbikeManager, BicycleManager bicycleManager ) {
	for(int i=0; i<10; i)
		carManager.save(new Car("Matricula"+i, "color"+i, "modelo"+i));
	motorbikeManager.save(new Car("Matricula"+i, "color"+i, "modelo"+i));
	bicycleManager.save(new Car("Matricula"+i, "color"+i, "modelo"+i));
}
}
