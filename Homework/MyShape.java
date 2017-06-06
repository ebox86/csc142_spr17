/**
 * MyShape object -- constructs a new MyShape with the provided height and width
 * values
 * 
 * @author evan kohout
 *
 */
public abstract class MyShape {

	protected int height;
	protected int width;

	// ~~ constructor ~~ //

	/**
	 * MyShape
	 * 
	 * @param h
	 *            -- height int
	 * @param w
	 *            -- width int
	 */
	public MyShape(int h, int w) {
		height = h;
		width = w;
	}

	// ~~ accessors ~~ //

	/**
	 * Returns the height of the MyShape object
	 * 
	 * @return height -- height of MyShape object
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Returns the width of the MyShape object
	 * 
	 * @return width -- width of the MyShape object
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Returns the name of the MyShape object
	 * 
	 * @return String name of MyShape object
	 */
	public String getName() {
		return "shape";
	}
	
	public abstract double getArea( );

}