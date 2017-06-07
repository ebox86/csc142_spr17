/**
 * MyEllipse -- creates a MyEllipse object as a child of MyShape
 * @author evan kohout
 *
 */
public class MyEllipse extends MyShape {

	// ~~ constructor ~~ //
	
	/**
	 * Constructs the MyEllipse object
	 * @param a -- major axis of the ellipse
	 * @param b -- minor axis of the ellipse
	 */
	public MyEllipse(int a, int b) {
		super(a, b);
	}

	// ~~ accessors ~~ //
	
	/**
	 * Returns the area of the MyEllipse object
	 */
	public double getArea() {
		double area = (1/4) * Math.PI * (height * width);
		return area;
	}
	
	/**
	 * Returns the name of the shape
	 */
	public String getName() {
		return "ellipse";
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
