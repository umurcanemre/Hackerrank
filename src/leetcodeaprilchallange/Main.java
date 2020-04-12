package leetcodeaprilchallange;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import leetcodeaprilchallange.week1.W1D1;
import leetcodeaprilchallange.week1.W1D2;
import leetcodeaprilchallange.week1.W1D3;
import leetcodeaprilchallange.week1.W1D4;
import leetcodeaprilchallange.week1.W1D5;
import leetcodeaprilchallange.week1.W1D6;
import leetcodeaprilchallange.week1.W1D7;
import leetcodeaprilchallange.week2.W2D1;
import leetcodeaprilchallange.week2.W2D1.ListNode;
import leetcodeaprilchallange.week2.W2D2;
import leetcodeaprilchallange.week2.W2D3.MinStack;
import leetcodeaprilchallange.week2.W2D4;
import leetcodeaprilchallange.week2.W2D5;

public class Main {

	public static void main(String[] args) {

		//Day1
		int[] t1 = new int[] {2,2,1};
		int[] t2 = new int[] {4,1,2,1,2};
		assertEquals(1,W1D1.singleNumber(t1));
		assertEquals(4,W1D1.singleNumber(t2));
		System.out.println("Day1 - ok");

		//Day2
		assertEquals(true,W1D2.isHappy(19));
		System.out.println("Day2 - ok");

		//Day3
		t1 = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		t2 = new int[] {-2,1,-3,4,-1,2,1,-5,4,2};
		int[] t3 = new int[] {-2,-3,-1,-5};
		int[] t4 = new int[] {-2,-3,0,-1,-5};
		assertEquals(6,W1D3.maxSubArray(t1));
		assertEquals(7,W1D3.maxSubArray(t2));
		assertEquals(-1,W1D3.maxSubArray(t3));
		assertEquals(0,W1D3.maxSubArray(t4));
		System.out.println("Day3 - ok");

		//Day4
		t1 = new int[] {0,1,0,3,12};
		W1D4.moveZeroes(t1);
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
		assertEquals(7,W1D5.maxProfit(t1));
		assertEquals(4,W1D5.maxProfit(t2));
		assertEquals(0,W1D5.maxProfit(t3));
		assertEquals(2,W1D5.maxProfit(t4));
		System.out.println("Day5 - ok");

		//Day6
		String[] s1 = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
		assertEquals(3,W1D6.groupAnagrams(s1).get(0).size());
		assertTrue(W1D6.groupAnagrams(s1).get(0).containsAll(Arrays.asList("eat", "tea", "ate")));
		assertEquals(2,W1D6.groupAnagrams(s1).get(1).size());
		assertTrue(W1D6.groupAnagrams(s1).get(1).containsAll(Arrays.asList("nat", "tan")));
		assertEquals(1,W1D6.groupAnagrams(s1).get(2).size());
		assertTrue(W1D6.groupAnagrams(s1).get(2).containsAll(Arrays.asList("bat")));
		System.out.println("Day6 - ok");

		//Day7
		t1 = new int[] {1,2,3};
		t2 = new int[] {1,1,3,3,5,5,7,7};
		t3 = new int[] {1,3,2,3,5,0};
		t4 = new int[] {1,1,2,2};
		assertEquals(2,W1D7.countElements(t1));
		assertEquals(0,W1D7.countElements(t2));
		assertEquals(3,W1D7.countElements(t3));
		assertEquals(2,W1D7.countElements(t4));
		System.out.println("Day7 - ok");

		//Day8
		ListNode nRoot = new ListNode(1);
		ListNode nextNode1 = new ListNode(2);
		nRoot.next = nextNode1;
		ListNode nextNode2 = new ListNode(3);
		nextNode1.next = nextNode2;
		nextNode1 = new ListNode(4);
		nextNode2.next = nextNode1;
		nextNode2 = new ListNode(5);
		nextNode1.next = nextNode2;

		assertEquals(3,W2D1.middleNode(nRoot).val);
		nextNode1 = new ListNode(6);
		nextNode2.next = nextNode1;
		assertEquals(4,W2D1.middleNode(nRoot).val);
		System.out.println("Day8 - ok");

		

		//Day9
		assertEquals(true,W2D2.backspaceCompare("ab#c", "ad#c"));
		assertEquals(true,W2D2.backspaceCompare("ab##", "c#d#"));
		assertEquals(true,W2D2.backspaceCompare("a##c", "#a#c"));
		assertEquals(false,W2D2.backspaceCompare("a#c", "b"));
		assertEquals(false,W2D2.backspaceCompare("bxj##tw", "bxj###tw"));
		assertEquals(false,W2D2.backspaceCompare("bbbextm", "bbb#extm"));
		assertEquals(true,W2D2.backspaceCompare("nzp#o#g", "b#nzp#o#g"));			
		System.out.println("Day9 - ok");
		
		//Day10
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		assertEquals(-3,minStack.getMin());  
		minStack.pop();
		assertEquals(0,minStack.top());
		assertEquals(-2,minStack.getMin());
		
		minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-1);
		assertEquals(-2,minStack.getMin());  
		assertEquals(-1,minStack.top());
		minStack.pop();
		assertEquals(-2,minStack.getMin());		
		System.out.println("Day10 - ok");
		
		//Day11		
		W2D4.runTests();
		System.out.println("Day11 - ok");
		
		//Day12	
		assertEquals(1, W2D5.lastStoneWeight(new int[] {2,7,4,1,8,1}));
		assertEquals(32, W2D5.lastStoneWeight(new int[] {2,20,4,1,60,1}));
		assertEquals(3, W2D5.lastStoneWeight(new int[] {3}));
		assertEquals(3, W2D5.lastStoneWeight(new int[] {3,3,3,3,3}));
		System.out.println("Day12 - ok");
		
		
		
		System.out.println("All - ok");
	}

}
