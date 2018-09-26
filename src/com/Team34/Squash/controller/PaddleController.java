package com.Team34.Squash.controller;

import com.Team34.Squash.Model.Paddle;

public class PaddleController {

	Paddle paddle;

	public PaddleController(Paddle paddle) {
		this.paddle = paddle;
	}

	public void handleEvent() {

		paddle.updateCount();

	}

	public void handleEventMinus() {

		paddle.updateCountMinus();
	}

	/*public void handleEventPaddleCon() {

		paddle.paddleConstriant();
		
	}*/

}
