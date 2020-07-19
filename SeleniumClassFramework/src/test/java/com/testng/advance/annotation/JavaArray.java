package com.testng.advance.annotation;

import java.util.Arrays;

public class JavaArray {

	public static void main(String[] args) {
//		String[] s = {"Sarower", "5555"};
//
//		System.out.println(s[0]);
//		System.out.println(s[1]);
//		System.out.println(Arrays.toString(s));

		String[][] t ={ {"Sarower", "3333"},{"Ahmmed", "9999"} };

	// column1      column2
	//	"Sarower", "3333" row1
	//	"Ahmmed",  "9999" row2
		
		System.out.println(t[0][0] +"    "+ t[0][1]);//sarower + 3333
		System.out.println(t[1][0] +"    "+ t[1][1]);//ahmmed + 9999


	}

}
