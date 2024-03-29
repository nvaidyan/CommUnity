package com.nicholasvaidyanathan.community.roles;

import java.util.Arrays;

import com.nicholasvaidyanathan.community.Agent;
import com.nicholasvaidyanathan.community.strategies.Strategy;

public abstract class Planner implements Agent {
	protected Object[] data;
	
	public Planner(Object...objects) {
		setData(objects);
	}
	
	protected abstract void setData(Object...objects);
	
	public Object[] getData() { return Arrays.copyOf(data, data.length, Object[].class); }

	@Override
	public Object act(Object toActOn, Strategy toUse) {
		return plan(toActOn, toUse);
	}
	
	public Object plan(Object toActOn, Strategy toUse){
		return toUse.evaluate(toActOn);
	}
}
