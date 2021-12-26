package com.example;

public class User {
public static void main(String[] args) {
	System.out.println("Welcome to Division Program");
	try
	{
	Calc.div(22,0);
	}
	catch(ArithmeticException ae)
	{
		ae.printStackTrace();
	}
	System.out.println("Bye...");
}
}
