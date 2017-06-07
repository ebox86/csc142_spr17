/**
 * MySquare -- creates a square object as a child of MyRectangle of MyShape
 * @author evan kohout
 *
 */
public class MySquare extends MyRectangle {
	
	// ~~ constructor ~~ //
	
	/**
	 * This constructs the MySquare object
	 * @param side
	 */
	public MySquare(int side) {
		super(side, side);
	}
	
	// ~~ accessors ~~ //
	
	public String getName() {
		return "square";
	}
	
	public double getArea(){
		double area = width * width;
		return area;
	}
	
	@Override
	public double getPerimeter() {
		double perimeter = 4 * width;
		return perimeter;
	}
}