package com.java.test;

public class User_defined {
            int p;
			float q;
			char r;
			String s;
			boolean t;
			double u;
			User_defined()
			{
				p=10;
				q=20.3f;
				r='A';
				s="Jayu";
				t=true;
				u=12334;
				
			}
			public void m2() {
				System.out.println(p);
				System.out.println(q);
				System.out.println(r);
				System.out.println(s);
				System.out.println(t);
				System.out.println(u);
			}
			public static void main(String[] args) {
				User_defined udc=new User_defined();
				udc.m2();
			}
			

		}

	


