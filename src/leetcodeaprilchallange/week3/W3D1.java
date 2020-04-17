package leetcodeaprilchallange.week3;

/**
 * Given an array nums of n integers where n > 1, return an array output such
 * that output[i] is equal to the product of all the elements of nums except
 * nums[i].
 * 
 * Example:
 * 
 * Input: [1,2,3,4] Output: [24,12,8,6]
 * 
 * Constraint: It's guaranteed that the product of the elements of any prefix or
 * suffix of the array (including the whole array) fits in a 32 bit integer.
 * 
 * Note: Please solve it without division and in O(n).
 * 
 * Follow up: Could you solve it with constant space complexity? (The output
 * array does not count as extra space for the purpose of space complexity
 * analysis.)
 *
 * 
 */
public class W3D1 {
	public static int[] productExceptSelf(int[] nums) {
		int[] output = nums.clone();

		int zeroCount = 0;
		int behindProd = 1;
		int forwardProd = 1;
		for (int i = 1; i < nums.length && zeroCount < 2; i++) {
			if (nums[i] == 0) {
				zeroCount++;
				forwardProd = 0;
			} else {
				forwardProd *= nums[i];
			}
		}

		for (int i = 0; i < nums.length; i++) {
			int pp = nums[i];

			if (zeroCount == 1 && nums[i] == 0) {
				forwardProd = 1;
				for (int q = i + 1; q < nums.length; q++) {
					forwardProd *= nums[q];
				}

			}
			output[i] = behindProd * forwardProd;

			behindProd *= pp;
			if (i + 1 < nums.length) {
				forwardProd = forwardProd == 0 ? forwardProd : forwardProd / nums[i + 1];
			}

		}

		return output;
	}
}
