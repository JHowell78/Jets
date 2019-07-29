package com.skilldistillery.jet;

import java.util.Scanner;

public class JetsAppRun
{
	Scanner kb = new Scanner(System.in);
	AirField airField = new AirField();

	public static void main(String[] args)
	{
		JetsAppRun play = new JetsAppRun();
		play.menu();
	}

	public JetsAppRun() {

	}

	public void menu()
	{
		boolean menu = true;
		int playerChoice;

		while (menu)
		{

			System.out.println("Welcome to Jet Simulator 9000");
			System.out.println();
			System.out.println("Please choose one of the following: ");
			System.out.println();
			System.out.println("1. List Fleet");
			System.out.println("2. Fly all Jets");
			System.out.println("3. View the Fastest Jet");
			System.out.println("4. View Jet with the longest range");
			System.out.println("5. Load all Cargo Jets");
			System.out.println("6. Board all Passenger Jets");
			System.out.println("7. Add a new Jet");
			System.out.println("8. Remove a Jet");
			System.out.println("9. Quit");

			playerChoice = kb.nextInt();
			switch (playerChoice)
			{
			case 1:
				System.out.println("All available jets:");
				System.out.println();
				airField.showJets();
				System.out.println();
				break;
				
			case 2:
				System.out.println("All Jets Ready for Takeoff: ");
				System.out.println();
				airField.flyAll();
				System.out.println();
				break;
				
			case 3:
				System.out.println("The fastest jet we have is: ");
				System.out.println();
				airField.fastPlane();
				System.out.println();
				break;
				
			case 4:
				System.out.println("The jet that can fly the furthest on one tank of fuel is: ");
				System.out.println();
				airField.flyLongest();
				System.out.println();
				break;

			case 5:
				System.out.println("Loading all Cargo Jets: ");
				System.out.println();
				airField.shipCargo();
				System.out.println();
				break;

			case 6:
				System.out.println("Boarding all Passenger Jets: ");
				System.out.println();
				airField.passengerPlaneBoard();
				System.out.println();
				break;
				
			case 7:
				System.out.println("Add a new custom Jet: ");
				System.out.println();
				airField.addPlane(kb);
				System.out.println();
				break;

			case 8:
				System.out.println("Which Jet do you want to remove?");
				System.out.println();
				airField.removePlane(kb);
				System.out.println();
				break;
			
			case 9:
				menu = false;
				System.out.println("Thanks for Playing!");
				break;

			default:
				System.out.println("Please enter a valid choice");
			}
		}
	}

}
