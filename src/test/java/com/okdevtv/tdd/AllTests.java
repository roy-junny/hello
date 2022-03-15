package com.okdevtv.tdd;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	HelloWorldTest.class, 
	StringUtilsTest.class 
})
public class AllTests {

}
