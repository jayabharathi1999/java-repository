package com.test;

public class operatortest {

	public static void main(String[] args) {
		int a=20,b=30,c=40;
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(a-b);//arithmetic
		System.out.println(b>a&&b>c);
		System.out.println(b<a||b<c);
		System.out.println(b!=a);//logical
		System.out.println(b==a);
		boolean h=(b==a);
		a+=5;
		System.out.println(a);
		a=a/2;
		a/=2;
		a=a*5;
		a*=5;
	}

}
