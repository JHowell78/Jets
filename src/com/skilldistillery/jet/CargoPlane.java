package com.skilldistillery.jet;

public class CargoPlane extends Jets implements Shippable
{
	private boolean cargoLoaded;
	
	public boolean isCargoLoaded()
	{
		return cargoLoaded;
	}
	public CargoPlane()
	{
	}

	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
//		builder.append("CargoPlane [cargoLoaded=");
//		builder.append(cargoLoaded);
//		builder.append("]");
		return builder.toString();
	}
	public void setCargoLoaded(boolean cargoLoaded)
	{
		this.cargoLoaded = cargoLoaded;
	}
	
	public CargoPlane(String type, String jetModel, int range, double speed, long price, boolean cargoLoaded) {
		super(type, jetModel, range, speed, price);
		this.cargoLoaded = cargoLoaded;
	}

	
	@Override
	public void addCargo()
	{
		cargoLoaded = true;
		System.out.println("Loading boxes on " + this.getJetModel() + " prepare for takeoff");
	}

	@Override
	public void jetFly()
	{
		System.out.println(this.getJetModel() + " is now in flight.");
	}

}
