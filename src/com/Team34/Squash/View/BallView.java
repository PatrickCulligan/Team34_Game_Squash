package com.Team34.Squash.View;

import com.Team34.Squash.Model.Ball;

import processing.core.PApplet;

//create class and extend with observer
public class BallView extends Observer {

	// contsructor with applet object
	public BallView(PApplet display) {
		super(display);
		update(0);
	}

	// Try catch added as incorrect values could be passed to method
	// update vaules in view and pass to app
	public void update(Object value) {
		try {

			// display.background(404);
			display.fill(255, 0, 0);
			display.ellipse(Ball.getBallX(), Ball.getBallY(), Ball.getBallRadius() * 2, Ball.getBallRadius() * 2);
			display.redraw();

		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
	}

}
