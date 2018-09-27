package com.Team34.Squash.starter;

//import packages
import com.Team34.Squash.Model.Ball;
import com.Team34.Squash.Model.Paddle;
import com.Team34.Squash.View.BallView;
import com.Team34.Squash.View.Observer;
import com.Team34.Squash.View.PaddleView;
import com.Team34.Squash.controller.BallController;
import com.Team34.Squash.controller.PaddleController;
import processing.core.PApplet;

//declare main app that extends PApplet
public class TheApp extends PApplet {

	// Set players lifes t o3
	int score = 3;
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
	// ball controller
	private BallController ballController;

	// Set game parameters
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
		ball.setBallY(9 + ball.getBallRadius());
		ball.setDirX((float) 9.0);
		ball.setDirY(5);

	}

	// Set up at run time
	@Override
	public void setup() { // setup() runs once
		// paddle objects
		rectMode(CENTER);
		frameRate(30);
		paddle = new Paddle();
		paddleController = new PaddleController(paddle);
		paddleView = new PaddleView(this);
		// ball objects
		ellipseMode(CENTER);
		ball = new Ball();
		ballController = new BallController(ball);
		ballView = new BallView(this);

	}

	// Start game and while the users score is greater than 0 continue to play
	// end game when the reach 0
	// Press enter to restart the game
	@Override
	public void draw() {

		if (score > 0 || keyCode == ENTER) {

			background(255);
			int p = paddle.getPaddle();
			paddleView.update(p);
			int b = ball.getBallRadius();
			ballView.update(b);
			ballController.handleEventMoveBall();
			ballBounce();
			missed();
			printText();
		} else {

			text("Game Over ", width - 620, 15);

			text("Press enter to play again ", width - 620, 25);
		}
		if (keyCode == ENTER) {
			score = 3;

		}

	} // draw() loops forever, until stopped

	// logic to capture ball bounce
	void ballBounce() {
		// bounce at top, left and right of frame
		if (ball.getBallY() < ball.getBallRadius())
			ball.setDirY(ball.getDirY() * -1);
		if (ball.getBallX() < ball.getBallRadius() || ball.getBallX() > width - ball.getBallRadius())
			ball.setDirX(ball.getDirX() * -1);
		// paddled bounce
		if (ball.getBallY() >= paddle.getPaddleY() - paddle.getPaddleHeight()
				&& ball.getBallX() < paddle.getPaddleX() + (paddle.getPaddleWidth() / 2)
				&& ball.getBallX() > paddle.getPaddleX() - (paddle.getPaddleWidth() / 2)) {
			ball.setDirY(ball.getDirY() * -1);
		}
	}

	// if the user misses reset ball and deduct life
	void missed() {
		if (ball.getBallY() > height) {
			// reset
			ball.setBallX(20);
			ball.setBallY(ball.getBallRadius() * 2);
			ball.setDirX((float) 9.0);
			ball.setBallY(5);
			score--;
		}
	}

	// print score to screen
	void printText() {

		text("Life = " + score, width - 620, 15);

	}

	// Keypress event moves the paddle left and right with keyboard arrows
	// also keeps paddle within frame
	@Override
	public void keyPressed() {

		if (key == CODED) {

			if (keyCode == RIGHT && paddle.getPaddleX() + (paddle.getPaddleWidth() / 2) < width) {

				paddleController.handleEvent();
			}
			if (keyCode == LEFT && paddle.getPaddleX() - (paddle.getPaddleWidth() / 2) > width - width) {

				paddleController.handleEventMinus();

			}
		}

	}
}
