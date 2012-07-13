package com.nicholasvaidyanathan.community.agents;

import com.nicholasvaidyanathan.community.strategies.Strategy;

public interface Agent {
	public Object act(Object toActOn, Strategy toUse);
}
