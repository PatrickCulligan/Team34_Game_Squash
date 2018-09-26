package com.Team34.Squash.Model;

public class Paddle {

	private static int paddleX;
	private static int paddleY;
	private static int paddleWidth;
	private static int paddleHeight;
	private static float paddleSpeed;
	public static int width;
	

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

	// Collision detection Keep score
	public void updateCollisionDetection() {

		this.paddleX++;

		// notifyAllObservers();
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

		this.paddleX-=Paddle.getPaddleSpeed();

		// notifyAllObservers();
	}

	// Increment count and notify all observers
	public void updateCount() {

		this.paddleX+=Paddle.getPaddleSpeed();

		// notifyAllObservers();
	}

	/*public void paddleConstriant() {

		if (paddleX +(paddleWidth/2) < width) {
			this.paddleX++;
		} else if (paddleX > width) {
			this.paddleX--;
		}

	}*/
	/*
	 * // add changes to the model
	 * 
	 * @Override public void attach(Observer observer) {
	 * observers.add(observer); }
	 * 
	 * // notify all observers and update with update method of arraylist
	 * 
	 * @Override public void notifyAllObservers() { for (Observer observer :
	 * observers) { observer.update(count); }
	 */
}
