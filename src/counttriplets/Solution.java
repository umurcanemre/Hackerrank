package counttriplets;

import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
    static long countTriplets(List<Long> arr, long r) {
    	SortedMap<Long, Integer>  valMap = new TreeMap<> ();
    	arr.forEach(val -> valMap.compute(val,(k,v) -> v == null ? 1 : v+1));
    	
    	long count = 0l;
    	for(int pow = 0; Math.pow(r, pow+2) < Long.MAX_VALUE; pow++) {
    		int low = valMap.getOrDefault((long)Math.pow(r, pow),0);
    		int mid = valMap.getOrDefault((long)Math.pow(r, pow+1),0);
    		int hi = valMap.getOrDefault((long)Math.pow(r, pow+2),0);
    		
    		count += low * mid * hi;
    	}   	
    	
    	return count;
    }
}
