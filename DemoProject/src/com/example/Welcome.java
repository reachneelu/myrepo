package com.example;
import javax.swing.*;
public class Welcome extends JFrame{
	JLabel jlab;
	Welcome()
	{
	jlab=new JLabel();
//	jlab.setText(new Ex().b1.getText());
	jlab.setText(Ex.b1.getText());
	add(jlab);
		setTitle("Welcome");
		setSize(400,500);
		setVisible(true);
	}

}
