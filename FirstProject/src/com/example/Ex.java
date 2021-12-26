package com.example;

import javax.swing.*;
import java.awt.*;
public class Ex extends JFrame{
	JButton bt1,bt2;
	Ex()
	{
		firstButton();
		this.secondButton();
		this.display();
	}
	public void display()
	{
		setSize(400,800);
		setTitle("Welcome");
		//BorderLayout bl=new BorderLayout();
		setLayout(new BorderLayout());
		setVisible(true);
		add(bt1,BorderLayout.SOUTH);
		add(bt2,BorderLayout.EAST);
		
	}
	public void firstButton()
	{
		bt1=new JButton("Click me");
		bt1.setBounds(100,500,100,100);

	}
	public void secondButton()
	{
		bt2=new JButton("Java");
		bt2.setBounds(200,400,200,200);
	}
public static void main(String[] args) {
	new Ex();
}
}
