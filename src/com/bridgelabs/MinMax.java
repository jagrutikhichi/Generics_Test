package com.bridgelabs;

import java.util.Arrays;
import java.util.Collections;

public class MinMax {
	
	public static void main(String[] args) {
	      Integer[] numbers = { 8, 2, 7};
	      Integer maxint = (int) Collections.max(Arrays.asList(numbers));
	      Float[] num = {2.3f, 4.7f, 1.1f};
	      Float maxfloat = (float) Collections.max(Arrays.asList(num));

	      toPrint(maxfloat);	     
	      toPrint(maxint);
	   }
	private static void toPrint(Float maxfloat) {
		System.out.println(maxfloat);
		
	}

	private static void toPrint(Integer maxint) {
		System.out.println(maxint);
		
	}

}
