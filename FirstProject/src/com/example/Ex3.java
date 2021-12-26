package com.example;
import java.io.*;
public class Ex3 {

public static void main(String[] args) {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your name");
String name="";
try {
	name = br.readLine();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("Hai "+name+" Welcome to Java Programming");

}
}
