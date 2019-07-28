package com.skilldistillery.jet;

import java.util.Scanner;

public class RunJets
{
	Scanner kb = new Scanner(System.in);
	AirField airField = new AirField();
	
	public static void main(String[] args)
	{
		RunJets run = new RunJets();
		run.test();
	}
	
	public RunJets() {
		
	}
	private void test()
	{
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
	}

}
