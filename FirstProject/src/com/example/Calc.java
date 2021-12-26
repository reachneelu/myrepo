package com.example;

public class Calc {
	public static void div(int x,int y)throws ArithmeticException
	{
		try
		{
		System.out.println("Division of "+x+" / "+y+" is "+(x/y));
		}
		finally
		{
			System.out.println("Exiting...");
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Division Program");
		Calc.div(22, 0);
		System.out.println("Bye...");
	}

}
