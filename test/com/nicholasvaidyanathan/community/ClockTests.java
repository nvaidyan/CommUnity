package com.nicholasvaidyanathan.community;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ClockTests {
	Clock clock;
	
	@Before
	public void setup(){
		// Given: The Existence of a Clock
		clock = new BasicClock();
	}
	
	@Test
	public void testClockTicks() {
		// And: The clock begins at 0
		assertEquals(0, clock.getTicks());
		// When: the clock ticks
		clock.tick();
		// Then: the arrow of time advances
		assertEquals(1, clock.getTicks());
	}
}
