package com.db.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DBTableManager {
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
	public static void createTable(String table) throws Throwable {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "sarower");

		String tableSearch = "SELECT table_name FROM user_tables";
		List<String> allTables = getDataTableColumn(tableSearch, "TABLE_NAME");
		System.out.println("All Table found =" + allTables);
		if (!allTables.contains(table)) {
			String tableName = "CREATE TABLE " + table + " (TEST_ID varchar(1000)," + "DESCRIPTION varchar(4000),"
					+ "Expected varchar(4000)," + "Actual varchar(4000)," + "Status varchar(1000) )";
			PreparedStatement stmt = conn.prepareStatement(tableName);
			stmt.execute();
			stmt.close();

			System.out.println("Table create successfully ....." + table);
		} else {
			System.out.println("Table already there .........No need to create new table..." + table);
		}
	}

	public static void delecteTable(String table) throws Throwable {

		String tableName = "delete from " + table + "";

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "sarower");

		// set all the preparedstatement parameters

		PreparedStatement stmt = conn.prepareStatement(tableName);
		stmt.execute();
		try {
			stmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Table deleted successfully ....." + table);
	}

	public static void dropTable(String table) throws Throwable {

		String tableName = "drop table " + table + "";

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "sarower");

		// set all the preparedstatement parameters

		PreparedStatement stmt = conn.prepareStatement(tableName);
		stmt.execute();
		try {
			stmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Table deleted successfully ....." + table);
	}
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
	public static ArrayList<String> getDataTableColumn(String SQLqyeries, String columnName) {
		ResultSet rs = null;
		Connection connection = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "sarower");
			Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = stmt.executeQuery(SQLqyeries);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		ArrayList<String> columnValue = new ArrayList<String>();

		try {
			while (rs.next()) {
				columnValue.add(rs.getString(columnName));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// System.out.println(columnValue);
		// step5 close the connection object
		try {
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return columnValue;

	}
	
	public static ArrayList<String> getDataTableColumn(String SQLqyeries, int columnNo) {
		ResultSet rs = null;
		Connection connection = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 	 connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "sarower");
			Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = stmt.executeQuery(SQLqyeries);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		ArrayList<String> columnValue = new ArrayList<String>();

		try {
			while (rs.next()) {
				columnValue.add(rs.getString(columnNo));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// System.out.println(columnValue);
		// step5 close the connection object
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return columnValue;

	}
	public static List<String> getDataTableColumn(String SQLqyeries) throws Throwable {
		ResultSet rs = null;
		Connection connection = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "hr", "hr");
			Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = stmt.executeQuery(SQLqyeries);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		ResultSetMetaData rsMetaData = rs.getMetaData();
		
		List<String> columnValue = new ArrayList<String>();
		int nCols = rsMetaData.getColumnCount();
		System.out.println("==========================================================================="
	    		+ "===================================================================================="
	    		+ "======================================================================================");
	    for(int i = 1; i <= nCols; ++i) {
	          System.out.format("|| %-18s ", rsMetaData.getColumnLabel(i));

	    
	    }
	    System.out.println();
	    System.out.println("==========================================================================="
	    		+ "===================================================================================="
	    		+ "======================================================================================");
		
			while (rs.next()) {
				for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
				
					System.out.format("| %-20s", rs.getString(i));

				}
				System.out.println();
			}
	

		return columnValue;

	}
	public static int setupTable(String tableName, String test_id, String DESCRIPTION, String EXPECTED, String ACTUAL,
			String STATUS) throws SQLException {

		Connection conn = null;
		int recordInserted = 0;
		try {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
			 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "sarower");
			String table = tableName;

			String query = "INSERT INTO " + table + "(TEST_id, DESCRIPTION, EXPECTED,ACTUAL,STATUS)"
					+ "values(?, ?, ?, ?, ?)";

			// set all the preparedstatement parameters
			PreparedStatement stmt = conn.prepareStatement(query);

			stmt.setString(1, test_id);
			stmt.setString(2, DESCRIPTION);
			stmt.setString(3, EXPECTED);
			stmt.setString(4, ACTUAL);
			stmt.setString(5, STATUS);
			recordInserted = stmt.executeUpdate();
			// execute the preparedstatement insert
			System.out.println("Row inserted into Table " + tableName + " = " + recordInserted);
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// log exception
			throw se;
		}
		return recordInserted;
	}

	public static void InsertData(List<String> data, String TableName) throws Throwable {

		data.forEach((value) -> {

			System.out.println(value);
			try {
				setupTable(TableName, value.split("_")[0], value.split("_")[1], value.split("_")[2],
						value.split("_")[3], value.split("_")[4]);
			} catch (SQLException e) {

			}
		});

	}
}
