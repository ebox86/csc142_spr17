/**
 * MyIsoscelesTriangle -- creates a new MyIsoscelesTriangle object as a child of
 * MyTriangle
 * 
 * @author evan kohout
 *
 */
public class MyIsoscelesTriangle extends MyTriangle {

	// ~~ constructor ~~ //

	/**
	 * constructs a new MyIsoscelesTriangle object
	 * 
	 * @param h
	 *            -- height of the triangle
	 * @param w
	 *            -- width of the triangle
	 */
	public MyIsoscelesTriangle(int h, int w) {
		super(h, w);
	}

	// ~~ accessors ~~ //

	/**
	 * Returns the name of the shape
	 * @return the name of the shape
	 */
	public String getName() {
		return "isosceles triangle";
	}

	/**
	 * Returns the perimeter of the MyIsoscelesTriangle object
	 * @return the perimeter of the triangle
	 */
	public double getPerimeter() {
		return width + Math.sqrt(Math.pow(width, 2) + (4 * Math.pow(height, 2)));
	}
}
