package com.demo;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the java program ");
		String name = scan.nextLine();
		int count =0;
		for(int i=0;i<name.length();i++) {
			char ch =name.charAt(i);
			if(ch==' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
