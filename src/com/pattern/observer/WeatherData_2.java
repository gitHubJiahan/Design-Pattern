package com.pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class WeatherData_2 extends Observable {

	@Override
	public synchronized void addObserver(Observer o) {
		// TODO Auto-generated method stub
		super.addObserver(o);
	}

	@Override
	protected synchronized void clearChanged() {
		// TODO Auto-generated method stub
		super.clearChanged();
	}

	@Override
	public synchronized int countObservers() {
		// TODO Auto-generated method stub
		return super.countObservers();
	}

	@Override
	public synchronized void deleteObserver(Observer o) {
		// TODO Auto-generated method stub
		super.deleteObserver(o);
	}

	@Override
	public synchronized void deleteObservers() {
		// TODO Auto-generated method stub
		super.deleteObservers();
	}

	@Override
	public synchronized boolean hasChanged() {
		// TODO Auto-generated method stub
		return super.hasChanged();
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		super.notifyObservers();
	}

	@Override
	public void notifyObservers(Object arg) {
		// TODO Auto-generated method stub
		super.notifyObservers(arg);
	}

	@Override
	protected synchronized void setChanged() {
		// TODO Auto-generated method stub
		super.setChanged();
	}
	
	

}
