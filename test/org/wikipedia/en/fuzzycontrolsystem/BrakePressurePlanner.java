package org.wikipedia.en.fuzzycontrolsystem;

import com.nicholasvaidyanathan.community.agents.Planner;

public class BrakePressurePlanner extends Planner {

	
	public BrakePressurePlanner(String heat, String speed) {
		super(new Object[]{ heat, speed} );
	}

	public BrakePressurePlanner(boolean b, Object[] objects) {
		super(b ,objects);
	}

	@Override
	protected void setData(Object... objects) {
		if(	objects.length != 2 && 
				!(objects[0] instanceof String) && 
				!(objects[1] instanceof String) ){
				throw new UnsupportedOperationException("Should be called with two strings");
			}
			this.data = objects;
	}
}
