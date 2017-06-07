/**
 * MyRightTriangle -- creates a new MyRightTriangle object as a child of MyShape
 * @author Evan Kohout
 *
 */
public class MyRightTriangle extends MyShape {
	
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
	 * Returns the area of the MyRightTriangle object
	 */
	public double getArea() {
		return 0.5 * width * height;
	}

	/**
	 * Returns the name of the shape
	 */
	public String getName() {
		return "right triangle";
	}

	/**
	 * Returns the perimeter of the MyRightTriangle object
	 */
	public double getPerimeter() {
		double hypotenuse = Math.pow(Math.pow(width, 2) + Math.pow(height, 2), 0.5);
		return width + height + hypotenuse;

	}

}
