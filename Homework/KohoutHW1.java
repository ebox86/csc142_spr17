import java.lang.Math;

public class KohoutHW1{
	
	public static void main(String[] args){
		
		System.out.println("x\te^x");
		System.out.println("=\t===");

		for(int i=-3; i<4; i++){
			System.out.println(Integer.toString(i) + "\t" + Double.toString(eCalc(i)));
		}
		
		System.out.println("\nx\tsin(x)");
		System.out.println("=\t======");
		
		for(int i=1; i<=4; i++){
			System.out.println(Integer.toString(i) + "PI/2" + "\t" + Double.toString(sinCalc((i * Math.PI)/2)));
		}
	}
	
	public static double eCalc(int xVar){
		double eToX = 1 + xVar;
		double factorial = 1;
		for(int i = 2; i < 15; i++){
			eToX += (Math.pow(xVar, i)/(factorial *= i));
		}
		return eToX;
	}
	
	public static double sinCalc(double xVar){
		double sinOfX = Math.toRadians(xVar);
		double[] taylorArray = new double[32];
		double factorial = 1;
		for(int i = 1; i <= 31; i ++){
			taylorArray[i] = (Math.pow(sinOfX, i)/(factorial *= i));
			factorial *= i;
			
			//double sign = Math.pow(-1, i);
			//sinOfX += (Math.pow(xVar, i)/factorial(i));
			//System.out.println(sinOfX);
		}
		for(int i = 3;i < taylorArray.length; i += 4){
			sinOfX -= taylorArray[i];
		}
		for(int i = 5;i < taylorArray.length; i += 4){
			sinOfX += taylorArray[i];
		}		
		return sinOfX;
	}
}