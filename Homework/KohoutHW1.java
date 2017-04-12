import java.lang.Math;

public class KohoutHW1{
	
	public static void main(String[] args){
		
		System.out.println("x\te^x");
		System.out.println("=\t===");

		for(int i=-3; i<4; i++){
			System.out.printf("%d\t%f%n", i, eCalc(i));
		}
		
		
		System.out.println("\nx\tsin(x)");
		System.out.println("=\t======");
		
		for(int i=1; i<=4; i++){
			System.out.printf("%dPI/2\t%f%n", i, sinCalc((i * Math.PI)/2));
		}
	}
	
	public static long factorial(int fact){
		long factFinal = 1;
		for(int i=fact; i>0; i--){
			factFinal *= i;
		}
		return factFinal;
	}
	
	public static double eCalc(int xVar){
		double eToX = 1 + xVar;
		
		for(int i = 2; i < 15; i++){
			eToX += (Math.pow(xVar, i)/factorial(i));
		}
		
		return eToX;
	}
	
	public static double sinCalc(double xVar){
		double sinOfX = Math.toRadians(xVar);

		for(int i = 3; i < 17; i += 2){
			sinOfX -= (Math.pow(xVar, i)/factorial(i));
			//System.out.println(sinOfX);
		}
		
		for(int i = 5; i < 21; i += 2){
			sinOfX += (Math.pow(xVar, i)/factorial(i));
			//System.out.println(sinOfX);
		}
		
		return sinOfX;
	}
	

}