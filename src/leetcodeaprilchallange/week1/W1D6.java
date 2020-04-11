package leetcodeaprilchallange.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given an array of strings, group anagrams together.
 * 
 * Example:
 * 
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [
 * ["ate","eat","tea"], ["nat","tan"], ["bat"] ]
 * 
 * Note:
 * 
 * All inputs will be in lowercase. The order of your output does not matter.
 *
 * 
 */

public class W1D6 {
	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> anagramMap = new LinkedHashMap<>();		
		
		for(String str : strs) {
			char[] strCharArr =str.toCharArray();
			Arrays.sort(strCharArr);
			String sortedStr = new String(strCharArr);
			
			anagramMap.putIfAbsent(sortedStr, new ArrayList<String>());
			anagramMap.get(sortedStr).add(str);
		}
		
		return anagramMap.values().stream().collect(Collectors.toList());
	}
}
