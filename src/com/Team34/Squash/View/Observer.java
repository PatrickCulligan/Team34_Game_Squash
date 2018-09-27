package com.Team34.Squash.View;

import processing.core.PApplet;

public abstract class Observer {

	// create an object of the papplet
	protected PApplet display;

	// pass papplet to observer condtructor
	public Observer(PApplet display) {
		this.display = display;
		// subject.attach(this);
	}

	// update view with values form model
	public abstract void update(Object value);
}
