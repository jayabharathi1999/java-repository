package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class farenhitetocentigrade {

	public static void main(String[] args) throws NumberFormatException, IOException {

double f,c;
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader ob=new BufferedReader(in);

System.out.println("Enter the temperature of farenhite:");
f=Double.parseDouble(ob.readLine());

c=(5*(f-32))/9;
System.out.println("centigrade:"+c);
	}

}
