package ransomnote;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	static void checkMagazine(String[] magazine, String[] note) {
		  Map<String,Integer> magazineWordMap = new HashMap<>();
		  Map<String,Integer> noteWordMap = new HashMap<>();

		  for(String s: magazine)
			  magazineWordMap.compute(s.toLowerCase(), (k,v) -> v == null ? 1 : v+1);
		  for(String s: note)
			  noteWordMap.compute(s.toLowerCase(), (k,v) -> v == null ? 1 : v+1);
		  
		  boolean condition = noteWordMap.entrySet().stream().allMatch(e-> magazineWordMap.getOrDefault(e.getKey(),0) >= e.getValue());
		  if(condition)
			  System.out.println("YES");
		  else
			  System.out.println("NO");
	    }
}
