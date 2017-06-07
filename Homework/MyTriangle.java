/**
 * MyTriangle -- creates a new MyTriagne object as a child of MyShape
 * @author evan kohout
 *
 */
public class MyTriangle extends MyShape{

	// ~~ constructor ~~ //
	
	/**
	 * constructs the MyTriangle object
	 * @param h -- height of the triangle
	 * @param w -- width of the triangle
	 */
	public MyTriangle(int h, int w) {
		super(h, w);
		// TODO Auto-generated constructor stub
	}

	// ~~ accessors ~~ //
	
	/**
	 * Returns the area of the MyTriangle object
	 */
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * Returns the name of the shape
	 */
	public String getName() {
		return "triangle";
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
