package com.example;

public class Monkey extends Animal{
public void eat()
{
	super.eat();
System.out.println("Eats Bananas");	
}
public static void main(String[] args) {
	Monkey m=new Monkey();
	m.eat();
	m.run();
}
}
