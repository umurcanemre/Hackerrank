package opera;

public class Solution {
	public static String solution(String T) {

		StringBuilder s = new StringBuilder();
		StringBuilder m = new StringBuilder();
		StringBuilder l = new StringBuilder(); 
		  
	        for(char c : T.toCharArray()) {
	        	if(c =='S')
	        		s.append("S");
	        	if(c =='M')
	        		m.append("M");
	        	if(c =='L')
	        		l.append("L");
	        }
	        s.append(m).append(l);
	        return s.toString() ;
	    }

}
