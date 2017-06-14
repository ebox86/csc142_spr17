import java.util.*;

/**
 * MySieve -- implementation of Sieve interface
 * @author evan kohout
 *
 */
public class MySieve implements Sieve {

	// ~~ fields ~~ //
	
	private ArrayList<Integer> numberList;
	private ArrayList<Integer> primeList;
	private int currentPrime;
	
	/**
	 * getPrimes -- implementation logic for Sieve interface, returns prime numbers
	 * up to a given value of n
	 * 
	 * @param n -- a non-negative, non-zero integer value
	 * @return primeList -- an ArrayList object containing all prime numbers between 2 and n
	 */
	public List<Integer> getPrimes(int n) {
		// initialize list objects and currentPrime
		numberList = new ArrayList<Integer>();
		primeList = new ArrayList<Integer>();
		currentPrime = 0;
		// if n is 1, return empty list as there are no primes to find
		if (n == 1) return primeList;
		for(int i = 2; i <= n; i++) numberList.add(i);
		currentPrime = numberList.get(0);
		double m = Math.sqrt(n);
		while(currentPrime <= m) loop();
		for(int z : numberList) primeList.add(z);
		return primeList;
	}
	
	// internal loop used by the alg to calculate primes based on the current 
	// value of currentPrime
	//
	private void loop(){
		// set currentPrime to first (lowest) value of numberList
		currentPrime = numberList.get(0);
		// remove that value
		numberList.remove(0);
		// for each item in numberList, see if each number is divisible by currentPrime, if so remove it
		for(int i = 0; i < numberList.size(); i++) if (numberList.get(i) % currentPrime == 0) numberList.remove(i);
		// add the currentPrime to primeList, because it is a prime number
		primeList.add(currentPrime);
	}

}
