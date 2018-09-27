package com.Team34.Squash.controller;

import com.Team34.Squash.Model.Paddle;

public class PaddleController {

	// create paddle objects
	Paddle paddle;

	// create constructor and pass it papplet
	public PaddleController(Paddle paddle) {
		this.paddle = paddle;
	}

	// update paddle right move
	public void handleEvent() {

		paddle.updateCount();

	}

	// update paddle left move
	public void handleEventMinus() {

		paddle.updateCountMinus();
	}

	/*
	 * public void handleEventPaddleCon() {
	 * 
	 * paddle.paddleConstriant();
	 * 
	 * }
	 */

}
