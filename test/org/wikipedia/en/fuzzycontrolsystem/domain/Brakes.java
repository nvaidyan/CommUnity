package org.wikipedia.en.fuzzycontrolsystem.domain;

import org.wikipedia.en.fuzzycontrolsystem.sensors.BrakeTemperatureSensor;

public class Brakes {
	private BrakeTemperatureSensor sensor;
	private int pressure;
	
	public Brakes(BrakeTemperatureSensor sensor) {
		this.sensor = sensor;
	}

	public Object getTemperature() {
		return sensor.getReading();
	}
	
	public Integer getPressure(){ return pressure; }
	public void setPressure(int pressure){ this.pressure = pressure; }

}
