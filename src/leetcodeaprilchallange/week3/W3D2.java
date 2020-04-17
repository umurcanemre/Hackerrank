package leetcodeaprilchallange.week3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Given a string containing only three types of characters: '(', ')' and '*',
 * write a function to check whether this string is valid. We define the
 * validity of a string by these rules:
 * 
 * Any left parenthesis '(' must have a corresponding right parenthesis ')'. Any
 * right parenthesis ')' must have a corresponding left parenthesis '('. Left
 * parenthesis '(' must go before the corresponding right parenthesis ')'. '*'
 * could be treated as a single right parenthesis ')' or a single left
 * parenthesis '(' or an empty string. An empty string is also valid.
 * 
 * Example 1:
 * 
 * Input: "()" Output: True
 * 
 * Example 2:
 * 
 * Input: "(*)" Output: True
 * 
 * Example 3:
 * 
 * Input: "(*))" Output: True
 * 
 * Note:
 * 
 * The string size will be in the range [1, 100].
 *
 * 
 */
public class W3D2 {
	public static boolean checkValidString2(String s) {
		int starCount = 0;
		int starOpenCount = 0;
		int openCount = 0;
		int closeCount = 0;
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case '(':
				openCount++;
				break;
			case ')':
				closeCount++;
				break;
			case '*':
				if (openCount > closeCount)
					starCount++;
				else
					starOpenCount++;
				break;
			default:
				throw new IllegalArgumentException("Char not supported " + s.charAt(i));
			}

			if (closeCount > openCount + starCount + starOpenCount)
				return false;
			if (closeCount + starCount > openCount + starOpenCount) {
				int diff = (closeCount + starCount) - (openCount + starOpenCount);
				starOpenCount += diff;
				starCount -= diff;
			}
		}
		if (openCount == closeCount)
			return true;

		if (openCount < closeCount) {
			return openCount + starCount + starOpenCount >= closeCount;
		} else {
			return closeCount + starCount >= openCount;
		}
	}

	public static boolean checkValidString(String s) {
		LinkedList<Integer> starPos = new LinkedList<>();
		LinkedList<Integer> closingStarPos = new LinkedList<>();
		int openCount = 0;
		int closeCount = 0;
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case '(':
				openCount++;
				break;
			case ')':
				closeCount++;
				break;
			case '*':
				closingStarPos.add(i);
				closeCount++;
				break;
			default:
				throw new IllegalArgumentException("Char not supported " + s.charAt(i));
			}
			if (closeCount > openCount) {
				if (!closingStarPos.isEmpty()) {
					starPos.add(closingStarPos.pop());
					closeCount--;
				}
				else {
					if (!starPos.isEmpty()) {
						starPos.pop();
						openCount++;
					} 
					else
						return false;
				}
			}
		}
		if (starPos.isEmpty())
			return openCount == closeCount;
		else
			return openCount <= closeCount && openCount + starPos.size() >= closeCount;
	}
}