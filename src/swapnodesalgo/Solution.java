package swapnodesalgo;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	static Map<Integer,  int[]> nodeMap = new HashMap<>();
	static int[][] swapNodes(int[][] indexes, int[] queries) {
		
		int node = 1;
		int nodeChildCount = 0;
		
		for(int i=0; i<indexes.length; i++) {
			nodeMap.put(node, indexes[i]);
			nodeChildCount = validNodes(indexes[i]);
			
		}
		
		return null;
	}
	
	static int validNodes(int[] validNodes) {
		int res = 0;
		for(int i : validNodes)
			if(i > 0) 
				res++;
		
		return res;
	}
}
