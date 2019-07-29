package com.skilldistillery.jet;

public class JetsImpl extends Jets
{
	public JetsImpl() {

	}
	public JetsImpl(String jetModel, int range, double speed, long price) {
		super(jetModel, range, speed, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void jetFly()
	{
		System.out.println(this.getJetModel() + " is now flying");
	}

}
