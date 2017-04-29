import java.lang.Math;
/**
 * SquareRootMath - includes methods to calculate area under function f(x) = sqrt(x)
 * @author Evan Kohout
 *
 */
public class SquareRootMath{
	/**
	 * Performs calculation to find the slope of equation m = 1 / 2 * sqrt(x)
	 * 
	 * @param x		input value for calculation
	 * @return		returns calculated value - double
	 */
	public static double slopeOfTangent(int x){
		return 1 / (2 * Math.sqrt(x));
	}
	
	/**
	 * Calculates area under a graph using the rectangle method
	 * @param x		Specifies interval [0,x] to calculate area
	 * @param n		Number of rectangles to use in calculation
	 * @return
	 */
	public static double areaUnderGraph(int x, int n){
		// sets initial value of interval [a, b]
		double a = 0.0;
		// sets second value of interval [a, b]
		double b = x;
		 // calculates width of each rectangle
		double width = (b - a) / n;
		// initializes the sum of the areas
		double sum = 0.0;
		double j;
		for(int i = 1; i <= n; i++){
			// calculates length
			j = a + (i - 1) * width; 
			// calculates area
			sum += (width * f(j) ); 
		}
		return sum;
	}
	
	/**
	 * function used for graph, needed for generating height of rectangles in
	 * calculating area under graph
	 * 
	 * @param x		value of x used as input for function
	 * @return
	 */
	private static double f(double x){
		return Math.sqrt(x);
	}
}