package com.cg.feb22.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
// download postgres jdbc jar and add to classpath 

// demo to connect to PostgreSQL database and fetch records 
public class JdbcDemo {
	public static void main(String[] args) {
		System.out.println("Start");

		String className = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/cg22feb"; // check this
		String user = "postgres";
		String password = "root"; // check this
		String sql = "SELECT * FROM emp e FULL OUTER JOIN dept d ON e.did = d.did";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName(className);
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			rs = st.executeQuery(sql);
//			System.out.println("EID   Name   Salary");

			ResultSetMetaData rsmd = rs.getMetaData();
			int size = rsmd.getColumnCount();
			System.out.println(size);

			while (rs.next()) {
				int columnIndex = 1;
				for (int i = 1; i <= size; i++) {
					System.out.print(rs.getString(columnIndex) + "\t");
					columnIndex++;
				}
				System.out.println("\n");
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		System.out.println("End");
	}
}