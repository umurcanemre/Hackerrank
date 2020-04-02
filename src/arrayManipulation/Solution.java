package arrayManipulation;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	static long arrayManipulation(int n, int[][] queries) {
		List<Long> list = initList(n);
		long result = 0l;	
		
		for(int i=0; i<queries.length; i++) {
			for(int q = queries[i][0] -1; q< queries[i][1]; q++) {
				list.set(q,list.get(q) + queries[i][2]);
				
				result = list.get(q) > result ? list.get(q) : result;
			}
		}

		return result;
    }
	
	private static List<Long> initList(int size){
		List<Long> list = new ArrayList<>();
		
		for(int i=0; i<size; i++)
			list.add(i, 0l);
		
		return list;
	}
}
