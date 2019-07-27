package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JetsAppRun
{
	Scanner kb = new Scanner(System.in);
	AirField airField = new AirField();

	public static void main(String[] args)
	{
		JetsAppRun play = new JetsAppRun();
//		play.readTxtFile(play);
		play.menu();

	}
	public JetsAppRun() {

	}

	public void menu()
	{
		boolean choice = true;
		int playerChoice = kb.nextInt();
		
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


		while (choice = true)
		{
			switch (playerChoice)
			{
			case 1:
				System.out.println("All available jets:");
				System.out.println();
				airField.showJets();
				break;
			case 2:
				System.out.println("All Jets to the Runway!");
				System.out.println();
				airField.FlyAll();
//			AirField.flyAll();  //may need seperate method using foreach loop from arraylist

				break;
			case 3:
				System.out.println("The fastest jet we have is: ");
				airField.fastPlane();
				// get fastest jet by speed

				break;
			case 4:
				System.out.println("The jet that can fly the furthest on one tank of fuel is: ");
				// get longest range

				break;
			case 5:
				System.out.println("Time to ship out the next order");
//			addCargo();  may need seperate method using foreach loop from arraylist

				break;
			case 6:
				System.out.println("Boarding now:");
				// boardPlane(); may need seperate method using foreach loop from arraylist

				break;
			case 7:
				System.out.println("Add a new Jet: ");
				// jet.add to arrayLi
				JetsImpl a = new JetsImpl();

				break;
			case 8:
				System.out.println("Which Jet do you want to remove?");
				// jet.remove from arraylist
				break;
			case 9:
				System.out.println("Thanks for Playing!");
				choice = false;
				break;

			default:
				System.out.println("Please enter a valid choice");
				menu();
			}
			break;
		}
	}

	

//	public void readTxtFile(JetsAppRun app) 

}
