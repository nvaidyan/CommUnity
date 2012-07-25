package com.nicholasvaidyanathan.community.roles;

import com.nicholasvaidyanathan.community.Agent;
import com.nicholasvaidyanathan.community.strategies.Strategy;

public abstract class Scout implements Agent {
	@Override
	public Object act(Object toActOn, Strategy toUse) {
		return get(toActOn, toUse);
	}
	
	public Object get(Object location, Strategy retriever){
		return retriever.evaluate(location);
	}
}
