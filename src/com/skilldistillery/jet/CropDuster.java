package com.skilldistillery.jet;

public class CropDuster extends Jets implements Sprayable
{
	private boolean sprayTankFull;
	
	public CropDuster(String jetModel, int range, double speed, long price, boolean tankFull) {
		super(jetModel, range, speed, price);
		this.sprayTankFull = tankFull;
	}

	public boolean isTankFull()
	{
		return sprayTankFull;
	}

	public void setTankFull(boolean tankFull)
	{
		this.sprayTankFull = tankFull;
	}

	@Override
	public void dustCrops()
	{
		sprayTankFull = true;
		System.out.println(this.getJetModel() + " is spraying the crop with fertalizer" );
	}

	@Override
	public void jetFly()
	{
		System.out.println(this.getJetModel() + " is flying");
	}
}