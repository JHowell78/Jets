package com.skilldistillery.jet;

public class CropDuster extends Jets implements Sprayable
{
	private boolean tankFull;
	
	
	

	public CropDuster(String type, String jetModel, int range, double speed, long price, boolean tankFull) {
		super(type, jetModel, range, speed, price);
		this.tankFull = tankFull;
	}

	public boolean isTankFull()
	{
		return tankFull;
	}

	public void setTankFull(boolean tankFull)
	{
		this.tankFull = tankFull;
	}

	@Override
	public void dustCrops()
	{
		tankFull = true;
		System.out.println(this.getJetModel() + " is spraying the crop with fertalizer" );
	}

	@Override
	public void jetFly()
	{
		System.out.println(this.getJetModel() + " is flying");
	}
}