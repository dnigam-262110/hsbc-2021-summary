package com.example;

public class TestAlpha {
	public static void main(String[] args) {
		checkAlphabet('*');
		checkAlphabet('E');
	}
	public static void checkAlphabet(char c) {
		if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
			System.out.println(c+" is an alphabet");
		} else {
			System.out.println(c+" is not an alphabet");
		}
	}
	public static void test1() {
		System.out.println("test1() method");
	}
	public void test2() {
		System.out.println("test2() method");
	}
	public void test3() {
		test1();
		test2();
		System.out.println("test3() method");
	}
	public static void test4() {
		test1();
		
	}
}
