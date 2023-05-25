package com.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Question {
	private String a;
	private String b;
	private String c;
	private String d;
	private String que;
	private String ans;

	public void addQue() {

		try {
			DBConnect db = new DBConnect();
			Connection conn = db.getConnection();
			String Query = "INSERT INTO questions ( que,a, b, c, d, ans) VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(Query);
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a new question:");
			String que = sc.nextLine();
			ps.setString(1, que);

			System.out.println("Please enter OPTION A:");
			String a = sc.nextLine();
			ps.setString(2, a);

			System.out.println("Please enter OPTION B:");
			String b = sc.nextLine();
			ps.setString(3, b);

			System.out.println("Please enter OPTION C:");
			String c = sc.nextLine();
			ps.setString(4, c);

			System.out.println("Please enter OPTION D:");
			String d = sc.nextLine();
			ps.setString(5, d);

			System.out.println("Please enter correct ans");
			String ans = sc.nextLine();
			ps.setString(6, ans);

			ps.execute();
			System.out.println("Question added Successfully!");
			System.out.println("Press 1 for Exit \n Press 2 for adding another question");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.exit(1);
				break;
			case 2:
				addQue();
				break;
			
			}
			//add another que
			//go to homepage
			
			ps.close();
			conn.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void addUsers() {
		try {
			DBConnect db = new DBConnect();
			Connection conn = db.getConnection();
			
			String Query = "INSERT INTO credentials (Id, pass) VALUES (?, ?)";
			PreparedStatement ps = conn.prepareStatement(Query);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter UserId");
			String ID = sc.nextLine();
			ps.setString(1, ID);
			
			System.out.println("Enter Password");
			String pass = sc.nextLine();
			ps.setString(2, pass);
			ps.execute();
			System.out.println("User added Successfully!");
			ps.close();
			conn.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	

}
