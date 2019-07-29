package com.skilldistillery.jet;

public class CargoPlane extends Jets implements Shippable
{
	private boolean cargoLoaded = true;
	public boolean isCargoLoaded()
	{
		return cargoLoaded;
	}
	public CargoPlane()
	{
	}

	public void setCargoLoaded(boolean cargoLoaded)
	{
		this.cargoLoaded = cargoLoaded;
	}
	
	public CargoPlane(String jetModel, int range, double speed, long price, boolean cargoLoaded) {
		super(jetModel, range, speed, price);
		this.cargoLoaded = cargoLoaded;
	}
	@Override
	public void addCargo()
	{
		cargoLoaded = true;
		System.out.println("Loading boxes on " + this.getJetModel());
		System.out.println("Ready for takeoff");
	}

	@Override
	public void jetFly()
	{
		System.out.println(this.getJetModel() + " is now in flight.");
	}

}
