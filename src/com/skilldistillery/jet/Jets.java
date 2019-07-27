package com.skilldistillery.jet;

public abstract class Jets
{
	private String type, jetModel;
	private int range, fuelCap;
	private double speed;
	private long price;

	public Jets() {

	}

	public Jets(String type, String jetModel, int range, int fuelCap, double speed, long price) {
		super();
		this.type = type;
		this.jetModel = jetModel;
		this.range = range;
		this.fuelCap = fuelCap;
		this.speed = speed;
		this.price = price;
	}

	public abstract void jetFly();

	// show all deets (tostring)
	// time left on flight until empty
	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getJetModel()
	{
		return jetModel;
	}

	public void setJetModel(String jetModel)
	{
		this.jetModel = jetModel;
	}

	public int getRange()
	{
		return range;
	}

	public void setRange(int range)
	{
		this.range = range;
	}

	public int getFuelCap()
	{
		return fuelCap;
	}

	public void setFuelCap(int fuelCap)
	{
		this.fuelCap = fuelCap;
	}

	public double getSpeed()
	{
		return speed;
	}

	public void setSpeed(double speed)
	{
		this.speed = speed;
	}

	public long getPrice()
	{
		return price;
	}

	public void setPrice(long price)
	{
		this.price = price;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Jet Type: ");
		builder.append(type);
		builder.append(", Model: ");
		builder.append(jetModel);
		builder.append(", range: ");
		builder.append(range);
		builder.append(", Fuel Capacity: ");
		builder.append(fuelCap);
		builder.append(", Max Speed: ");
		builder.append(speed);
		builder.append(", Price: ");
		builder.append(price);
		builder.append(" ");
		return builder.toString();
	}

}
