package com.okdevtv.tdd;

public class HelloWorld {
	
	public String getMessage() {
		return getMessage("World") ;
	}
	
	public String getMessage(String string) {
		if( string == null ) string = "" ;
		return "Hello " + string ;
	}
}
