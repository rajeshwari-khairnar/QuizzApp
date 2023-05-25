package com.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	static String studId;
	static String studPass;
	public void exam() {
		// user name
		// pass
		// correct exam
		// wrong exit

		// marks

	}

	public void login() {
		
		System.out.println("Please Enter Your ID");
		 studId = sc.nextLine();
		System.out.println("Please Enter Your Password");
		 studPass = sc.nextLine();
		// validation

		DBConnect db = new DBConnect();
		try {
			Connection conn = db.getConnection();
			Statement stmt = conn.createStatement();
			String sql ="select * from quizapp.credentials";
			ResultSet resultSet = stmt.executeQuery(sql);
			while (resultSet.next()) {
			    // Retrieve data from the result set
			    String id = resultSet.getString("Id");
			    String pass = resultSet.getString("Pass");
			    // Retrieve other columns as needed

			    // Process the retrieved data
			    System.out.println("ID: " + id);
			    System.out.println("Pass: " + pass );
			    
			    // quiz
			    Quiz qz=new Quiz();
			    qz.testStart();
			}


		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	
	
	public void storeResult() {
		
		String tempID = Student.studId;
		System.out.println(studId+" "+studPass+""+Quiz.count);
		String tempPass = Student.studPass;
		 
		int tempCount = Quiz.count;
		
		
	try {
		Connection conn =	DBConnect.getConnection();
		String sql ="insert into result (sId,marks,password) values(?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, tempID);
		ps.setString(2, tempPass);
		ps.setInt(3, tempCount);
		System.out.println("Result stored succesfully in the database");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
	

}
