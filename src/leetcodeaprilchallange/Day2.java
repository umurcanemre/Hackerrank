package leetcodeaprilchallange;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Day2 {
	/*
	 * Write an algorithm to determine if a number is "happy".
	 * 
	 * A happy number is a number defined by the following process: Starting with
	 * any positive integer, replace the number by the sum of the squares of its
	 * digits, and repeat the process until the number equals 1 (where it will
	 * stay), or it loops endlessly in a cycle which does not include 1. Those
	 * numbers for which this process ends in 1 are happy numbers.
	 * 
	 * Example:
	 * 
	 * Input: 19 Output: true Explanation: 1^2 + 9^2 = 82 8^2 + 2^2 = 68 6^2 + 8^2 =
	 * 100 1^2 + 0^2 + 0^2 = 1
	 * 
	 */
	public static boolean isHappy(int n) {
		Set<Integer> numberCameAcross = new HashSet<>();
		while(!numberCameAcross.contains(n)) {
			numberCameAcross.add(n);
			n = calculateDigitSquares(chopInt(n));
			
			if(n ==1) {
				return true;
			};
		}		
		return false;
	}
	
	private static int calculateDigitSquares(List<Integer> digits) {
		int result = 0;
		for(Integer i : digits) {
			result += i*i;
		}
		return result;
	}
	
	private static List<Integer> chopInt(int n){
		LinkedList<Integer> result = new LinkedList<>();
		
		while(n > 0) {
			result.offerFirst( n%10 );
			n = n/10;
		}		
		
		return result;
	}
}
