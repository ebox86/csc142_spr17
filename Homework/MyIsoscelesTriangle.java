/**
 * MyIsoscelesTriangle -- creates a new MyIsoscelesTriangle object as a child of
 * MyShape
 * 
 * @author evan kohout
 *
 */
public class MyIsoscelesTriangle extends MyRightTriangle {

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
	 * Returns the area of the MyIsoscelesTriangle object
	 * @return the area of the triangle
	 */
	public double getArea() {
		// side length is height
		return width * (Math.sqrt((4 * Math.pow(height, 2)) - (Math.pow(height, 2)))/4);
	}

	/**
	 * Returns the perimeter of the MyIsoscelesTriangle object
	 * @return the perimeter of the triangle
	 */
	public double getPerimeter() {
		// side length is height
		return (2 * height) + width;
	}
}
