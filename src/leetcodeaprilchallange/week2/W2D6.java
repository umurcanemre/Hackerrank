package leetcodeaprilchallange.week2;

/**
 * 
 * 
 * Given a binary array, find the maximum length of a contiguous subarray with
 * equal number of 0 and 1.
 * 
 * Example 1:
 * 
 * Input: [0,1] Output: 2 Explanation: [0, 1] is the longest contiguous subarray
 * with equal number of 0 and 1.
 * 
 * Example 2:
 * 
 * Input: [0,1,0] Output: 2 Explanation: [0, 1] (or [1, 0]) is a longest
 * contiguous subarray with equal number of 0 and 1.
 * 
 * Note: The length of the given binary array will not exceed 50,000.
 */
public class W2D6 {
	public static int findMaxLength2(int[] nums) {
		int result = 0;
		int startOfCount = 0;
		int status = 0;
		boolean hasChanged = false;
		int lastVal = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (!hasChanged && lastVal != nums[i]) {
				hasChanged = true;
			} else if ((hasChanged && lastVal != nums[i])) {
				startOfCount = i;
				status = 0;
				lastVal = nums[i];
			}

			status = nums[i] == 0 ? status - 1 : status + 1;

			if (status == 0) {
				result = result > (i - startOfCount) + 1 ? result : (i - startOfCount) + 1;
				hasChanged = false;
			}
		}

		return result;
	}

	public static int findMaxLength3(int[] nums) {
		int result = 0;
		int startOfCount = 0;
		int status = 0;
		int maxStatus = 0;
		int i;
		for (i = 0; i < nums.length; i++) {

			status = nums[i] == 0 ? status - 1 : status + 1;
			if (nums[i] != nums[startOfCount]) {
				if ((nums[startOfCount] == 0 && status > 0) || (nums[startOfCount] == 1 && status < 0)) {
					result = result > (i - startOfCount) ? result : (i - startOfCount) ;
					startOfCount = i;
				}
			}
			else {
				if(Math.abs(status) == maxStatus) {
					int resCandI = (i - startOfCount) -Math.abs(status);
					resCandI = resCandI %2 == 0 ? resCandI : resCandI-1;
					result = result > resCandI  ? result : resCandI ;
					startOfCount = i-Math.abs(status);
					status = 0;
					i = startOfCount-1;
					maxStatus = 0;
					continue;
				}
			}
			maxStatus = Math.abs(status)> Math.abs(maxStatus) ? Math.abs(status) : status == 0? 0 : maxStatus;
		}
		
		int resCand = (i - startOfCount) -Math.abs(status);
		return result > resCand  ? result :resCand;
	}
	

	public static int findMaxLength(int[] nums) {
		int[] sumMap = new int[nums.length+1];		
		sumMap[0] = 0;
		int sum = 0;
		for(int i=0; i< nums.length; i++) {
			sum = nums[i] == 0 ? sum -1 : sum + 1;
			
			sumMap[i+1] = sum;
		}
		
		return extractMaxDistance(sumMap);
	}
	private static int extractMaxDistance(int[] sumMap) {
		int result = 0;
		outer : for(int i=0; i<sumMap.length-result; i++) {
			for(int q = sumMap.length -1; q>=result; q--) {
				if(sumMap[i] == sumMap[q]) {
					result = result > q-i ? result : q-i ;
					continue outer;
				}
			}			
		}
		
		return result;
	}
}
