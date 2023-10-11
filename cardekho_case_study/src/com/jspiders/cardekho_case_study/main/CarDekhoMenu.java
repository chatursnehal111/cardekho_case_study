package com.jspiders.cardekho_case_study.main;

import java.util.Scanner;

import com.jspiders.cardekho_case_study.operation.CarOperation;

public class CarDekhoMenu {
 
	private static CarOperation operation = new CarOperation();
	private static boolean loop = true;
	
	public static void main(String[] args) {
		
		while (loop) {
			CarDekhoMenu();	
		}
	}
	private static void CarDekhoMenu() {
		System.out.println("===========MENU==========\n"
				                                    + "1.Add/Remove Car Details\n"
				                                    + "2.search Car Details\n"
				                                    + "3.Edit Car Details\n"
				                                    + "4.Exist");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n Enter your choice :");
		int choice1 =scanner.nextInt();
		switch (choice1) {
		case 1:
			    System.out.println("===========MENU==========\n"
                        + "1.Add Car Details\n"
                        + "2.remove Car Details\n"
                        + "3.Go back to Main Menu");
			    System.out.println("\n Enter your choice :");
				int choice2 =scanner.nextInt();
				
				switch (choice2) {
				case 1:
					operation.addCarDetails();
					break;
				case 2:
					operation.removeCarDetails();
					break;
				case 3:
					CarDekhoMenu();
					break;

				default:
					System.out.println("\nInvalid choice.Try again ...!");
					break;
				}
				break;
		case 2:
		    System.out.println("===========MENU==========\n"
                    + "1.Search Car By Name\n"
                    + "2.Search Car  By Brand\n"
                    + "3.Search Car By Fule Type\n"
                    + "4.Search All Cars\n"
                    +"5.Go Back To Main Menu");
		    int choice3 = scanner.nextInt();
		    switch (choice3) {
			case 1:
				operation.searchByName();
				break;
			case 2:
				operation.searchByBrand();
				break;
			case 3:
				operation.searchByFuelType();
				break;
			case 4:
				operation.getAllDetails();
				break;
			case 5:
				CarDekhoMenu();
				break;
			default:
				System.out.println("\nInvalid choice.Try again ...!");
				break;
		      }
				break;
		case 3:
			operation.editCarDetails();
			break;
		case 4:
			System.out.println("Thank You !");
			loop = false;
			scanner.close();
			break;
		
		default:
			System.out.println("\n Invalid choice Try Again..!");
			break;
		}	
			
	}
	
}
