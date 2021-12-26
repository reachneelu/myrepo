package com.example;

public class Demo1 {
int x=22;
void disp(int x)
{
	this.x=x;
	System.out.println("The value of x is "+x);
}
public static void main(String[] args) {
	Demo1 obj=new Demo1();

	System.out.println("Instance variable value is "+obj.x);
	obj.disp(55);
	System.out.println("Instance variable value is "+obj.x);
	
}
}
