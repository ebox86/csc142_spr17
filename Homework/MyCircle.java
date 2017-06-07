/**
 * MyCircle -- creates a MyCircle object as a child of MyEllipse of MyShape
 * 
 * @author Evan kohout
 *
 */
public class MyCircle extends MyEllipse {

	// ~~ constructor ~~ //

	/**
	 * Constructs the MyCicle object
	 * 
	 * @param diameter
	 *            -- diameter of the circle
	 */
	public MyCircle(int diameter) {
		super(diameter, diameter);

	}

	// ~~ accessors ~~ //

	/**
	 * Returns the area of the MyCircle object
	 */
	public double getArea() {
		return 0.25 * Math.PI * Math.pow(width, 2);
	}

	/**
	 * Returns the name of the shape
	 */
	public String getName() {
		return "circle";
	}

	/**
	 * Returns the perimeter of the MyCircle object
	 */
	public double getPerimeter() {
		double r = width / 2;
		return 2 * Math.PI * r;
	}
}
