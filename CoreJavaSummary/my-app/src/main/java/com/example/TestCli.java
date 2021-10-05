package com.example;

public class TestCli {
	public static void main(String[] args) {
		/*
		 * Traditional For Loop
		 */
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("-------------------");
		/*
		 * Enhanced For Loop
		 */
		for(String s : args) {
			System.out.println(s);
		}
	}
}
