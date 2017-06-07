/**
 * MyIsoscelesTriangle -- creates a new MyIsoscelesTriangle object as a child of MyShape
 * @author evan kohout
 *
 */
public class MyIsoscelesTriangle extends MyRightTriangle {

	// ~~ constructor ~~ //

	/**
	 * constructs a new MyIsoscelesTriangle object
	 * @param h
	 * @param w
	 */
	public MyIsoscelesTriangle(int h, int w) {
		super(h, w);
		
	}
	
	// ~~ accessors ~~ //
	
	/**
	 * Returns the name of the shape
	 */
	public String getName() {
		return "isosceles triangle";
	} 
	
	/**
	 * Returns the area of the MyIsoscelesTriangle object
	 */
	public double getArea(){
		return 0;
	}

	/**
	 * Returns the perimeter of the MyIsoscelesTriangle object
	 */
	public double getPerimeter(){
		return 0;
	}
}
