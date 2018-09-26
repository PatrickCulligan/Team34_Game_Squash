package com.Team34.Squash.starter;

import com.Team34.Squash.Model.Ball;
import com.Team34.Squash.Model.Paddle;
import com.Team34.Squash.View.BallView;
import com.Team34.Squash.View.Observer;
import com.Team34.Squash.View.PaddleView;
import com.Team34.Squash.controller.BallController;
import com.Team34.Squash.controller.PaddleController;

import processing.core.PApplet;

public class TheApp extends PApplet {

	int lives = 5;

	// Paddle Object
	// Model
	private Paddle paddle;

	// View
	private Observer paddleView;

	// Controller

	private PaddleController paddleController;

	// Ball object

	// Model

	private Ball ball;

	// View

	private Observer ballView;

	private BallController ballController;

	// Set the size of the screen
	@Override
	public void settings() {
		size(640, 480);

		paddle.setPaddleY(470);
		paddle.setPaddleWidth(100);
		paddle.setPaddleHeight(10);
		paddle.setPaddleX(width / 2);
		paddle.setPaddleSpeed(10);
		ball.setBallRadius(10);
		ball.setBallX(width / 2);
		ball.setBallY(7 + ball.getBallRadius());
		ball.setDirX((float) 4.9); // set x first then y (convention); I set
									// dirX to 0.9
		ball.setDirY(5);

	}
	
	

	@Override
	public void setup() { // setup() runs once

		rectMode(CENTER);
		frameRate(30);
		paddle = new Paddle();
		paddleController = new PaddleController(paddle);
		paddleView = new PaddleView(this);

		ellipseMode(CENTER);

		ball = new Ball();
		ballController = new BallController(ball);
		ballView = new BallView(this);

	}

	// Update
	@Override
	public void draw() {

		background(0);
		int p = paddle.getPaddle();
		paddleView.update(p);

		int b = ball.getBallRadius();
		ballView.update(b);
		ballController.handleEventMoveBall();
		BallBounce();
		Miss();
		printText();
		

	} // draw() loops forever, until stopped

	void BallBounce() {
		// 1st: general bounce at top, left and right
		if (ball.getBallY() < ball.getBallRadius())
			ball.setDirY(ball.getDirY() * -1);
		if (ball.getBallX() < ball.getBallRadius() || ball.getBallX() > width - ball.getBallRadius())
			ball.setDirX(ball.getDirX() * -1);
		// 2nd: bounce at paddle
		if (ball.getBallY() >= paddle.getPaddleY() - paddle.getPaddleHeight()
				&& ball.getBallX() < paddle.getPaddleX() + (paddle.getPaddleWidth() / 2)
				&& ball.getBallX() > paddle.getPaddleX() - (paddle.getPaddleWidth() / 2)) {
			ball.setDirY(ball.getDirY() * -1);
		}
	}

	void Miss() {
		if (ball.getBallY() > height) {
			// reset
			ball.setBallX(20);
			ball.setBallY(ball.getBallRadius() * 2);
			ball.setDirX((float) 4.9); // set x first then y (convention); I set
										// dirX to 0.9
			ball.setBallY(5);
			lives--;
		}
	}
	
	void printText(){
		

		text ("Lifes: "+lives, width-80, 22);
		
		if (lives==4){
			

			text ("GAME OVER", 480, 222);
			
			background(0);
			
			lives=2;

			text ("New Game:", 480, 222);
			
			
			//background(0);
		}
	}

	// Keypress event moves the paddle left and right with keyboard arrows
	@Override
	public void keyPressed() {

		if (key == CODED) {

			if (keyCode == RIGHT && paddle.getPaddleX() + (paddle.getPaddleWidth() / 2) < width) {

				paddleController.handleEvent();
				// paddleController.handleEventPaddleCon();

			}
			if (keyCode == LEFT && paddle.getPaddleX() - (paddle.getPaddleWidth() / 2) > width - width) {

				paddleController.handleEventMinus();
				// paddleController.handleEventPaddleCon();

			}
		}

	}
}
