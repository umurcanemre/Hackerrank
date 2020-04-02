package frequencyqueries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	static List<Integer> freqQuery(List<List<Integer>> queries) {
		Map<Integer,Integer> map = new HashMap<>();
		List<Integer> result = new ArrayList<>();
		
		for (List<Integer> q : queries) {
			switch (q.get(0)) {
			case 1:
				map.compute(q.get(1), (k,v)-> v==null ? 1 : v+1);
				break;
			case 2:
				map.computeIfPresent(q.get(1), (k,v)-> v > 1 ? v-1 : 0);
				break;
			case 3:
				result.add(
				map.entrySet().stream().anyMatch(e-> e.getValue() == q.get(1)) ? 1 : 0 );
				break;

			default:
				throw new IllegalArgumentException(q.get(0) +" is not valid");
			}
		}

		return result;
	}
}
