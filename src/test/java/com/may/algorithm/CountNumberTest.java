package com.may.algorithm;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.InjectMocks;

/**
 *
 *
 * @author bebeside77
 */
public class CountNumberTest {
	@InjectMocks
	private CountNumber countNumber = new CountNumber();

	@Test
	public void countWithCache() throws Exception {
		assertThat(countNumber.countWithCache(10000000, 8), is(4000));
	}

	@Test
	public void count() throws Exception {
		assertThat(countNumber.count(10000000, 8), is(4000));
	}
}