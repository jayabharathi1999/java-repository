package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class simpleinterest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double p,r,t,i;
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);

		System.out.println("Enter the principle amount:");
		p=Double.parseDouble(ob.readLine());

		System.out.println("Enter the rate of interest:");
		r=Double.parseDouble(ob.readLine());

		System.out.println("Enter the time:");
		t=Double.parseDouble(ob.readLine());

		i=(p*t*r)/100;
		System.out.println("Interest amount:"+i);

	}

}
