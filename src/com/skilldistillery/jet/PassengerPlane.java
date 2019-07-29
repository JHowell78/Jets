package com.skilldistillery.jet;

import java.io.IOException;
import java.nio.CharBuffer;

public class PassengerPlane extends Jets implements Rideable
{
	private boolean passengersBoarded;

	public boolean isPassengersBoarded()
	{
		return passengersBoarded;
	}

	public PassengerPlane() {
	}

	
	public void setPassengersBoarded(boolean passengersBoarded)
	{
		this.passengersBoarded = passengersBoarded;
	}

	

	public PassengerPlane(String jetModel, int range, double speed, long price,
			boolean passengersBoarded) {
		super(jetModel, range, speed, price);
		this.passengersBoarded = passengersBoarded;
	}

	@Override
	public void jetFly()
	{
		System.out.println(this.getJetModel() + " is now in flight.");
	}

	@Override
	public void boardPlane()
	{
		passengersBoarded = true;
		System.out.println("Passengers on " + this.getJetModel() + " prepare for take off.");
		
	}

}
