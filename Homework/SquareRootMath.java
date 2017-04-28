import java.lang.Math;
/**
 * 
 * @author Evan Kohout
 *
 */
public class SquareRootMath{
	public static double slopeOfTangent(int x){
		return 1 / (2 * Math.sqrt(x));
	}
	
	public static double areaUnderGraph(int x, int n){
		// sets 
		double a = 0.0;
		double b = x;
		double width = (b - a) / n; // calculates width of each rectangle
		double sum = 0.0; // initializes the sum of the rectangles
		double j;
		for(int i = 1; i <= n; i++){
			j = a + (i - 1) * width; 
			sum += (width * f(j) ); // calculates area
		}
		return sum;
	}

	private static double f(double x){
		return Math.sqrt(x);
	}
}