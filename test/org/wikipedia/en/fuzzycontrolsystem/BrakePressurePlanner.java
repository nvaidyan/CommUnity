package org.wikipedia.en.fuzzycontrolsystem;

import com.nicholasvaidyanathan.community.Clock;
import com.nicholasvaidyanathan.community.observable.Observable;
import com.nicholasvaidyanathan.community.roles.Planner;

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

	@Override
	public void watch(Clock clock) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Observable obs, Object dataInterestedIn) {
		// TODO Auto-generated method stub
		
	}
}
