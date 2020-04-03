package leetcodeaprilchallange;

/**
 * Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum.
 * 
 * Example:
 * 
 * Input: [-2,1,-3,4,-1,2,1,-5,4], Output: 6 Explanation: [4,-1,2,1] has the
 * largest sum = 6.
 * 
 * Follow up:
 * 
 * If you have figured out the O(n) solution, try coding another solution using
 * the divide and conquer approach, which is more subtle.
 *
 * 
 */

public class Day3 {
	public static int maxSubArray(int[] nums) {
		int result = nums[0];
		int tempResult = nums[0];
		for (int i = 1; i < nums.length; i++) {

			tempResult = calculateWindow(tempResult, nums[i]);

			if (tempResult >= result) {
				result = tempResult;
			}
		}

		return result;
	}

	private static int calculateWindow(int tempResult, int arrayValue) {
		if (arrayValue > tempResult && arrayValue > (tempResult + arrayValue))
			return arrayValue;
		else
			return (tempResult + arrayValue);

	}
}
