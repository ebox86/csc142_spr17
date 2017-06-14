import java.util.*;

public class SieveDriver {
   
   private java.util.Scanner scan;
   private Sieve theSieve;
   
   // ~~ constructor ~~ //
   
   public SieveDriver(){
	   scan = new Scanner(System.in);
	   theSieve = new MySieve();
   }
   
   
   public void go() {
      java.util.List<Integer> primes;
      int n = 0;
      do {
    	  n = getNumber();
    	  if (n == 0) continue;
    	  primes = theSieve.getPrimes(n); 
    	  printPrimes(n, primes);
      } while (n != 0);
   }
   
   public int getNumber() {
      System.out.print("Please enter the upper bound (0 to exit): ");
      while(!scan.hasNextInt()){ 
    	  scan.next();
    	  System.out.print("Please enter only a positive, non-zero number: ");
      }
      int n = scan.nextInt();
      return n;
   }
   
   public void printPrimes(int bound, java.util.List<Integer> list) {
      System.out.println("Here are the primes between 2 and " + bound);
      Iterator<Integer> it = list.iterator();
      int nl = 1;
      while (it.hasNext()){
    	  if(nl % 13 != 0) System.out.print(it.next() + " "); else System.out.println();
    	  nl++;
      }
      System.out.println("\n" + (int)((double)list.size() / (double)bound  * 100) + "% of the numbers between 1 and " + bound + " are prime.");
      System.out.println();
   }
   
   public static void main(String[] args) {
   
      new SieveDriver().go();
      
   }
   
}