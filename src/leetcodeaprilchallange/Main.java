package leetcodeaprilchallange;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

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

		//Day4
		t1 = new int[] {0,1,0,3,12};
		Day4.moveZeroes(t1);
		assertEquals(1,t1[0]);
		assertEquals(3,t1[1]);
		assertEquals(12,t1[2]);
		assertEquals(0,t1[3]);
		assertEquals(0,t1[4]);		
		System.out.println("Day4 - ok");

		//Day5
		t1 = new int[] {7,1,5,3,6,4};
		t2 = new int[] {1,2,3,4,5};
		t3 = new int[] {7,6,4,3,1};
		t4 = new int[] {2,4,1};
		assertEquals(7,Day5.maxProfit(t1));
		assertEquals(4,Day5.maxProfit(t2));
		assertEquals(0,Day5.maxProfit(t3));
		assertEquals(2,Day5.maxProfit(t4));
		System.out.println("Day5 - ok");

		//Day6
		String[] s1 = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
		assertEquals(3,Day6.groupAnagrams(s1).get(0).size());
		assertTrue(Day6.groupAnagrams(s1).get(0).containsAll(Arrays.asList("eat", "tea", "ate")));
		assertEquals(2,Day6.groupAnagrams(s1).get(1).size());
		assertTrue(Day6.groupAnagrams(s1).get(1).containsAll(Arrays.asList("nat", "tan")));
		assertEquals(1,Day6.groupAnagrams(s1).get(2).size());
		assertTrue(Day6.groupAnagrams(s1).get(2).containsAll(Arrays.asList("bat")));
		System.out.println("Day6 - ok");
		
		
		
		
		System.out.println("All - ok");
	}

}
