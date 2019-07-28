package com.skilldistillery.jet;

public class JetsImpl extends Jets
{
	public JetsImpl() {

	}
	public JetsImpl(String type, String jetModel, int range, double speed, long price) {
		super(type, jetModel, range, speed, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void jetFly()
	{
		System.out.println(this.getJetModel() + " is now flying");
	}

}
