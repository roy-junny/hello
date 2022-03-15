package com.okdevtv.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void test() {
		
		StringUtils stringUtils = new StringUtils();
		
		assertEquals("1,000", stringUtils.comma(1000));
		assertEquals("10,000", stringUtils.comma(10000));
		assertEquals("100,000", stringUtils.comma(100000));
		assertEquals("1,200,000", stringUtils.comma(1200000));
	}

}
