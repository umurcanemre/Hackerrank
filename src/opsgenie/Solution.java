package opsgenie;

public class Solution {

	public static int firstOccurrence(String s, String x) {
		int result = -1;

		outer : for (int i = 0; i < s.length(); i++) {
			for (int q = 0; q < x.length(); q++) {
				if(x.charAt(q) == s.charAt(i) || x.charAt(q) == '*') {
					result = result > 0 ? result : i;
					i = i+1 < s.length() ? i+1 : i;
					if(q +1 == x.length()) {
						return result;
					}
				}
				else {
					result = -1;
					continue outer;
				}
			}
		}

		return result;
	}

}
