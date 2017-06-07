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
		// height multiplied by width divided by 2
		return 0.5 * width * height;
	}

	/**
	 * Returns the name of the shape
	 */
	public String getName() {
		return "triangle";
	}

	/**
	 * Returns the perimeter of the MyTriangle object
	 */
	public double getPerimeter() {
		// adds both known sides of triangle to the hypotenuse
		return width + height + Math.sqrt((width * width) + (height * height));
	}

}
