package leetcodeaprilchallange.week1;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class W1D1 {
	/*
	 * Given a non-empty array of integers, every element appears twice except for
	 * one. Find that single one.
	 * 
	 * Note:
	 * 
	 * Your algorithm should have a linear runtime complexity. Could you implement
	 * it without using extra memory?
	 */

	public static int singleNumber(int[] nums) {
		Map<Integer,Integer> intFreq = new HashMap<>();
		for(int i : nums) {
			intFreq.compute(i, (k,v)-> v== null? 1 : v+1);
		}
		Optional<Map.Entry<Integer, Integer>> result = intFreq.entrySet().stream().filter(e-> e.getValue() == 1).findAny();
		return result.isPresent() ? result.get().getKey() : -1;
	}
}
