package opsgenie;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

	static List<Integer> primes = new ArrayList<>();

	public static int oddDigitPrime(int lowLimit, int highLimit, int category) {
		if(primes.isEmpty())
			primes.add(2);
		createList(highLimit);
		
		
		int result = 0;
			for(Integer p : primes) {
				if(p > 2 && p >= lowLimit && p<= highLimit && catCheck(p, category)) {
					result++;
				}
			}
		
		
		return result;
	}

	private static void createList(int hLimit) {
		for (int i = primes.get(primes.size() - 1) + 1; i <= hLimit; i++) {
			if(isPrime(i)) {
				primes.add(i);
			}
		}

	}

	private static boolean isPrime(int num) {
		for (Integer prime : primes) {
			if (num % prime == 0) {
				return false;
			}

		}
		return true;
	}
	
	private static boolean catCheck(Integer i, int cat) {
		int temp = i.intValue();
		
		while (temp > 0) {
			int lastDigit = temp % 10;
			if(cat == 1 && (lastDigit > 5 || lastDigit % 2 == 0)) {
				return false;
			}
			if(cat == 2 && (lastDigit < 5 || lastDigit % 2 == 0)) {
				return false;
			}
			temp = temp /10;
		}
		
		return true;
		
	}

}
