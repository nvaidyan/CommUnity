package org.wikipedia.en.fuzzycontrolsystem.domain;

import org.wikipedia.en.fuzzycontrolsystem.sensors.Speedometer;

public class Car {
	private Speedometer speedometer;
	private Brakes brakes;
	
	public Car(Brakes dems, Speedometer flashGordon) {
		speedometer = flashGordon;
		this.brakes = dems;
	}

	public void decreaseBrakePressure(String string) {
		if(string.equals("slightly")){
			brakes.setPressure(-5);
		}
		
	}

	public Object getSpeed() {
		return speedometer.getReading();
	}

	public Object getBrakePressure() {
		return brakes.getPressure();
	}
}
