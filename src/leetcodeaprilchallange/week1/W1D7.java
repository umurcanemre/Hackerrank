package leetcodeaprilchallange.week1;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array arr, count element x such that x + 1 is also in arr.
 * 
 * If there're duplicates in arr, count them seperately.
 *
 */
public class W1D7 {
	public static int countElements(int[] arr) {
		Map<Integer,Integer> valueMap = new HashMap<>();
		
		for(int i : arr) {
			valueMap.compute(i, (k,v)-> v ==null? 1 : v+1);
		}
		
		
		int result = 0;
		for(Map.Entry<Integer, Integer> e : valueMap.entrySet()) {
			if(valueMap.containsKey(e.getKey()+1)) {
				result += e.getValue();
			}
		}	
		
		return result;
	}
}
