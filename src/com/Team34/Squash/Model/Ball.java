package com.Team34.Squash.Model;

//create ball claee
public class Ball {

	// create ball properties
	private static int ballRadius;
	private static float ballX;
	private static float ballY;
	private static float dirX;
	private static float dirY;
	private static float width;

	// getters and setter for ball properties
	public static int getBallRadius() {
		return ballRadius;
	}

	public static void setBallRadius(int ballRadius) {
		Ball.ballRadius = ballRadius;
	}

	public static float getBallX() {
		return ballX;
	}

	public static void setBallX(float ballX) {
		Ball.ballX = ballX;
	}

	public static float getBallY() {
		return ballY;
	}

	public static void setBallY(float ballY) {
		Ball.ballY = ballY;
	}

	public static float getDirX() {
		return dirX;
	}

	public static void setDirX(float dirX) {
		Ball.dirX = dirX;
	}

	public static float getDirY() {
		return dirY;
	}

	public static void setDirY(float dirY) {
		Ball.dirY = dirY;
	}

	// method to move ball
	public void BallMovement() {
		ballY += dirY;
		ballX += dirX;

	}

}
