import java.awt.geom.*;
import java.awt.*;

public class Ball extends ColorShape {
	
	// location and size variables
	private int xPos;
	private int yPos;
	private int xSpeed;
	private int ySpeed;
	private static final int height = 15;
	private static final int width = 15;
	private static final Ellipse2D.Double shape = new Ellipse2D.Double(0, 0, width, height);

	// constructor
	public Ball() {
		super(shape);

		// set ball color
		super.setFillColor(Color.GREEN);
		super.setBorderColor(Color.GREEN);
		
		// set initial values for x and y position and speed
		xPos = 300;
		yPos = 200;
		xSpeed = 2;
		ySpeed = 2;
	}

	public void move() {
		// move ball
		xPos += xSpeed;
		yPos += ySpeed;
		
		// detect if ball should bounce off an edge
		//left wall
		if (xPos <= 0 && xSpeed == -2 && ySpeed == 2){
			xPos = 0;
			ySpeed = 2;
			xSpeed = 2;
		}

		if (xPos <= 0 && xSpeed == -2 && ySpeed == -2){
			xPos = 0;
			ySpeed = -2;
			xSpeed = 2;



		}
		//right wall
		if (xPos >= 600 -width && xSpeed == 2 && ySpeed == -2) {
			xPos = 600 - width;
			xSpeed = -2;
			ySpeed = -2;

		}
		if (xPos >= 600 -width && xSpeed == 2 && ySpeed == 2){
			xPos = 600 - width;
			ySpeed = 2;
			xSpeed = -2;
		}
		//top wall
		if (yPos <= 0 && xSpeed == -2 && ySpeed == -2) {
			yPos = 0;
			xSpeed = -2;
			ySpeed = 2; 
		}

		if (yPos <= 0 && xSpeed == 2 && ySpeed == -2) {
			yPos = 0;
			xSpeed = 2;
			ySpeed = 2; 
		}


		// update shape to new values
		shape.setFrame(xPos, yPos, width, height);
	}

	public void setXspeed(int newSpeed) {
		xSpeed = newSpeed;
	}

	public void setYspeed(int newSpeed) {
		ySpeed = newSpeed;
	}

	public int getX() {
		return xPos;
	}

	public int getY() {
		return yPos;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Ellipse2D.Double getShape() {
		return shape;
	}
}