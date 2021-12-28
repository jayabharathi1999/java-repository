package com.test;

import java.util.Scanner;

public class conditionaltest {

	public static void main(String[] args) {
		int a,b;
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the value of a:");
		a=ob.nextInt();
		System.out.println("enter the value of b:");
		b=ob.nextInt();
		if(a>b)
		{
		System.out.println(a+" is greater number");
		}
		else
		{
		System.out.println(b+ "is greater number");


	}

	}
}
