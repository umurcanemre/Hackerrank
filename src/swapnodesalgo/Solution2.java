package swapnodesalgo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2 {

	static int[][] swapNodes(int[][] indexes, int[] queries) {
		Map<Integer, List<Integer>> levelAddressMap = new HashMap<>();
		
		int previousLevelNodeCount = 1;
		int currentLevelNodeCount = 0;
		int levelCounter = 2;
		for(int i=0; i<indexes.length; i++) {
			if(previousLevelNodeCount > 0) {
				List<Integer> addressCountPair = new ArrayList<>();
				addressCountPair.add(0, i);
				addressCountPair.add(1, -1);
				levelAddressMap.putIfAbsent(levelCounter, addressCountPair);
				previousLevelNodeCount--;
				for(int node : indexes[i]) {
					if(node != -1) {
						currentLevelNodeCount++;
					}
				}
				levelAddressMap.get(levelCounter).set(1, currentLevelNodeCount);
			}
			if(previousLevelNodeCount == 0) {
				previousLevelNodeCount = currentLevelNodeCount;
				currentLevelNodeCount = 0;
				levelCounter++;
			}
		}
		
		int[][] result = new int[queries.length][indexes.length];
		
		for(int q : queries) {
			int startPos = levelAddressMap.get(q+1).get(0);
			int endPos = levelAddressMap.get(q+2) != null ? levelAddressMap.get(q+2).get(0) : -1;
			
			for(int w=startPos; w< (endPos > 0 ? endPos : indexes.length); w++) {
				int temp = indexes[w][0];
				indexes[w][0] = indexes[w][1];
				indexes[w][1] = temp;
			}
			
			
			
		}
		
		return indexes;
	}
}
