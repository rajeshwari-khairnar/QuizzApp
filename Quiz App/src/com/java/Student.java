package com.java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Student {

	public void exam() {
		// user name
		// pass
		// correct exam
		// wrong exit

		// marks

	}

	public void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your ID");
		String studId = sc.nextLine();
		System.out.println("Please Enter Your Password");
		String studPass = sc.nextLine();
		// validation

		DBConnect db = new DBConnect();
		try {
			Connection conn = db.getConnection();
			Statement stmt = conn.createStatement();
			String sql ="select * from quizapp.credentials";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next())
				
				if())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
