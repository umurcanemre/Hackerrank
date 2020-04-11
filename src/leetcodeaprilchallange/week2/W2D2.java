package leetcodeaprilchallange.week2;

public class W2D2 {
	public static boolean backspaceCompare(String S, String T) {
		int sPtr = S.length() - 1;
		int tPtr = T.length() - 1;

		while (sPtr >= 0 && tPtr >= 0) {
			sPtr = getRealCharPos(S, sPtr);
			tPtr = getRealCharPos(T, tPtr);
			
			if((sPtr < 0 || tPtr <0) && sPtr != tPtr) {
				return false;
			}
			if(sPtr > 0 && S.charAt(sPtr) != T.charAt(tPtr)) {
				return false;
			}

			sPtr--;
			tPtr--;
		}

		return getRealCharPos(S,sPtr) == getRealCharPos(T,tPtr);
	}
	
	private static int getRealCharPos(String s, int ptr) {
		int BSC = 0;
		while(ptr>= 0 && (s.charAt(ptr) == '#' || BSC > 0)) {
			if(s.charAt(ptr) == '#') {
				BSC++;
			}
			else {
				BSC--;
			}
			ptr--;
		}
		
		return ptr;
	}
}
