package com.nicholasvaidyanathan.community;

import com.nicholasvaidyanathan.community.observable.Observable;

public class BasicClock extends Observable implements Clock {
	private long ticks;
	@Override
	public long getTicks() {
		return ticks;
	}

	@Override
	public void tick() {
		ticks++;
		notifyObservers();
	}
}
