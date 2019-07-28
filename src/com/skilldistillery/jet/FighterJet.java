package com.skilldistillery.jet;

public class FighterJet extends Jets implements Fightable
{
	private boolean weaponsReady;

	public FighterJet(String type, String jetModel, int range, double speed, long price, boolean weaponsReady) {
		super(type, jetModel, range, speed, price);
		this.weaponsReady = weaponsReady;
	}

	@Override
	public void jetFly()
	{
		System.out.println(this.getJetModel() + " is now in flight and ready for action");
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

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
//		builder.append("FighterJet [weaponsReady=");
//		builder.append(weaponsReady);
//		builder.append("]");
		return builder.toString();
	}

}
