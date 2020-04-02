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
		
		
		
		
		System.out.println("All - ok");
	}

}
