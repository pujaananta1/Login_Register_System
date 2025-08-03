package com.company.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	 private static final String URL = "jdbc:mysql://localhost:3306/mysqldata1";
	    private static final String USERNAME = "root";
	    private static final String PASSWORD = "w8108#ananta";

	    static {	    	
	    	try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	            System.err.println("Failed to load JDBC driver.");
	            e.printStackTrace();
	        }
	    }
	    public static Connection getConnection() {
	        try {
	            System.out.println("Attempting to establish a connection...");
	            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	        } catch (SQLException e) {
	            System.err.println("Connection failed: " + e.getMessage());
	            e.printStackTrace();
	            return null;    }}
	 
	    public static void closeConnection(Connection connection) {
	        if (connection != null) {
	            try {
	                connection.close();
	                System.out.println("Connection closed successfully.");
	            } catch (SQLException e) {
	                System.err.println("Failed to close connection: " + e.getMessage());
	                e.printStackTrace();
	            }
	        }}}
	
	
	
	
	
	
	
	
	
	
	


