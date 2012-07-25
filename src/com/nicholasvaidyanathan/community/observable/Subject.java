package com.nicholasvaidyanathan.community.observable;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
	public void notifyObservers(Object dataTheyCareAbout);
	public int countObservers();
}
