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

	    System.out.println(" _       __     __\n"
	    + "| |     / /__  / /________  ____ ___  ___\n"
	    + "| | /| / / _ \\/ / ___/ __ \\/ __ `__ \\/ _ \\\n"
	    + "| |/ |/ /  __/ / /__/ /_/ / / / / / /  __/\n"
	    + "|__/|__/\\___/_/\\___/\\____/_/ /_/ /_/\\___/\n");
		menu();
	}
	
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
	        switch (in.next()) {
	            case "1":  flag = false;
	            	findSlope();
	            case "2":  flag = false;
	            	approxArea();
	            case "3":  System.exit(0);
	            default: 
	            	System.out.print("\n!!! Invalid input !!!\n\n");
	        }

	    }
	}

	public static void findSlope(){
		Scanner in = new Scanner(System.in);
		System.out.print("Please Enter Number: ");
		String userInput = in.next();
		System.out.println(userInput);
		menu();
	}
	
	public static void approxArea(){
		Scanner in = new Scanner(System.in);
		System.out.print("Please Enter Number: ");
		String userInput = in.next();
		System.out.println(userInput);
		menu();
	}
	
	
	
}
