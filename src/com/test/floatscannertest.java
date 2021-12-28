package com.test;

import java.io.PrintStream;

public class floatscannertest {

	private static Object ob;

	public static void main(String[] args) {
		float a,b;
		boolean s;
		String name;
		System.out.println("Enter your name:");
		name=ob.next();

		System.out.println("Enter the boolean value:");
		s=ob.nextBoolean();

		System.out.println(name);
		System.out.println(s);

		System.out.println("Enter thr value of a:");
		a=ob.nextFloat();

		System.out.println("Enter the value of b:");
		b=ob.nextFloat();

		System.out.println("Addition=:"+ (a+b));
		ob.close();

	}

}
