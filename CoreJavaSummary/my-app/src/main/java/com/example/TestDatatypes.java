package com.example;

public class TestDatatypes {
	/*
	 * byte - 1(-128 to +127), short - 2, int - 4, long - 8
	 */
	public static void main(String[] args) {
		byte byteValue1 = 127;  // binary value for 127 is 01111111
		//byte byteValue2 = 128; // binary value for 128 is 010000000 
//		byte byteValue3 = 20 + 110;
		char charValue1 = 'a';
		System.out.println("Byte Value: "+byteValue1+", Char Value: "+charValue1);
		char charValue2 = 65;
		System.out.println("Char Value2: "+charValue2);
		int intValue1 = 'a';
		System.out.println("Int Value1: "+intValue1);
		long longValue1 = 929392939393L;
		System.out.println("Long Value1: "+longValue1);
	}
}
