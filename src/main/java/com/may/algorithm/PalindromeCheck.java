/*
 * @(#)PalindromeCheck.java  2016.11.30
 *
 * Copyright 2016 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.may.algorithm;

/**
 * @author bebeside77
 */
public class PalindromeCheck {

	public boolean isPalindrome(String string) {
		for (int i = 0; i < string.length() / 2; i++) {
			int length = string.length();

			if (string.charAt(i) != string.charAt(length - 1 - i)) {
				return false;
			}
		}

		return true;
	}

}
