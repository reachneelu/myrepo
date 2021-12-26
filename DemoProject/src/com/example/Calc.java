package com.example;

public class Calc {
public static void div(int x,int y)throws ArithmeticException
{
	System.out.println("The division is "+(x/y));
}
public static void main(String[] args) {
	String str="sf234";
	int i=0;
	try
	{
	Calc.div(22, 2);
		try
		{
			i=Integer.parseInt(str);
			
			
		}
		catch(NumberFormatException nfe)
		{
			System.out.println(nfe);
		}
		try
		{
		Calc.div(33, 0);	
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
	}
	catch(ArithmeticException ae)
	{
		System.out.println(ae);
	}
	System.out.println("Bye...");
}
}
