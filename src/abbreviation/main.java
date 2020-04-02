package abbreviation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class main {

	@Test
	public static void main(String[] args) {
		//https://www.hackerrank.com/challenges/abbr

		assertEquals("YES", Solution.abbreviation("aaabaAaFdE","AAAFE"));
		assertEquals("YES", Solution.abbreviation("aaabaAaFdE","AFE"));
		assertEquals("YES", Solution.abbreviation("aafeabaAaFdE","AFE"));
		assertEquals("NO", Solution.abbreviation("aaaAabCFdE","AFE"));
		System.out.println(Solution.abbreviation("AbCdE","AFE"));
		System.out.println(Solution.abbreviation("beFgH","EFH"));
		System.out.println(Solution.abbreviation("daBcd","ABC"));
	}

}


