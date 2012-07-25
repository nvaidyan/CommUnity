package com.nicholasvaidyanathan.community;

import com.nicholasvaidyanathan.community.observable.Observable;
import com.nicholasvaidyanathan.community.strategies.Strategy;

public class DumbAgent implements Agent {
	public boolean wasNotified = false;
	
	@Override
	public Object act(Object toActOn, Strategy toUse) {
		wasNotified = true;
		return this;
	}

	@Override
	public void watch(Clock clock) {
		clock.registerObserver(this);
	}

	@Override
	public void update(Observable obs, Object dataInterestedIn) {
		act(dataInterestedIn, null);
	}

}
