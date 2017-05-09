/**
 * GPS class - stores current location and heading
 * 
 * @author Evan Kohout
 *
 */

import java.math.*;

public class GPS {

	
	Heading heading;
	CSC142Point currentLoc;
	
	// ~~ constructors ~~ //
	
	public GPS (Heading currentDir, CSC142Point currentLoc) throws NullPointerException {
		if(currentDir == null || currentLoc == null){
			throw new NullPointerException("Parameters cannot be null!");
		}
	}
	
	// ~~ methods ~~ //
	
	/**
	 * Move - moves the GPS object the specified amount of units in its current heading
	 * @param units
	 * @throws IllegalArgumentException
	 */
	public void move(double units) throws IllegalArgumentException {
		if(units < 0){
			throw new IllegalArgumentException("Units is less than zero!!!");
		}
		
		// Converting to radians
		double headingAngleInRadians = this.heading.getHeading() * Math.PI / 180;
		
		// obtaining locations from current point
		double x = this.currentLoc.getX();
		double y = this.currentLoc.getY();
		
		// math for each x and y variable
		double deltaX = units * Math.sin(headingAngleInRadians);
		double deltaY = units * Math.cos(headingAngleInRadians);
		
		// setting new point
		currentLoc.setPoint(x + deltaX, y + deltaY);
	}
	
	/**
	 * Turn method, turns the GPS object the amount of degrees specified
	 * @param degrees
	 * @throws IllegalArgumentException
	 */
	public void turn(double degrees) throws IllegalArgumentException {
		if(Math.abs(degrees) > 180){
			throw new IllegalArgumentException();
		}
		
		double angle = heading.getHeading();
		angle += degrees;
		heading.setHeading(angle);
	}
	
	// ~~ accessors ~~ //
	
	/**
	 * getHeading - returns heading
	 * @return
	 */
	public Heading getHeading(){
		return heading;
	
	}
	
	/**
	 * getLocation - returns the location
	 * @return
	 */
	public CSC142Point getLocation(){
		return currentLoc;
	}
	
	/**
	 * toString - returns a string representation of the current location and heading
	 */
	public String toString(){
		return "x = " + currentLoc.getX() + ", y = " + currentLoc.getY() + ", heading = " + heading.getHeading();
	}
}