package com.example;

/*
 * By default a class will have a default constructor if in case there is no constructor defined,
 * If the constructor is defined then default constructor wouldn't be created, the defined constructor
 * could be default or parameterized constructor
 */
public class Demo {
	Demo() {
		System.out.println("Demo() constructor");
	}
	Demo(int a) {
		System.out.println("Demo(int) constructor");
	}
	// Static Initialization Block
	static {
		System.out.println("SIB-Demo");
	}
	// Instance Initialization Block
	{
		System.out.println("IIB-Demo");
	}
	public void test1() {
		System.out.println("test1()-Demo");
	}
	public static void test2() {
		System.out.println("static test2()-Demo");
	}
}
