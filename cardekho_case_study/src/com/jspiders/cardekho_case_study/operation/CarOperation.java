package com.jspiders.cardekho_case_study.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jspiders.cardekho_case_study.entity.Car;

public class CarOperation {
	
	private List<Car> cars = new ArrayList<Car>();

	public void addCarDetails() {
		
		System.out.println("How many car details you want to add ? ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		for (int i =1; i<=choice; i++) {
			Car car = new Car();
			System.out.println("Enter car id : ");
			car.setCar_id(scanner.nextInt());
			System.out.println("Enter car name : ");
			car.setName(scanner.next());
			System.out.println("Enter car brand : ");
			car.setBrand(scanner.next());
			System.out.println("Enter car fuel Type: ");
			car.setFuel_type(scanner.next());
			System.out.println("Enter car price : ");
			car.setPrice(scanner.nextDouble());
			cars.add(car);
			System.out.println("\n\n"+ car.getName()+"added ...!");
			
		}
			getAllDetails();
	}

	public void removeCarDetails() {
		getAllDetails();
		
		if (cars.isEmpty() == false) {
			Car car1 = null;
			System.out.println("\n Enter car id to remove : ");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			for (Car car: cars) {
				if (car.getCar_id()==choice) {
					car1 =car;
				}	
			}
			if (car1 != null) {
				cars.remove(car1);
				System.out.println(car1.getName()+"removed ..!");	
			}
			else {
				System.out.println("Invalid choice . Try Again ...!");
			}
		}
		
	}

	public void getAllDetails() {
		if (cars.isEmpty()) {
			System.out.println("No car details found ...! ");
			
		}else {
			System.out.println("Total car details : "+ cars.size() );
			System.out.println("ID\t"+ "Name\t"+"Brand\t"+"Fule Type\t"+"Price");
			System.out.println("==========================================");
			for (Car car : cars) {
				System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+ car.getBrand()+"\t"+
			                                car.getFuel_type()+"\t\t"+ car.getPrice());
			}
		}
		
	}

	public void searchByName() {
		if (cars.isEmpty()) {
			System.out.println("No car details found ...! ");	
	}else {
		System.out.println(" Enter car name : ");
		Scanner scanner = new Scanner(System.in);
		String  name = scanner.next();
		List<Car> allCars = new ArrayList<Car>();
		
		for (Car car: cars) {
			if (car.getName().equalsIgnoreCase(name)) {
				allCars.add(car);
			}	
		}
		System.out.println("Total car details : "+ allCars.size() );
		System.out.println("ID\t"+ "Name\t"+"Brand\t"+"Fule Type\t"+"Price");
		System.out.println("==========================================");
		for (Car car : allCars) {
			System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+ car.getBrand()+"\t"+
		                                car.getFuel_type()+"\t\t"+ car.getPrice());
		}
		
	}	
 }

	public void searchByBrand() {
		if (cars.isEmpty()) {
			System.out.println("No car details found ...! ");	
	}else {
		System.out.println(" Enter car brand : ");
		Scanner scanner = new Scanner(System.in);
		String  brand = scanner.next();
		List<Car> allCars = new ArrayList<Car>();
		
		for (Car car: cars) {
			if (car.getName().equalsIgnoreCase(brand)) {
				allCars.add(car);
			}	
		}
		System.out.println("Total car details : "+ allCars.size() );
		System.out.println("ID\t"+ "Name\t"+"Brand\t"+"Fule Type\t"+"Price");
		System.out.println("==========================================");
		for (Car car : allCars) {
			System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+ car.getBrand()+"\t"+
		                                car.getFuel_type()+"\t\t"+ car.getPrice());
		}
		
	  }
				
	}

	public void searchByFuelType() {
		if (cars.isEmpty()) {
			System.out.println("No car details found ...! ");	
	}else {
		System.out.println(" Enter car name : ");
		Scanner scanner = new Scanner(System.in);
		String  fuel_Type = scanner.next();
		List<Car> allCars = new ArrayList<Car>();
		
		for (Car car: cars) {
			if (car.getName().equalsIgnoreCase(fuel_Type)) {
				allCars.add(car);
			}	
		}
		System.out.println("Total car details : "+ allCars.size() );
		System.out.println("ID\t"+ "Name\t"+"Brand\t"+"Fule Type\t"+"Price");
		System.out.println("==========================================");
		for (Car car : allCars) {
			System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+ car.getBrand()+"\t"+
		                                car.getFuel_type()+"\t\t"+ car.getPrice());
		}
		
	 }	
		
	}

	public void editCarDetails() {
		getAllDetails();
		if (cars.isEmpty()== false) {
			System.out.println("Enter car id to update: ");	
		    Scanner scanner = new Scanner(System.in);
		    int car_id = scanner.nextInt();
		
		for (Car car: cars) {
			if (car.getCar_id()== car_id) {
			System.out.println("Enter new car name: ");
			car.setName(scanner.next());
			System.out.println("Enter new car brand: ");
			car.setBrand(scanner.next());
			System.out.println("Enter new car fule Type: ");
			car.setFuel_type(scanner.next());
			System.out.println("Enter new car price: ");
			car.setPrice(scanner.nextDouble());
			System.out.println("Car Details Update ..!");
			}	
		}
			
	}
		
	}

}
