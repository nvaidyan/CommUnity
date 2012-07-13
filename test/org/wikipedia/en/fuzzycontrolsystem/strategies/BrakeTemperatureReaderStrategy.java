package org.wikipedia.en.fuzzycontrolsystem.strategies;

import org.wikipedia.en.fuzzycontrolsystem.domain.Brakes;

import com.nicholasvaidyanathan.community.strategies.Strategy;


public class BrakeTemperatureReaderStrategy implements Strategy {

	@Override
	public Object evaluate(Object obj) {
		if(!(obj instanceof Brakes))
		{
			return null;
		}
		return ((Brakes)obj).getTemperature();
	}

}
