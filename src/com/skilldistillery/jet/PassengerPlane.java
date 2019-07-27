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

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("PassengerPlane [passengersBoarded=");
		builder.append(passengersBoarded);
		builder.append("]");
		return builder.toString();
	}

	public void setPassengersBoarded(boolean passengersBoarded)
	{
		this.passengersBoarded = passengersBoarded;
	}

	public PassengerPlane(String type, String jetModel, int range, int fuelCap, double speed, long price,
			boolean passengersBoarded) {
		super(type, jetModel, range, fuelCap, speed, price);
		this.passengersBoarded = passengersBoarded;
	}

	@Override
	public void jetFly()
	{
		System.out.println("Passnger Plane is now in flight.");
	}

	@Override
	public void boardPlane()
	{
		System.out.println("Enjoy your flight");
	}

}
