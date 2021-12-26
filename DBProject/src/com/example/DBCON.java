package com.example;
import java.sql.*;
public class DBCON {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");//Registering and Loading
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");//Connection
PreparedStatement ps=con.prepareStatement("select * from emp123 where id=?");
ps.setInt(1,103);
ResultSet rs=ps.executeQuery();
while(rs.next())
{
	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
}
}
}
