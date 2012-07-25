package com.nicholasvaidyanathan.community;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AgentTests {
	Agent aggie;
	Clock clock;
	
	@Before
	public void setup(){
		// Given: The Existence of an Agent
		aggie = new DumbAgent();
		// And: The Existence of a Clock
		clock = new BasicClock();
	}
	
	@Test
	public void testAgentNotifiedWhenClockTicks(){
		// When: An agent watches the clock
		aggie.watch(clock);
		// And:  The clock ticks
		clock.tick();
		// Then: the agent was notified, because it was part of the clock's 
		assertTrue(((DumbAgent)aggie).wasNotified);
	}
	
	@Test
	public void testAgentNotifiedWhenOtherAgentActs(){
		// And: another Agent 
		Agent spy = new DumbAgent();
		// Our Agent watches that agent
		aggie.watch(spy);
		// And: That Agent acts
		spy.act(null, null);
		// Then: Our Agent is notified
		assertTrue(((DumbAgent)aggie).wasNotified);
	}
}
