/**
 * MyEllipse -- creates a MyEllipse object as a child of MyShape
 * 
 * @author evan kohout
 *
 */
public class MyEllipse extends MyShape {

	// ~~ constructor ~~ //

	/**
	 * Constructs the MyEllipse object
	 * 
	 * @param a
	 *            -- major axis of the ellipse
	 * @param b
	 *            -- minor axis of the ellipse
	 */
	public MyEllipse(int a, int b) {
		super(a, b);
	}

	// ~~ accessors ~~ //

	/**
	 * Returns the area of the MyEllipse object
	 * @return the are of the ellipse
	 */
	public double getArea() {
		return 0.25 * Math.PI * (height * width);
	}

	/**
	 * Returns the name of the shape
	 * @return the name of the shape
	 */
	public String getName() {
		return "ellipse";
	}

	/**
	 * Returns the perimeter of the ellipse
	 * @return the perimeter of the ellipse
	 */
	public double getPerimeter() {
		return 0.5 * Math.PI * ((3 * (height * width)) - Math.sqrt((3 * height + width) * (height + 3 * width)));
	}

}
