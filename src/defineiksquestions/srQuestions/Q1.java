package srQuestions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q1 {
	public static int getMinimumUniqueSum(List<Integer> arr) {
		Set<Integer> foundNums = new HashSet<Integer>();
		
		for(Integer i : arr) {
			int num ;
			for(num = i.intValue(); foundNums.contains(num); num++);
							
			foundNums.add(num);
		}

		return foundNums.stream().reduce(0, Integer::sum);
	}
}
