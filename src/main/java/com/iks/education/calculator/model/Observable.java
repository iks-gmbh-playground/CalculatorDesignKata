package com.iks.education.calculator.model;

public interface Observable {

	public void register(Observer obs);
	
	public void unregister(Observer obs);
}


