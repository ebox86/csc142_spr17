/**
 * MySquare -- creates a square object as a child of MyRectangle of MyShape
 * 
 * @author evan kohout
 *
 */
public class MySquare extends MyRectangle {

	// ~~ constructor ~~ //

	/**
	 * This constructs the MySquare object
	 * 
	 * @param side
	 *            -- the length of the side
	 */
	public MySquare(int side) {
		super(side, side);
	}

	// ~~ accessors ~~ //

	/**
	 * Returns the name of the shape
	 * @return the name of the shape
	 */
	public String getName() {
		return "square";
	}

	/**
	 * Returns the area of the MySquare object
	 * @return the area of the square
	 */
	public double getArea() {
		return width * width;
	}

	/**
	 * Returns the perimeter of the MySquare object
	 * @return the perimeter of the square
	 */
	public double getPerimeter() {
		return 4 * width;
	}
}