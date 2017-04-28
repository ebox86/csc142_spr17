import java.util.Scanner;
/**
 * This is the first of two parts that encompass HW3. This is
 * a user interface which uses SquareRootMath to return calculations
 * to the user.
 * 
 * @author Evan Kohout
 */

public class SquareRootApp{
    
	public static void main(String[] args){
		// prints welcome message before menu
	    System.out.println(" _       __     __\n"
	    + "| |     / /__  / /________  ____ ___  ___\n"
	    + "| | /| / / _ \\/ / ___/ __ \\/ __ `__ \\/ _ \\\n"
	    + "| |/ |/ /  __/ / /__/ /_/ / / / / / /  __/\n"
	    + "|__/|__/\\___/_/\\___/\\____/_/ /_/ /_/\\___/\n");
		menu();
	}
	
	/**
	 * Builds menu to be shown to user, 
	 */
	public static void menu(){
		boolean flag = true;
		Scanner in = new Scanner(System.in);
	    
	    while(flag){
		    System.out.print("Please select from the menu options below \n"
		    		+ "to perform a calculation.\n"
		    		+ "++++++++++++++++++++++++++++++++++++++++++\n"
		    		+ "1) Find the slope at a given point \n"
		    		+ "2) Approximate area \n"
		    		+ "3) Quit \n"
		    		+ "> ");
		    // switch statement which builds menu structure
	        switch (in.nextLine()) {
	            case "1":  
	            	flag = false;
	            	findSlope();
	            case "2":  
	            	flag = false;
	            	approxArea();
	            case "3":  
	            	System.exit(0);
	            default: 
	            	System.out.print("\n!!! Invalid input !!!\n\n");
	        }

	    }
	}

	/**
	 * method used to make call to slopeOfTangent from SquareRootMath class, prints output
	 */
	public static void findSlope(){
		int xVar = validateInput(0, "Please enter a positive number > 0 to \ncalculate slope of the tangent line: ");
		System.out.println(SquareRootMath.slopeOfTangent(xVar));
		System.out.print("\n\n");
		menu();
	}
	
	/**
	 * method used to make call to areaUnderGraph from SquareRootMath class, prints output
	 */
	public static void approxArea(){
		int xVar = validateInput(0, "Please enter a positive number > 0 to \n"
				+ "calculate area under the graph of f(x) = sqrt(x) : \n");
		System.out.println(SquareRootMath.areaUnderGraph(xVar, 4));
		menu();
	}
	
	/**
	 * Validates input as received by user input from menu
	 * @param x			The value to restrict input by
	 * @param text		The text to display to the user
	 * @return
	 */
	public static int validateInput(int x, String text){
		boolean flag = true;
		int xVar = 0;
		Scanner in = new Scanner(System.in);
		while(flag){
			System.out.print("\n" + text + "\n");
			if(!in.hasNextInt()){
				System.out.print("\n\n!!! Invalid input !!!\n");
				in.nextLine();
			} else {
				xVar = in.nextInt();
				if(xVar > x){
					flag = false;
				}	
			}
		}
		return xVar;
	}
}
