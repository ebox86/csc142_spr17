package csc142_spr17;

public class Discussion3 {

	public static void main(String[] args){
		//System.out.println(dashString("people"));
		double a, b, c, x; 
		x = 0;

		a = 5; 
		b = 3; 
		c = 6; 
		if ( a <= c ) {

		x = 1;
		}

		if ( c > b ) {

		x = 2;
		}

		if ( x > b ) {

		x = 3;
		}
		System.out.println(x);
	}
	
	public static String dashString(String inputText){
		String outputString = "";
		    for(int x = 0; x < inputText.length() - 1; x++){        
		    	outputString += inputText.substring(x, x + 1) + "-";    
		    	}    
		    return outputString + (inputText.charAt(inputText.length() - 1));
	}
}
