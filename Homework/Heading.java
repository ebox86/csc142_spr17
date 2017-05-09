/**
 * Heading class - stores heading
 * 
 * @author Evan Kohout
 *
 */

public class Heading {

	double heading;

	// ~~ constructors ~~ //

	/**
	 * Heading - default constructor
	 * 
	 * @param initialDegrees
	 */
	public Heading(double initialDegrees) throws IllegalArgumentException {
		setHeading(initialDegrees);
	}

	// ~~ accessors ~~ //

	/**
	 * getHeading
	 * 
	 * @return
	 */
	public double getHeading() {
		return heading;
	}

	/**
	 * getBearing - gets current cardinal direction + degree of heading, returns string
	 * @return
	 */
	public String getBearing() {
		if (heading > 90 && heading < 270) {
			double degrees = 180 - heading;
			if (degrees < 0) {
				return "S " + degrees * -1 + " W";
			} else {
				return "S " + degrees + " E";
			}

		} else {
			if (heading <= 90) {
				return "N " + heading + " E";
			} else {
				return "N " + (360 - heading) + " W";
			}
		}

	}

	// ~~ mutators ~~ //

	/**
	 * setHeading method - sets the initial heading
	 * 
	 * @param update
	 * @return
	 */
	public void setHeading(double update) throws IllegalArgumentException {
		if (update < 0 || update > 360) {
			throw new IllegalArgumentException();
		}
		this.heading = update;
	}

	/**
	 * toString - output method
	 */
	public String toString() {
		return String.valueOf(heading);
	}

}