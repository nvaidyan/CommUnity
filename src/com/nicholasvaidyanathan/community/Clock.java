package com.nicholasvaidyanathan.community;

import com.nicholasvaidyanathan.community.observable.Subject;

public interface Clock extends Subject {

	long getTicks();
	void tick();

}
