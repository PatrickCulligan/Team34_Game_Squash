package com.Team34.Squash.controller;

import com.Team34.Squash.Model.Ball;

public class BallController {

	// create ball object
	Ball ball;

	// create constructor
	public BallController(Ball ball) {
		this.ball = ball;
	}

	// ball movement
	public void handleEventMoveBall() {

		ball.BallMovement();

	}

}
