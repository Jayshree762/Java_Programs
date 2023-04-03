package com.java.test;

import java.util.Scanner;

public class Calculator_functionality {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Enter the operator");
		char op = sc.next().charAt(0);
		double result=0;
		switch(op)
		{
		case'+':
			result=num1+num2;
			break;
			
		case'-':
			result=num1-num2;
			break;
			
		case'*':
			result=num1*num2;
			break;
			
		case'/':
			result=num1/num2;
			break;
			
		default:
			System.out.println("you enter wrong input");
			
			
		}
		System.out.println("The final result:");
		System.out.println();
		System.out.println(num1+" "+ op +" "+num2 +" = " + result);
	}
}

	
		
		
		

	


