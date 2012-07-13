package org.wikipedia.en.fuzzycontrolsystem;

import java.util.Arrays;

import org.wikipedia.en.fuzzycontrolsystem.strategies.BreakPressureAdaptationStrategy;

import com.nicholasvaidyanathan.community.agents.Planner;
import com.nicholasvaidyanathan.community.strategies.Strategy;

public class BrakePressurePlanner extends Planner {

	public BrakePressurePlanner(String heat, String speed) {
		super(new Object[]{ heat, speed} );
	}

	public BrakePressurePlanner(boolean b, Object[] objects) {
		super(b ,objects);
	}

	@Override
	public Strategy plan() {
		Object[] data = this.getData();
		String[] copy = Arrays.copyOf(data, data.length, String[].class);
		return (Strategy) new BreakPressureAdaptationStrategy().evaluate(copy);
	}

}
