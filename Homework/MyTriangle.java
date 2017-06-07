/**
 * MyTriangle -- creates a new MyTriagne object as a child of MyShape
 * 
 * @author evan kohout
 *
 */
public class MyTriangle extends MyShape {

	// ~~ constructor ~~ //

	/**
	 * constructs the MyTriangle object
	 * 
	 * @param h
	 *            -- height of the triangle
	 * @param w
	 *            -- width of the triangle
	 */
	public MyTriangle(int h, int w) {
		super(h, w);
	}

	// ~~ accessors ~~ //

	/**
	 * Returns the area of the MyTriangle object
	 */
	public double getArea() {
		return 0.5 * width * height;
	}

	/**
	 * Returns the name of the shape
	 */
	public String getName() {
		return "triangle";
	}

	public double getPerimeter() {
		double hypotenuse = Math.pow(Math.pow(width, 2) + Math.pow(height, 2), 0.5);
		return width + height + hypotenuse;

	}

}
