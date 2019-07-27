package com.skilldistillery.jet;

public class CargoPlane extends Jets implements Shippable
{
	boolean cargoLoaded;
	
	public CargoPlane()
	{
	}

	public CargoPlane(String jetModel, int speed, int range, int price, int fuelCap, boolean cargoLoaded) {
		super(jetModel, speed, range, price, fuelCap);
		this.cargoLoaded = cargoLoaded;
	}



	public boolean isCargoLoaded()
	{
		return cargoLoaded;
	}

	public void setCargoLoaded(boolean cargoLoaded)
	{
		this.cargoLoaded = cargoLoaded;
	}

	@Override
	public void addCargo()
	{
		System.out.println("Loading boxes now.");
	}

	@Override
	public void jetFly()
	{
		// TODO Auto-generated method stub
		
	}

}
