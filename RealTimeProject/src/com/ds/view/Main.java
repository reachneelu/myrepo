package com.ds.view;

import javax.swing.JOptionPane;

import com.ds.bean.EmployeeBean;
import com.ds.controller.EmployeeController;
import com.ds.model.EmployeeDao;
import java.sql.*;
public class Main {
public static void main(String[] args) {
//int id=Integer.parseInt(JOptionPane.showInputDialog("Enter Employee Id"));
//String name=JOptionPane.showInputDialog("Enter Employee Name");
//int sal=Integer.parseInt(JOptionPane.showInputDialog("Enter Employee Salary"));
//EmployeeBean eb=new EmployeeBean();
//eb.setEid(id);
//eb.setEname(name);
//eb.setEsal(sal);
//EmployeeBean eb1=EmployeeController.addEmployee(eb);
//JOptionPane.showMessageDialog(null, EmployeeDao.addEmployee(eb1)+" employee added successfully...");
ResultSet r=EmployeeDao.selectAll();
String str="";
try
{
while(r.next())
{
str+=r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3)+"\n";	
}
}
catch(SQLException sql)
{
	System.out.println(sql);
}
JOptionPane.showMessageDialog(null, str);
}
}
