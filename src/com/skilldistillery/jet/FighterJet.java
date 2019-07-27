package com.skilldistillery.jet;

public class FighterJet extends Jets implements Fightable
{
	boolean weaponsReady;
	
	public FighterJet(String jetModel, int speed, int range, int price, int fuelCap, boolean weaponsReady) {
		super(jetModel, speed, range, price, fuelCap);
		this.weaponsReady = weaponsReady;
	}
	@Override
	public void jetFly()
	{
	}
	public FighterJet() {
		
	}

	@Override
	public void dogFight()
	{
		System.out.println("BANG BANG BANG BOOM!!!");
	}
	public boolean isWeaponsReady()
	{
		return weaponsReady;
	}
	public void setWeaponsReady(boolean weaponsReady)
	{
		this.weaponsReady = weaponsReady;
	}
	

}
