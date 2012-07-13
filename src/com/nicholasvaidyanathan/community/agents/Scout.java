package com.nicholasvaidyanathan.community.agents;

import com.nicholasvaidyanathan.community.strategies.Strategy;

public class Scout implements Agent {
	@Override
	public Object act(Object toActOn, Strategy toUse) {
		return get(toActOn, toUse);
	}
	
	public Object get(Object location, Strategy retriever){
		return retriever.evaluate(location);
	}
}
