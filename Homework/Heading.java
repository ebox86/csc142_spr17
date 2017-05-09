/**
 * Heading class 
 * 
 * @author Evan Kohout
 *
 */

public class Heading {
	
	
	
	double heading;
	
	// ~~ constructors ~~ //
	
	/**
	 * Heading - default constructor
	 * @param initialDegrees
	 */
	public Heading( double initialDegrees){
		this.heading = initialDegrees;
	}
	
	// ~~ accessors ~~ //
	
	/**
	 * getHeading
	 * @return
	 */
	public double getHeading(){
		return heading;
	}
	
	public String getBearing(){
		return "north";
	}
	
	
	// ~~ mutators ~~ //

	/**
	 * 
	 * @param update
	 * @return
	 */
	public void setHeading(double update){
		this.heading = update;
	}
	
	/**
	 * toString - output method
	 */
	public String toString(){
		return String.valueOf(heading);
	}
	
	// ~~ test method ~~ //
	
	
	
	
}