package abbreviation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
	
    static String abbreviation(String a, String b) {
    	if(!precontitions(a,b)){
    		return "NO";
    	}
    	
    	Map<Character,Integer> charPositions = new LinkedHashMap<Character, Integer>(); 
    	b.chars().forEach(c-> charPositions.put((char)c, 0));
    	
        int aPtr = 0;

		for (int q = 0; q < b.length() ; q++) {
			if(q+1<b.length() && b.charAt(q+1) == b.charAt(q)) {
				continue;
			}
        }
    	
    	
    	
        return "NO";
    }
    
    private static boolean precontitions(String a, String b) {
    	Map<Character,Integer> aS = new HashMap<>();
    	a.chars().filter(Character::isUpperCase).forEach(c-> aS.compute((char)c,(k,v)-> v==null? 1:v+1));
    	
    	Map<Character,Integer> bS = new HashMap<>();
    	b.chars().filter(Character::isUpperCase).forEach(c-> bS.compute((char)c,(k,v)-> v==null? 1:v+1));
    	
    	
    	boolean cnd1 = aS.entrySet().stream().noneMatch(e-> e.getValue() > bS.getOrDefault(e.getKey(),0));
    	
    	return cnd1;
    }
}


