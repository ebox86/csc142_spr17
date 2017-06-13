import java.util.*;

/**
 * MySieve -- implementation of Sieve interface
 * @author evan kohout
 *
 */
public class MySieve implements Sieve {

	private ArrayList<Integer> numberList = new ArrayList<Integer>();
	private ArrayList<Integer> primeList = new ArrayList<Integer>();
	private int currentPrime = 0;
	
	public List<Integer> getPrimes(int n) {
		for(int i = 2; i <= n; i++) numberList.add(i);
		currentPrime = numberList.get(0);
		double m = Math.sqrt(n);
		while(currentPrime <= m) loop();
		for(int z : numberList) primeList.add(z);
		return primeList;
	}
	
	private void loop(){
		currentPrime = numberList.get(0);
		numberList.remove(0);
		for(int i = 0; i < numberList.size(); i++) if (numberList.get(i) % currentPrime == 0) numberList.remove(i);
		primeList.add(currentPrime);
	}

}
