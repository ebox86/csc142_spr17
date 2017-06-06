/**
 * MyRectangle -- creates a new MyRectangle object as a child of MyShape
 * @author evan kohout
 *
 */
public class MyRectangle extends MyShape {
	public MyRectangle(int h, int w) {
		super(h, w);
	}

	public String getName() {
		return "rectangle";
	}

	public double getArea() {
		return width * height;
	}
}