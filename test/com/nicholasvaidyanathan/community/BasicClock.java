package com.nicholasvaidyanathan.community;

public class BasicClock implements Clock {
	private long ticks;
	@Override
	public long getTicks() {
		return ticks;
	}

	@Override
	public void tick() {
		ticks++;
	}

}
