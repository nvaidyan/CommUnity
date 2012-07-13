package org.wikipedia.en.fuzzycontrolsystem.strategies;

import org.wikipedia.en.fuzzycontrolsystem.domain.Car;

import com.nicholasvaidyanathan.community.strategies.Strategy;

public class DecreaseBrakePressureStrategy implements Strategy {

	@Override
	public Object evaluate(Object obj) {
		Car candidate;
		if(!(obj instanceof Car)){
			return null;
		}
		candidate = (Car) obj;
		candidate.decreaseBrakePressure("slightly");
		return candidate;
	}

}
