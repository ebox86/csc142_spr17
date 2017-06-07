/**
 * MyCircle -- creates a MyCircle object as a child of MyEllipse of MyShape
 * @author Evan kohout
 *
 */
public class MyCircle extends MyEllipse {

	// ~~ constructor ~~ //
	
	/**
	 * Constructs the MyEllipse object
	 * @param h -- height of the ellipse
	 * @param w -- width of the ellipse
	 */
	public MyCircle(int diameter) {
		super(diameter, diameter);

	}

	// ~~ accessors ~~ //
	
	/**
	 * Returns the area of the MyCircle object
	 */
	public double getArea() {
		double area = (1/4) * Math.PI * Math.pow(width, 2);
		return area;
	}
	
	/**
	 * Returns the name of the shape
	 */
	public String getName() {
		return "circle";
	}
	
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
}
