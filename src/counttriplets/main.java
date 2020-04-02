package counttriplets;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		//https://www.hackerrank.com/challenges/count-triplets-1

		System.out.println(Solution.countTriplets(Arrays.asList(1l,2l,2l,4l), 2l));
		System.out.println(Solution.countTriplets(Arrays.asList(1l, 3l, 9l, 9l, 27l, 81l), 3l));
		System.out.println(Solution.countTriplets(Arrays.asList(1l,5l,5l,25l,125l), 5l));
	}

}
