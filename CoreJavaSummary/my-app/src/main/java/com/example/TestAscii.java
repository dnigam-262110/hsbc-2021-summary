package com.example;

public class TestAscii {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			System.out.println("i = "+i);
		}
		System.out.println("--------------------");
		for(char c = 'A'; c <= 'z'; c++) {
			int code = c;
			System.out.println("character = "+c+", ascii code = "+code);
		}
	}

}
