package com.Team34.Squash.Model;

//create paddle class
public class Paddle {

	// create paddle properties
	private static int paddleX;
	private static int paddleY;
	private static int paddleWidth;
	private static int paddleHeight;
	private static float paddleSpeed;
	public static int width;

	// getters and setters
	public static int getPaddleWidth() {
		return paddleWidth;
	}

	public static void setPaddleWidth(int paddleWidth) {
		Paddle.paddleWidth = paddleWidth;
	}

	public static int getPaddleHeight() {
		return paddleHeight;
	}

	public static void setPaddleHeight(int paddleHeight) {
		Paddle.paddleHeight = paddleHeight;
	}

	public static int getPaddleY() {
		return paddleY;
	}

	public static void setPaddleY(int paddleY) {
		Paddle.paddleY = paddleY;
	}

	// Model Getter
	public int getPaddle() {
		return paddleX;
	}

	public static int getPaddleX() {
		return paddleX;
	}

	public static void setPaddleX(int paddleX) {
		Paddle.paddleX = paddleX;
	}

	public static float getPaddleSpeed() {
		return paddleSpeed;
	}

	public static void setPaddleSpeed(float paddleSpeed) {
		Paddle.paddleSpeed = paddleSpeed;
	}

	// decrement count and notify all observers
	public void updateCountMinus() {

		this.paddleX -= Paddle.getPaddleSpeed();

	}

	// Increment count and notify all observers
	public void updateCount() {

		this.paddleX += Paddle.getPaddleSpeed();

	}

}
