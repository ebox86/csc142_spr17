/**
 * MySquare -- creates a square object as a child of MyRectangle of MyShape
 * @author evan kohout
 *
 */
public class MySquare extends MyRectangle {
	public MySquare(int side) {
		super(side, side);
	}
	
	public String getName() {
		return "square";
	}
}