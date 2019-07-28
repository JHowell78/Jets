package com.skilldistillery.jet;

public abstract class Jets
{
	private String type, jetModel;
	private int range;
	private double speed;
	private long price;

	public Jets() {

	}

	

	public Jets(String type, String jetModel, int range, double speed, long price) {
		super();
		this.type = type;
		this.jetModel = jetModel;
		this.range = range;
		this.speed = speed;
		this.price = price;
	}



	public abstract void jetFly();


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
		builder.append(", Range: ");
		builder.append(range);
		builder.append(", Max Speed: ");
		builder.append(speed);
		builder.append(" MPH, Price: $");
		builder.append(price);
		builder.append(" ");
		return builder.toString();
	}

}
