package com.skilldistillery.jet;

public abstract class Jets
{
	private String jetModel;
	private int speed, range, price, fuelCap;
	
	public Jets() {
		
	}
	public Jets(String jetModel, int speed, int range, int price, int fuelCap) {
		super();
		this.jetModel = jetModel;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.fuelCap = fuelCap;
	}
	public abstract void jetFly(); 
	//show all deets (tostring) 
	//time left on flight until empty
	
	
	
	public String getJetModel()
	{
		return jetModel;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Jets [jetModel=");
		builder.append(jetModel);
		builder.append(", speed=");
		builder.append(speed);
		builder.append(", range=");
		builder.append(range);
		builder.append(", price=");
		builder.append(price);
		builder.append(", fuelCap=");
		builder.append(fuelCap);
		builder.append("]");
		return builder.toString();
	}
	public void setJetModel(String jetModel)
	{
		this.jetModel = jetModel;
	}

	public int getSpeed()
	{
		return speed;
	}

	public void setSpeed(int speed)
	{
		this.speed = speed;
	}

	public int getRange()
	{
		return range;
	}

	public void setRange(int range)
	{
		this.range = range;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public int getFuelCap()
	{
		return fuelCap;
	}

	public void setFuelCap(int fuelCap)
	{
		this.fuelCap = fuelCap;
	}
	

	// constructor
	//toString
	//getSet
	
	
}
