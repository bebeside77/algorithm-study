package com.may.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * @author bebeside77
 */
public class CountNumber {

	public int countWithCache(int num, int target) {
		Map<Integer, Integer> cache = new HashMap<>();

		int totalCount = 0;

		for (int i = 0; i <= num; i++) {
			Integer cacheCount = cache.get(i / 10);

			int count = (cacheCount == null ? 0 : cacheCount) + (i % 10 == target ? 1 : 0);
			cache.put(i, count);

			totalCount += count;
		}

		return totalCount;
	}

	public int count(int number, int target) {
		int sum = 0;

		for (int i = 1; i <= number; i++) {
			int num = i;

			while (num != 0) {
				if (num % 10 == target) {
					sum += 1;
				}

				num /= 10;
			}
		}

		return sum;
	}

}
