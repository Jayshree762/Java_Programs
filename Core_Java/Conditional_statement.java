package com.java.test;

public class Conditional_statement {

	public static void main(String[] args) 
	{
		int a=50;
		int b=30;
		int c=10;
		if (a>b && a>c)
		{
			System.out.println("a is greater than b and c");
		}
		else
		{
			System.out.println("a is less than b and c");
		}
	
		if (a<b || a>c)
		{
			System.out.println("a is greater than b and c");
		}
		else
		{
			System.out.println("a is less than b and c");
		}
			
	}

}
