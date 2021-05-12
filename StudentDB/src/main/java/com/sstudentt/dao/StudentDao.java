package com.sstudentt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sstudentt.model.Student;

public class StudentDao {
	private String url = "jdbc:mysql://localhost:3306/test";
	private String usn = "root";
	private String pwd = "root";
	private static final String s1 = "INSERT INTO students" + "  (name, marks, address) VALUES " + " (?, ?, ?)";
	private static final String s2 = "select id,name,marks,address from students where id =?";
	private static final String s3 = "select * from students";
	private static final String s4 = "delete from students where id = ?";
	private static final String s5 = "update students set name = ?,marks= ?, address =? where id = ?";

	public StudentDao() {

	}

	protected Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, usn, pwd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public void insertStudent(Student stu) {
		System.out.println(s1);
		Connection con = getConnection();
		try {
			PreparedStatement preparedStatement = con.prepareStatement(s1);
			preparedStatement.setString(1, stu.getName());
			preparedStatement.setString(2, stu.getAddress());
			preparedStatement.setString(3, stu.getAddress());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Student selectStudent(int id) {
		Student stu = null;
		Connection con = getConnection();
		try {
			PreparedStatement preparedStatement = con.prepareStatement(s2);
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				String marks = rs.getString("marks");
				String address = rs.getString("address");
				stu = new Student(id, name, marks, address);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stu;

	}

	public List<Student> selectAllStudents() {
		List<Student> students = new ArrayList<>();
		Connection con = getConnection();
		try {
			PreparedStatement preparedStatement = con.prepareStatement(s3);
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String marks = rs.getString("marks");
				String address = rs.getString("address");
				students.add(new Student(id, name, marks, address));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;
	}

	public boolean deleteStudent(int id) {
		boolean roww = false;
		Connection con = getConnection();
		try {
			PreparedStatement preparedStatement = con.prepareStatement(s4);
			preparedStatement.setInt(1, id);
			roww = preparedStatement.executeUpdate() > 0;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return roww;
	}

	public boolean updateStudent(Student stu) {
		boolean roww = false;
		Connection con = getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(s5);
			System.out.println("updated USer:" + ps);
			ps.setString(1, stu.getName());
			ps.setString(2, stu.getMarks());
			ps.setString(3, stu.getAddress());
			ps.setInt(4, stu.getId());
			roww = ps.executeUpdate() > 0;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return roww;
	}

	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}

	}
}
