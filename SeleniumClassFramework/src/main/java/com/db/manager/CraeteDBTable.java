package com.db.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CraeteDBTable {
	
	
	public static void getcreateDBTable(String query) {
		try {	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "sarower");
		Statement stmt;
	
			stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		ResultSet rs = stmt.executeQuery(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		String query ="create table SmartTech (\r\n" + 
				"Student_id VARCHAR(4000) PRIMARY KEY,\r\n" + 
				"First_name VARCHAR(4000),\r\n" + 
				"Age number(6),\r\n" + 
				"Address VARCHAR(4000)\r\n" + 
				")";
		
		//String query ="INSERT into SmartTech values(101, 'Mohsin',20, 'Florida')";

		CraeteDBTable.getcreateDBTable(query);
		
	}

}
