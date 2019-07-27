package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AirField
{
	String file = "planelist.txt";
	List<Jets> planes;

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
					newJet = new PassengerPlane(type, model, range, fuelcap, speed, price, passengersBoarded);
				}

				if (jet[0].equals("Cargo"))
				{
					boolean cargoLoaded = Boolean.parseBoolean(jet[6]);
					newJet = new CargoPlane(type, model, range, fuelcap, speed, price, cargoLoaded);
				}
				if (jet[0].equals("Fighter"))
				{
					boolean weaponsReady = Boolean.parseBoolean(jet[6]);
					newJet = new FighterJet(type, model, range, fuelcap, speed, price, weaponsReady);
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

	public void FlyAll()
	{
		double timeCanFly;
		for (Jets jets : planes)
		{
			System.out.println(jets);
			jets.jetFly();
			String model = jets.getJetModel();
			int range = jets.getRange();
			double speed = jets.getSpeed();
			timeCanFly = range / speed;
			System.out.println(model + ":   ");
			System.out.printf("%.2f", timeCanFly);
			System.out.println(" hours total flight time");
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
	}

	public AirField() {
		planes = new ArrayList<Jets>();
		airStrip(file);
	}

	public void addPlane(Jets plane)
	{
		this.planes.add((Jets) plane);
	}

}
