package com.example;

public class TestAlpha {
	public static void main(String[] args) {
		test1();
		TestAlpha obj1 = new TestAlpha();
		obj1.test2();
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
