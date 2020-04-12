package leetcodeaprilchallange.week2;

/**
 * We have a collection of stones, each stone has a positive integer weight.
 * 
 * Each turn, we choose the two heaviest stones and smash them together. Suppose
 * the stones have weights x and y with x <= y. The result of this smash is:
 * 
 * If x == y, both stones are totally destroyed; If x != y, the stone of weight
 * x is totally destroyed, and the stone of weight y has new weight y-x.
 * 
 * At the end, there is at most 1 stone left. Return the weight of this stone
 * (or 0 if there are no stones left.)
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: [2,7,4,1,8,1] Output: 1 Explanation: We combine 7 and 8 to get 1 so
 * the array converts to [2,4,1,1,1] then, we combine 2 and 4 to get 2 so the
 * array converts to [2,1,1,1] then, we combine 2 and 1 to get 1 so the array
 * converts to [1,1,1] then, we combine 1 and 1 to get 0 so the array converts
 * to [1] then that's the value of last stone.
 * 
 * 
 * 
 * Note:
 * 
 * 1 <= stones.length <= 30 1 <= stones[i] <= 1000
 *
 * 
 */
public class W2D5 {
	public static int lastStoneWeight(int[] stones) {
		if(stones.length == 1)
			return stones[0];
		int[] twoGreatest = getGreatestPos(stones);
		
		while(stones[twoGreatest[0]] > 0 && stones[twoGreatest[1]] > 0) {
			smashTwoGreatest(stones, twoGreatest);
			twoGreatest = getGreatestPos(stones);
		}
		
		return stones[twoGreatest[0]];
	}
	private static void smashTwoGreatest(int[] stones,int[] greatest) {
		stones[greatest[0]] = stones[greatest[0]] - stones[greatest[1]] ; 
		stones[greatest[1]] = 0;
	}
	private static int[] getGreatestPos(int[] stones) {
		int[] result = new int[] {0,0};
		int greatest = -1;
		int secondGreatest = -1;
		
		for(int i = 0; i<stones.length; i++) {
			if(stones[i] > greatest) {
				secondGreatest = greatest;
				greatest = stones[i];
				result[1] = result[0];
				result[0] = i;
			}
			if(stones[i] > secondGreatest && stones[i] <= greatest && i!= result[0]) {
				secondGreatest = stones[i];
				result[1] = i;
			}
		}
		return result;
	}
}
