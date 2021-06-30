package com.bridgelabs;

import java.util.Arrays;
import java.util.Collections;

public class MinMax {
	
	public static void main(String[] args) {
	      Integer[] numbers = { 8, 2, 7};
	      Integer maxint = (int) Collections.max(Arrays.asList(numbers));
	     
	      toPrint(maxint);
	   }
	private static void toPrint(Integer maxint) {
		System.out.println(maxint);
		
	}

}
