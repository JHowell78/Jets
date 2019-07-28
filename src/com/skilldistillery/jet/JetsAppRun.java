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
		

			System.out.println("Welcome to Jet Simulator 9000");
			System.out.println("Please choose one of the following: ");
			System.out.println();
			System.out.println("1. List Fleet");
			System.out.println("2. Fly all Jets");
			System.out.println("3. View the Fastest Jest");
			System.out.println("4. View Jet with the longest range");
			System.out.println("5. Load all Cargo Planes");
			System.out.println("6. Board all Passenger Planes");
			System.out.println("7. Add a new Jet");
			System.out.println("8. Remove a Jet");
			System.out.println("9. Quit");

			int playerChoice = kb.nextInt();
			switch (playerChoice)
			{
			case 1:
				System.out.println("All available jets:");
				System.out.println();
				airField.showJets();
				System.out.println();
				menu();
				break;
			case 2:
				System.out.println("All Jets to the Runway!");
				System.out.println();
				airField.flyAll();
				System.out.println();
				menu();

				break;
			case 3:
				System.out.println("The fastest jet we have is: ");
				System.out.println();
				airField.fastPlane();
				System.out.println();
				menu();

				break;
			case 4:
				System.out.println("The jet that can fly the furthest on one tank of fuel is: ");
				System.out.println();
				airField.flyLongest();
				System.out.println();
				menu();

				break;
			case 5:
				System.out.println("Cargo Planes: ");
				airField.shipCargo();
				System.out.println();
				menu();

				break;
			case 6:
				System.out.println("All passengers prepare for boarding: ");
				System.out.println();
				airField.passengerPlaneBoard();
				System.out.println();
				menu();

				break;
			case 7:
				System.out.println("Add a new Jet: ");
				airField.addPlane(kb);
				System.out.println();
				menu();
				break;
			case 8:
				System.out.println("Which Jet do you want to remove?");
				// jet.remove from arraylist
				System.out.println();
				menu();
				break;
			case 9:
				System.out.println("Thanks for Playing!");
				break;

			default:
				System.out.println("Please enter a valid choice");
				System.out.println();
				menu();
				break;
			}
//			} while (playerChoice != 9);
	}

}
