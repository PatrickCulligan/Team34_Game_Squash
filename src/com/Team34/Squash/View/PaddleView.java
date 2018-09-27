package com.Team34.Squash.View;

import com.Team34.Squash.Model.Paddle;

import processing.core.PApplet;

//create class and extend with observer
public class PaddleView extends Observer {

	// create construstor and pass papplet
	public PaddleView(PApplet display) {
		super(display);
		update(0);
	}

	// Try catch added as incorrect values could be passed to method

	// Try catch added as incorrect values could be passed to method
	// update vaules in view and pass to app
	public void update(Object value) {
		try {
			float x = (int) value;
			display.fill(155);
			display.rect(x, Paddle.getPaddleY(), Paddle.getPaddleWidth(), Paddle.getPaddleHeight());
			display.redraw();

		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
	}
}
