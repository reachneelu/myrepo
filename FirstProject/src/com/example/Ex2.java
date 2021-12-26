package com.example;

public class Ex2 {
public static void main(String[] args) {
	int marks[]=new int[5];
	try
	{
	marks[0]=33;
	marks[1]=44;
	marks[2]=55;
	marks[3]=87;
	marks[4]=76;
	marks[0]=11;
	marks[11]=42;
	
	}
	catch(ArrayIndexOutOfBoundsException aioob)
	{
		System.out.println(aioob);
	}
	for(int i=0;i<marks.length;i++)
	{
		System.out.println(marks[i]);
	}
}
}
