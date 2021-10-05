package com.example;

public class FirstApp {

	/*
	 * args is the command line argument
	 * java FirstApp abc.txt
	 */
	public static void main(String[] args) {
		System.out.println("main starts");
		System.out.println("Size of args: "+args.length);
		System.out.println(args[0] + args[1]); // chances of ArrayIndexOutOfBoundsException
		System.out.println("main ends");
	}
}
