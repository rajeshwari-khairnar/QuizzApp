package com.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Quiz {
	
	static int count =0;
	public void testStart() {
		try {
			DBConnect db = new DBConnect();
			Connection conn = db.getConnection();
			
			//show que 
			//save result 
			String Query = "select qid,que,a,b,c,d,ans  from  quizapp.questions ;";
			PreparedStatement ps = conn.prepareStatement(Query);
			ResultSet resultSet = ps.executeQuery(Query);
			
				
				while (resultSet.next()) {
				    // Retrieve data from the result set
				    int  qID = resultSet.getInt(1);
				    String que = resultSet.getString(2);
				    String a = resultSet.getString(3);
				    String b = resultSet.getString(4);
				    String c = resultSet.getString(5);
				    String d = resultSet.getString(6);
				    String ans = resultSet.getString(7);
				    System.out.print("Question No "+qID);
				    System.out.println(":"+que);
				    System.out.println();
				    System.out.println("A)"+a);
				    System.out.println();
				    System.out.println("B)"+b);
				    System.out.println();
				    System.out.println("C)"+c);
				    System.out.println();
				    System.out.println("D)"+d);
				    System.out.println("===============================================================");
				    System.out.println("Enter Ans");
				    
				    Scanner sc = new Scanner (System.in);
				    String userAns =sc.nextLine();
				    //ans validation
				    
				    if(userAns.equalsIgnoreCase(ans)) {
				    	count++;
				    }
				    
				    
				}
				System.out.println("Your Result is:"+count+ "marks");
				//storing method
				Student std = new Student();
				std.storeResult();
		} 
		
		catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
