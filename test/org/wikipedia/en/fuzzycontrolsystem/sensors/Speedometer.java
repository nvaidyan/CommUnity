package org.wikipedia.en.fuzzycontrolsystem.sensors;

import com.nicholasvaidyanathan.community.sensors.Sensor;

public class Speedometer implements Sensor {

	private int value;
	
	public Speedometer(int val){
		value = val;
	}
	
	@Override
	public Object getReading() {
		return value;
	}

}
