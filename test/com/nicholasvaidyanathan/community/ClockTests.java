package com.nicholasvaidyanathan.community;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClockTests {

	@Test
	public void testClockTicks() {
		// Given: The Existence of a Clock
		Clock clock = new BasicClock();
		// And: The clock begins at 0
		assertEquals(0, clock.getTicks());
		// When: the clock ticks
		clock.tick();
		// Then: the arrow of time advances
		assertEquals(1, clock.getTicks());
	}

}
