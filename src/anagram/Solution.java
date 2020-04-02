package anagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	static int sherlockAndAnagrams(String s) {
		int count = 0;
		for(int size = 1; size <= s.length(); size++) {
			for(int i = 0; i + size < s.length(); i++) {
				String src = s.substring(i,i+size);
				Map<Character, Integer> charCountMapSrc = new HashMap<>();
				src.chars().forEach(c-> charCountMapSrc.compute((char)c, (k,v)-> v == null ? 1 : v + 1));
				
				for(int inner = i+1; inner + size <= s.length(); inner ++) {
					String cmpr = s.substring(inner, inner + size);
					Map<Character, Integer> charCountMapCmpr= new HashMap<>();
					cmpr.chars().forEach(c-> charCountMapCmpr.compute((char)c, (k,v)-> v == null ? 1 : v + 1));
					
					boolean successFlag = true;
					for(Map.Entry<Character, Integer> e : charCountMapSrc.entrySet()) {
						if(e.getValue().compareTo(charCountMapCmpr.getOrDefault(e.getKey(), 0)) != 0) {
							successFlag = false;
							break;
						}
					}
					
					if(successFlag) {
						count++;
					}
				}
			}
		}
		
		return count;
	}
}
