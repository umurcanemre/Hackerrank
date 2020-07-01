package jrQuestions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q1 {
	public static void commonSubstring(List<String> a, List<String> b) {
		Set<Character> charSet = new HashSet<>();
		for(int i=0; i<a.size(); i++) {
			for(char charVal : a.get(i).toCharArray()) {
				charSet.add(charVal);
			}
			
			boolean foundFlag = false;
			for(char charVal : b.get(i).toCharArray()) {
				if(charSet.contains(charVal)) {
					foundFlag=true;
					break;
				}
			}
			
			System.out.println(foundFlag ? "YES" : "NO");
			charSet.clear();
		}

	}
}
