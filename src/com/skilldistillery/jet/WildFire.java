package com.skilldistillery.jet;

public class WildFire extends Jets implements Dumpable
{
	String waterBucket;
	
	public WildFire() {
	}
	
	public WildFire(String jetModel, int speed, int range, int price, int fuelCap, String waterBucket) {
		super(jetModel, speed, range, price, fuelCap);
		this.waterBucket = waterBucket;
	}

	public String getWaterBucket()
	{
		return waterBucket;
	}

	public void setWaterBucket(String waterBucket)
	{
		this.waterBucket = waterBucket;
	}

	@Override
	public void jetFly()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void dumpWater()
	{
		System.out.println("Dumping water on fire.");
	}

}
