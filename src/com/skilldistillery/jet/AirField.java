package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField
{
	String file = "planelist.txt";
	List<Jets> planes;

	public AirField() {
		planes = new ArrayList<Jets>();
		airStrip(file);
	}

	private List<Jets> airStrip(String file)
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("planelist.txt"));
			String jetlist;
			while ((jetlist = br.readLine()) != null)
			{
				Jets newJet = null;
				String[] jet = jetlist.split(", ");
				String type = jet[0];
				String model = jet[1];
				double speed = Double.parseDouble(jet[2]);
				int range = Integer.parseInt(jet[3]);
				long price = Long.parseLong(jet[4]);
				int fuelcap = Integer.parseInt(jet[5]);

				if (jet[0].equals("Passenger"))
				{
					boolean passengersBoarded = Boolean.parseBoolean(jet[6]);
					newJet = new PassengerPlane(model, range, speed, price, passengersBoarded);
				}

				if (jet[0].equals("Cargo"))
				{
					boolean cargoLoaded = Boolean.parseBoolean(jet[6]);
					newJet = new CargoPlane(model, range, speed, price, cargoLoaded);
				}
				if (jet[0].equals("Fighter"))
				{
					boolean weaponsReady = Boolean.parseBoolean(jet[6]);
					newJet = new FighterJet(model, range, speed, price, weaponsReady);
				}
				if (jet[0].equals("Crop Duster"))
				{
					boolean tankFull = Boolean.parseBoolean(jet[6]);
					newJet = new CropDuster(model, range, speed, price, tankFull);
				}
				planes.add(newJet);
			}
		} catch (Exception e)
		{
		}
		return planes;
	}

	public void showJets()
	{
		for (Jets jets : planes)
		{
			System.out.println(jets);
		}

	}

	public void flyAll()
	{
		double timeCanFly;
		for (Jets jets : planes)
		{
			jets.jetFly();
			String model = jets.getJetModel();
			System.out.println(jets);
			int range = jets.getRange();
			double speed = jets.getSpeed();
			timeCanFly = range / speed;
			System.out.println(model + " can fly:   ");
			System.out.printf("%.2f", timeCanFly);
			System.out.println(" hours of flight time until out of fuel");
			System.out.println();
		}
	}

	public void fastPlane()
	{
		Jets fastPlane = null;
		double fastest = 0;
		for (Jets jets : planes)
		{
			if (fastest < jets.getSpeed())
			{
				fastest = jets.getSpeed();
				fastPlane = jets;
			}
		}
		System.out.println(fastPlane.getJetModel() + " " + fastest + " mph ");
		System.out.println();
		System.out.println(fastPlane.toString());
	}

	public void flyLongest()
	{
		Jets flyLong = null;
		int longestRange = 0;
		for (Jets jets : planes)
		{
			if (longestRange < jets.getRange())
			{
				longestRange = jets.getRange();
				flyLong = jets;
			}

		}
		System.out.println(flyLong.getJetModel() + " has a range of  " + longestRange + " miles");
		System.out.println();
		System.out.println(flyLong.toString());
	}

	public void shipCargo()
	{
		for (Jets jets : planes)
		{
			if (jets instanceof CargoPlane)
			{
				((CargoPlane) jets).addCargo();
			}
		}
	}

	public void passengerPlaneBoard()
	{
		for (Jets jets : planes)
		{
			if (jets instanceof PassengerPlane)
			{
				((PassengerPlane) jets).boardPlane();
			}
		}
	}

	public void addPlane(Scanner kb)
	{
		Jets newJet = null;

		System.out.println("Please enter the model of your plane: ");
		String model = kb.next();
		System.out.println("Now enter the top speed of your plane in MPH: ");
		double speed = kb.nextDouble();
		System.out.println("Next enter the maximum range in miles of your plane: ");
		int range = kb.nextInt();
		System.out.println("Finally enter the price in US dollars of your plane: ");
		long price = kb.nextLong();

		newJet = new JetsImpl(model, range, speed, price);
		planes.add(newJet);
		System.out.println();
		System.out.println("Your new jet info: " + newJet);
		System.out.println();
		System.out.println("New Jet Inventory: ");
		System.out.println();
		showJets();
	}

	public void removePlane(Scanner kb)
	{
		System.out.println("Please choose the corresponding number to remove a plane: ");
		for (int i = 0; i < planes.size(); i++)
		{
			System.out.println((i + 1) + ": " + planes.get(i).getJetModel());
		}
		int removeChoice = kb.nextInt();
		planes.remove(removeChoice - 1);
		System.out.println("Planes left in Air Field: ");
		System.out.println();
		showJets();
	}

}
