package com.skilldistillery.jet;

public class WildFire extends Jets implements Dumpable
{
	String waterBucket;
	
	public WildFire() {
	}
	
	

	public WildFire(String type, String jetModel, int range, int fuelCap, double speed, long price,
			String waterBucket) {
		super(type, jetModel, range, fuelCap, speed, price);
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
