package com.java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnect {
	


	    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/quizapp";
	    private static final String USERNAME = "root";
	    private static final String PASSWORD = "root";

	    public static Connection getConnection() throws SQLException {
	        Connection connection = null;
	        try {
	            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
	            System.out.println("Connected to the database!");
	        } catch (SQLException e) {
	            System.err.println("Failed to connect to the database!");
	            e.printStackTrace();
	            throw e;
	        }
	        return connection;
	    
	}


}
