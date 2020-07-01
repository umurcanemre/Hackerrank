package srQuestions;

public class Q2 {

	public static int countPalindromes(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				if(checkForPalindrome(s.substring(i,j))) {
					result++;
				}
			}
		}
		
	    
		return result;
	}
	
	private static boolean checkForPalindrome(String s) {
	    for (int i = 0; i < s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				return false;
			}
		}
	    return true;
	}
}
