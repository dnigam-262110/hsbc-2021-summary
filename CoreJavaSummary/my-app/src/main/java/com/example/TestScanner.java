package com.example;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an id");
		int id = scan.nextInt();
		System.out.println("Enter a name");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.println("Id = "+id+", Name = "+name);
		scan.close();
	}
}
