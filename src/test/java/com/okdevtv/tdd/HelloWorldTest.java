package com.okdevtv.tdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
	private HelloWorld hello ;
	
	@Before
	public void setup() {
		hello = new HelloWorld() ;
	}

	@Test
	public void test() {
		String helloMsg = hello.getMessage() ;
		assertEquals("Hello World", helloMsg) ;
	}
	
	@Test
	public void testMsgName() {
		String helloMsg = hello.getMessage("sjlee") ;
		assertEquals("Hello sjlee", helloMsg) ;
	}
	
	@Test
	public void testMsgNull() {
		String helloMsg = hello.getMessage(null) ;
		assertEquals("Hello ", helloMsg) ;
	}


}
