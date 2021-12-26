package com.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ex extends JFrame implements ActionListener{
public static JButton b1,b2;
JLabel jl;
JFrame f;
Ex()
	{

 f= new JFrame("Panel Example");    
        JPanel panel=new JPanel();  
        panel.setBounds(40,80,200,200);    
        panel.setBackground(Color.gray);  
        b1=new JButton("Button 1");     
        b1.setBounds(50,100,80,30); 
        b1.addActionListener(this);
        b2=new JButton("Button 2");   
         
        b2.setBounds(100,100,80,30); 
        b2.addActionListener(this);
        jl=new JLabel();
        panel.add(b1); panel.add(b2);
        panel.add(jl);
        f.add(panel);  
                f.setSize(400,400);    
                f.setLayout(null);    
                f.setVisible(true);    
     
}
public static void main(String[] args) {
	new Ex();
}
@Override
public void actionPerformed(ActionEvent e) {
String str=e.getActionCommand();
if(str.equals("Button 1"))
{
	new Welcome();
f.setVisible(false);
}
}

}
