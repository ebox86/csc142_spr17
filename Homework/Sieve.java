/**
 * Sieve -- interface class used for prime number calculation
 *
 */
public interface Sieve {
   
	/**
	 * getPrimes -- gets all prime numbers up to a given upper bound n
	 * @param n -- the upper bound for the prime number calculation
	 * @return list -- a list of prime numbers
	 */
   public java.util.List<Integer> getPrimes(int n);
   
}