package com.nicholasvaidyanathan.community.roles;

import com.nicholasvaidyanathan.community.Agent;
import com.nicholasvaidyanathan.community.strategies.Strategy;

public abstract class Analyst implements Agent {
	@Override
	public Object act(Object toActOn, Strategy toUse) {
		return analyze(toActOn, toUse);
	}
	
	public Object analyze(Object toAnalyze, Strategy analysisStrategy){
		return analysisStrategy.evaluate(toAnalyze);
	}
}
