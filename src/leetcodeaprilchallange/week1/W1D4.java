package leetcodeaprilchallange.week1;

/**
 * 
 * Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements.
 * 
 * Example:
 * 
 * Input: [0,1,0,3,12] Output: [1,3,12,0,0]
 * 
 * Note:
 * 
 * You must do this in-place without making a copy of the array. Minimize the
 * total number of operations.
 *
 * 
 */
public class W1D4 {
	public static void moveZeroes(final int[] nums) {
		int encounteredZeros = 0;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == 0) {
				encounteredZeros++;
			}
			else {
				nums[i - encounteredZeros] = nums[i];
			}
		}
		for(int i=1; i<=encounteredZeros; i++) {
			nums[nums.length-i] = 0;
		}
	}
}
