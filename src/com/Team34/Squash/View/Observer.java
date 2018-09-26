package com.Team34.Squash.View;


import processing.core.PApplet;

public abstract class Observer {
	protected PApplet display;	
	
	public Observer(PApplet display) {
		this.display = display;
		//subject.attach(this);
	}
	
	public abstract void update(Object value);
}
