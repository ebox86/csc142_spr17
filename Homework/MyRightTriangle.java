/**
 * MyRightTriangle -- creates a new MyRightTriangle object as a child of MyTriangle
 * @author Evan Kohout
 *
 */
public class MyRightTriangle extends MyTriangle {
	
	// ~~ constructor ~~ //

	/**
	 * constructs the MyRightTriangle object
	 * 
	 * @param h
	 *            -- height of the triangle
	 * @param w
	 *            -- width of the triangle
	 */
	public MyRightTriangle(int h, int w) {
		super(h, w);
	}

	// ~~ accessors ~~ //
	/**
	 * Returns the name of the shape
	 * @return the name of the shape
	 */
	public String getName() {
		return "right triangle";
	}

}
