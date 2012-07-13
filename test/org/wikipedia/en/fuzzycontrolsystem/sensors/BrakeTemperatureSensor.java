package org.wikipedia.en.fuzzycontrolsystem.sensors;

import com.nicholasvaidyanathan.community.sensors.Sensor;

public class BrakeTemperatureSensor implements Sensor {
	private int value;
	
	public BrakeTemperatureSensor(int i) {
		value = i;
	}

	public Object getReading() {
		return value;
	}

}
