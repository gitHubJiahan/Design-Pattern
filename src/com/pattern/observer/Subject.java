package com.pattern.observer;

/*
 *  Subject Ö÷Ìâ
 */

public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();

}
