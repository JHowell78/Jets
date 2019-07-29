package com.skilldistillery.jet;

public abstract class Jets
{
	private String  jetModel;
	private int range;
	private double speed;
	private long price;

	public Jets() {

	}
	public abstract void jetFly();

	public Jets(String jetModel, int range, double speed, long price) {
		super();
		this.jetModel = jetModel;
		this.range = range;
		this.speed = speed;
		this.price = price;
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
		builder.append("Model: ");
		builder.append(jetModel);
		builder.append(", Range: ");
		builder.append(range);
		builder.append(" miles, Max Speed: ");
		builder.append(speed);
		builder.append(" MPH, Price: $");
		builder.append(price);
		builder.append(" ");
		return builder.toString();
	}

}
