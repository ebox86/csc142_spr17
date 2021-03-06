/**
 * MyRectangle -- creates a new MyRectangle object as a child of MyShape
 * 
 * @author evan kohout
 *
 */
public class MyRectangle extends MyShape {

	// ~~ constructor ~~ //

	/**
	 * This constructs the MyRectangle object
	 * 
	 * @param h
	 *            -- height of rectangle
	 * @param w
	 *            -- width of rectangle
	 */
	public MyRectangle(int h, int w) {
		super(h, w);
	}

	// ~~ accessors ~~ //

	/**
	 * Returns the name of the shape
	 * @return the name of the shape
	 */
	public String getName() {
		return "rectangle";
	}

	/**
	 * Returns the area of the MyRectangle object
	 * @return the area of the rectangle
	 */
	public double getArea() {
		// height multiplied by width
		return width * height;
	}

	/**
	 * Returns the perimeter of the MyRectangle object
	 * @return the perimeter of the rectangle
	 */
	public double getPerimeter() {
		// height added to width multiplied by 2
		return 2 * (width + height);
	}
}