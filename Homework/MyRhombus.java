
public class MyRhombus extends MyShape {

	// ~~ constructor ~~ //

	/**
	 * constructs a new MyRhombus object
	 * 
	 * @param h
	 *            -- the height of the rhombus
	 * @param w
	 *            -- the width of the rhombus
	 */
	public MyRhombus(int h, int w) {
		super(h, w);
	}
	
	// ~~ accessors ~~ //
	
	/**
	 * Returns the name of the shape
	 */
	public String getName(){
		return "rhombus";
	}
	
	/**
	 * Returns the area of the MyRhombus object
	 */
	public double getArea(){
		return 0;
	}

	/**
	 * Retuns the perimeter of the MyRhombus object
	 */
	public double getPerimeter(){
		return 0;
	}
}
