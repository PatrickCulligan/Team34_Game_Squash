package com.Team34.Squash.controller;

import com.Team34.Squash.Model.Ball;


public class BallController {
	
	
	Ball ball;

	public BallController(Ball ball) {
		this.ball = ball;
	}

	public void handleEventMoveBall() {

		ball.BallMovement();

	}

	/*public void handleEventBallBounce() {

		ball.BallMovement();
	
	}*/

	/*public void handleEventPaddleCon() {

		paddle.paddleConstriant();
		
	}*/

}
