package com.may.algorithm;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author yuwook
 */
public class PalindromeCheckTest {
	private PalindromeCheck palindromeCheck = new PalindromeCheck();

	@Test
	public void isPalindrome() throws Exception {
		assertThat(palindromeCheck.isPalindrome("eye"), is(true));
		assertThat(palindromeCheck.isPalindrome("level"), is(true));
		assertThat(palindromeCheck.isPalindrome("abaaba"), is(true));
		assertThat(palindromeCheck.isPalindrome("good"), is(false));
	}

}