package org.wikipedia.en.fuzzycontrolsystem;

import com.nicholasvaidyanathan.community.Agent;
import com.nicholasvaidyanathan.community.Clock;
import com.nicholasvaidyanathan.community.observable.Observable;
import com.nicholasvaidyanathan.community.observable.Observer;
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

	@Override
	public void watch(Agent toSpy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservers(Object dataTheyCareAbout) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int countObservers() {
		// TODO Auto-generated method stub
		return 0;
	}
}
