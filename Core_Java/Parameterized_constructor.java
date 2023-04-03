package com.java.test;

public class Parameterized_constructor {
            int a;
			int b;
			Parameterized_constructor(){
				a=20;
				b=302;
			}
			Parameterized_constructor(int c, int d){
			     this.a=c;
			     this.b=d;
			}
			public void add() {
				int output=a+b;
				System.out.println(output);
				
			}
			public static void main(String[] args) {
			    Parameterized_constructor pc=new Parameterized_constructor();
				pc.add();
				Parameterized_constructor pc1=new Parameterized_constructor(25,25);
				pc1.add();
			}
			

		}

	


