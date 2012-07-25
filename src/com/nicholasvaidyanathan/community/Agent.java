package com.nicholasvaidyanathan.community;

import com.nicholasvaidyanathan.community.observable.Observer;
import com.nicholasvaidyanathan.community.strategies.Strategy;

public interface Agent extends Observer {
	public Object act(Object toActOn, Strategy toUse);
	public void watch(Clock clock);
}
