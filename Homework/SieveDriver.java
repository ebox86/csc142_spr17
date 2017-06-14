import java.util.*;
/**
 * SieveDriver -- the main client class used to run the user input and display 
 * components of the Sieve alg and prime number calculation program
 * @author Evan Kohout
 *
 */
public class SieveDriver {
   
	// ~~ fields ~~ //
	
   private java.util.Scanner scan;
   private Sieve theSieve;
   
   // ~~ constructor ~~ //
   
   /**
    * Constructs the SieveDriver object
    */
   public SieveDriver(){
	   scan = new Scanner(System.in);
	   theSieve = new MySieve();
   }
   
   // ~~ methods ~~ //
   
   /**
    * go() -- initiates the main logic loop which takes user input and 
    * outputs prime numbers to the user
    */
   public void go() {
      java.util.List<Integer> primes;
      int n = 0;
      do {
    	  n = getNumber();
    	  if (n == 0) continue;
    	  primes = theSieve.getPrimes(n);  // implementation method behind the Sieve interface
    	  printPrimes(n, primes);
      } while (n != 0);
   }
   
   /**
    * getNumber -- prompts for user input and returns integer which is used as 
    * an upper bound for prime calculation
    * @return n -- the integer of the upper bound
    */
   public int getNumber() {
      System.out.print("Please enter the upper bound (0 to exit): ");
      while(!scan.hasNextInt()){ 
    	  scan.next();
    	  System.out.print("Please enter only a positive, non-zero number: ");
      }
      int n = scan.nextInt();
      return n;
   }
   
   /**
    * printPrimes -- the main output method used to print all the primes in the list provided 
    * by the getPrimes method of Sieve. Output is separated by 12 primes per line
    * @param bound -- an upper boundary used for prime calculation
    * @param list -- the list of prime numbers already found based on the given upper bound
    */
   public void printPrimes(int bound, java.util.List<Integer> list) {
      System.out.println("Here are the primes between 2 and " + bound);
      Iterator<Integer> it = list.iterator();
      // input validation
      int nl = 1;
      while (it.hasNext()){
    	  if(nl % 13 != 0) System.out.print(it.next() + " "); else System.out.println();
    	  nl++;
      }
      System.out.println("\n" + (int)((double)list.size() / (double)bound  * 100) + "% of the numbers between 1 and " + bound + " are prime.");
      System.out.println();
   }
   
   /**
    * main -- the main class used to call go() and start the input validation loop
    * @param args
    */
   public static void main(String[] args) {
	  // call go()
      new SieveDriver().go();
   }
}