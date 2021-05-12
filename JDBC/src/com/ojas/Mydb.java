package com.ojas;

import java.sql.*;
import java.util.Scanner;

public class Mydb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			System.out.println("Connected\n" + con);
			Scanner sc=new Scanner(System.in);
			System.out.println("enter ");
			int num=sc.nextInt();
			String name=sc.next();
			int marks=sc.nextInt();
			PreparedStatement st=con.prepareStatement("insert into student values(?,?,?)");
			st.setInt(1, num);
			st.setString(2, name);
			st.setInt(3, marks);
			int res=st.executeUpdate();
			if(res>0) {
				System.out.println("inserted");
			}
			else
			{
				System.out.println("try again");
			}
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
