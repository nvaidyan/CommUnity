package org.wikipedia.en.fuzzycontrolsystem.strategies;

import java.util.Arrays;

import com.nicholasvaidyanathan.community.agents.Planner;
import com.nicholasvaidyanathan.community.strategies.Strategy;

public class PlanningStrategy implements Strategy {
	@Override
	public Object evaluate(Object obj) {
		if(!(obj instanceof Planner)){
			return null;
		}
		Planner p = (Planner) obj;
		Object[] data = p.getData();
		return new BrakePressureAdaptationStrategy().evaluate(Arrays.copyOf(data, data.length, String[].class));
	}
}
