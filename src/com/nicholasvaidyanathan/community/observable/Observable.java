package com.nicholasvaidyanathan.community.observable;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Observable implements Subject {
	private Collection<Observer> observers;
	
	protected Observable(){
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o){
		if(observers != null){
			observers.add(o);
		}
	}
	
	@Override
	public void removeObserver(Observer o){
		if(observers != null){
			observers.remove(o);
		}
	}
	
	@Override
	public void notifyObservers(){
		notifyObservers(null);
	}
	
	@Override
	public void notifyObservers(Object data){
		for(Observer o : observers){
			o.update(this, data);
		}
	}
}
