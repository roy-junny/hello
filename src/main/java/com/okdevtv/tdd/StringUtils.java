package com.okdevtv.tdd;

import java.text.NumberFormat;
import java.util.Locale;

public class StringUtils {

	public String comma( int num ) {
		String string = NumberFormat.getNumberInstance(Locale.US).format(num);
		return string ;
	}
}
