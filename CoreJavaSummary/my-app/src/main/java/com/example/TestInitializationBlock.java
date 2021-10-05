package com.example;

public class TestInitializationBlock {

	public static void main(String[] args) {
		System.out.println("main starts");
		Demo.test2();
		Demo.test2();
		Demo.test2();
		Demo.test2();
		System.out.println("---------------");
		Demo d1 = new Demo(); // IIB-Demo Demo()
		Demo d2 = new Demo(20); // IIB-Demo Demo(int)
		TestInitializationBlock tib = new TestInitializationBlock();
		System.out.println("main ends");
	}

	static {
		System.out.println("SIB-TestInitializationBlock");
	}
	
	{
		System.out.println("IIB-TestInitializationBlock");
	}
}
/*
	Once the class loads all the static members will be loaded
*/