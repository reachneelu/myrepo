package com.ds.model;
import java.sql.*;

import com.ds.bean.EmployeeBean;
public class EmployeeDao {
public static Connection con=getCon();
public static PreparedStatement ps;
public static ResultSet rs;

public static Connection getCon()
{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		
	}
	catch(ClassNotFoundException cnf)
	{
		System.out.println(cnf);
	}
	catch(SQLException sql)
	{
		System.out.println(sql);
	}
	return con;
}
public static int addEmployee(EmployeeBean eb)
{
	int i=0;
	try
	{
		ps=con.prepareStatement("insert into emp123 values(?,?,?)");
		ps.setInt(1,eb.getEid());
		ps.setString(2,eb.getEname());
		ps.setInt(3, eb.getEsal());
	   i=ps.executeUpdate();
	}
	catch(SQLException sql)
	{
		System.out.println(sql);
	}
	return i;
}

public static ResultSet selectAll()
{
	try
	{
		ps=con.prepareStatement("select * from emp123");
		rs=ps.executeQuery();
	}
	catch(SQLException sql)
	{
		System.out.println(sql);
	}
	return rs;
}
}
