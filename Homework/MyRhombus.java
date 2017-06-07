/**
 * MyRhombus -- creates a new MyRhombus 
 * @author Evan kohout
 *
 */
public class MyRhombus extends MyShape {

	// ~~ constructor ~~ //

	/**
	 * constructs a new MyRhombus object
	 * 
	 * @param h
	 *            -- the diagonal height of the rhombus
	 * @param w
	 *            -- the diagonal width of the rhombus
	 */
	public MyRhombus(int h, int w) {
		super(h, w);
	}
	
	// ~~ accessors ~~ //
	
	/**
	 * Returns the name of the shape
	 * @return the name of the shape
	 */
	public String getName(){
		return "rhombus";
	}
	
	/**
	 * Returns the area of the MyRhombus object
	 * @return the area of the Rhombus
	 */
	public double getArea(){
		// height of the diagonal multiplied by the width of the diagonal divided by 2
		return width * height * 0.5;
	}

	/**
	 * Retuns the perimeter of the MyRhombus object
	 * @return the perimeter of the rhombus
	 */
	public double getPerimeter(){
		// finds the hypotenuse of the 4 triangles that make up the sides and multiplies by 4
		return 4 * Math.sqrt(Math.pow(height * 0.5, 2) + Math.pow(width * 0.5, 2));
	}
}
