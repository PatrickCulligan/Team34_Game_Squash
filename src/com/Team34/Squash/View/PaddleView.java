package com.Team34.Squash.View;

import com.Team34.Squash.Model.Paddle;

import processing.core.PApplet;

public class PaddleView extends Observer {


	public PaddleView(PApplet display) {
		super(display);
		update(0);
	}
	
	
	
// Try catch added as incorrect values could be passed to method
	public void update(Object value) {
		try {
			float x = (int) value;
			display.fill(101);
			display.rect(x, Paddle.getPaddleY(), Paddle.getPaddleWidth(), Paddle.getPaddleHeight());
			display.redraw();
			
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
	}
}
