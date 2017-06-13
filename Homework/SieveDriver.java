import java.util.Scanner;

public class SieveDriver {
   
   private java.util.Scanner scan;
   private Sieve theSieve;
   
   // ~~ constructor ~~ //
   
   public SieveDriver(){
	   scan = new Scanner(System.in);
   }
   
   
   public void go() {
      
      java.util.List<Integer> primes;
      
      int n = getNumber();
      primes = theSieve.getPrimes(n);
      printPrimes(n, primes);
   }
   
   public int getNumber() {
      System.out.print("Enter the upper bound: ");
      int n = scan.nextInt();
      return n;
   }
   
   public void printPrimes(int bound, java.util.List<Integer> list) {
      System.out.println("The primes up to N are:");
      for(Integer n : list) System.out.print(n + " ");
      System.out.println();
      System.out.println();
   }
   
   public static void main(String[] args) {
   
      new SieveDriver().go();
      
   }
   
}