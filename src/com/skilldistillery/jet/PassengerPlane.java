package com.skilldistillery.jet;

import java.io.IOException;
import java.nio.CharBuffer;

public class PassengerPlane extends Jets implements Rideable
{
	boolean passengersBoarded;

	public PassengerPlane() {
	}
	
	public PassengerPlane(String jetModel, int speed, int range, int price, int fuelCap, boolean passengersBoarded) {
		super(jetModel, speed, range, price, fuelCap);
		this.passengersBoarded = passengersBoarded;
	}



	public boolean isPassengersBoarded()
	{
		return passengersBoarded;
	}

	public void setPassengersBoarded(boolean passengersBoarded)
	{
		this.passengersBoarded = passengersBoarded;
	}

	@Override
	public void jetFly()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void boardPlane()
	{
		System.out.println("Enjoy your flight");
	}

}
