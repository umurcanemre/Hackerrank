package leetcodeaprilchallange;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

	public static void main(String[] args) {

		//Day1
		int[] t1 = new int[] {2,2,1};
		int[] t2 = new int[] {4,1,2,1,2};
		assertEquals(1,Day1.singleNumber(t1));
		assertEquals(4,Day1.singleNumber(t2));
		System.out.println("Day1 - ok");

		//Day2
		assertEquals(true,Day2.isHappy(19));
		System.out.println("Day2 - ok");

		//Day3
		t1 = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		t2 = new int[] {-2,1,-3,4,-1,2,1,-5,4,2};
		int[] t3 = new int[] {-2,-3,-1,-5};
		int[] t4 = new int[] {-2,-3,0,-1,-5};
		assertEquals(6,Day3.maxSubArray(t1));
		assertEquals(7,Day3.maxSubArray(t2));
		assertEquals(-1,Day3.maxSubArray(t3));
		assertEquals(0,Day3.maxSubArray(t4));
		System.out.println("Day3 - ok");
		
		
		
		
		System.out.println("All - ok");
	}

}
