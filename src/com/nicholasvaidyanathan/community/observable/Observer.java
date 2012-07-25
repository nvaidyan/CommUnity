package com.nicholasvaidyanathan.community.observable;

public interface Observer {
	public void update(Observable obs, Object dataInterestedIn);
}
