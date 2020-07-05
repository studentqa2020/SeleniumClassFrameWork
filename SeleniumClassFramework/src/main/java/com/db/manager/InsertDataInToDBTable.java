package com.db.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDataInToDBTable {
	
	public static void getInsertDataInToDBTable(String query) {
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
		

		
		String query ="INSERT into SmartTech values(102, 'Arif',25, 'Queens')";

		InsertDataInToDBTable.getInsertDataInToDBTable(query);
		
	}

}

