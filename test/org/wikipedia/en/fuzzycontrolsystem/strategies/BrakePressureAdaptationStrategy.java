package org.wikipedia.en.fuzzycontrolsystem.strategies;

import com.nicholasvaidyanathan.community.strategies.Strategy;

public class BrakePressureAdaptationStrategy implements Strategy {

	@Override
	public Object evaluate(Object obj) {
		
		if(!(obj instanceof String[])){
			return null;
		}
		String[] data = (String[])obj;
		return determineAction(data[0], data[1]);
	}
	
	private Strategy determineAction(String heatResult, String speedResult) {
		if(heatResult.equals("warm") && speedResult.equals("not very fast")){
			return new DecreaseBrakePressureStrategy();
		}
		return new NoPressureChangeStrategy();
	}

}
