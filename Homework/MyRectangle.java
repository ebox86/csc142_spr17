/**
 * MyRectangle -- creates a new MyRectangle object as a child of MyShape
 * @author evan kohout
 *
 */
public class MyRectangle extends MyShape {
	
	// ~~ constructor ~~ //
	
	/**
	 * This constructs the MyRectangle object
	 * @param h -- height of rectangle
	 * @param w -- width of rectangle
	 */
	public MyRectangle(int h, int w) {
		super(h, w);
	}

	// ~~ accessors ~~ //

	/**
	 * Returns the name of the shape
	 */
	public String getName() {
		return "rectangle";
	}

	/**
	 * Returns the area of the rectangle
	 */
	public double getArea() {
		return width * height;
	}

	/**
	 * Returns the perimeter of the rectangle
	 */
	public double getPerimeter() {
		double perimeter = 2 * (width + height);
		return perimeter;
	}
}