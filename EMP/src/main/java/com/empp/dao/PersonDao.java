package com.empp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.empp.model.Person;

public class PersonDao {
	Connection getConnect() throws ClassNotFoundException, SQLException {
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		System.out.println("Connected\n" + con);
		return con;
}
	public boolean addPerson(Person person) throws ClassNotFoundException, SQLException {
		boolean b=false;
		Connection con=getConnect();
		PreparedStatement pst=con.prepareStatement("insert into pserons"+"(ename,contact,email,gender,address)"+"values(?,?,?,?,?");
		pst.setString(1, person.getEname());
		pst.setString(2, person.getContactno());
		pst.setString(3, person.getEmail());
		pst.setString(4, person.getGender());
		pst.setString(5, person.getAddress());
		int res=pst.executeUpdate();
		if(res>0) {
			b=true;
		}
		return b;
		
	}
}