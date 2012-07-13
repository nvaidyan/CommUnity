package org.wikipedia.en.fuzzycontrolsystem.strategies;

import org.wikipedia.en.fuzzycontrolsystem.domain.Car;

import com.nicholasvaidyanathan.community.strategies.Strategy;

public class SpeedometerReaderStrategy implements Strategy {

	@Override
	public Object evaluate(Object obj) {
		if(!(obj instanceof Car)){
			return null;
		}
		return ((Car)obj).getSpeed();
	}

}
