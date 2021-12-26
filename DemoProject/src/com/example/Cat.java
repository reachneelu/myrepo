package com.example;

public class Cat {
	
	Cat()
	{
		this(4);
	System.out.println("Cat Constructor");	
	
	}
	
	Cat(int x)
	{
		this("Tom");
		System.out.println("Cat has "+x+" legs");
	}
	Cat(String name)
	{
		
		System.out.println("Cat name is "+name);
		this.eat();
	}
    void eat()
    {
    	System.out.println("Eats Rats");
    }

public static void main(String[] args) {
	new Cat();
	
}
}
