package com.java.test;

import java.util.Scanner;

public class Nested_If {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Enter your weight");
		int wieght=sc.nextInt();
		if(age>=18) {
			if(wieght>=50)
			{
				System.out.println("you are eligible for blood donate");
			}
			else
			{
				System.out.println("you are not eligible for blood donate");
			}
		
		}
		else
		{
			System.out.println("age must be a greater than or equal to 18");
		}
		

	}

}
