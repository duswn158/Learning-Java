package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplate {
					
	public static Connection getConnection() {
		
		// 1.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("1. 에러");
			e.printStackTrace();
		}
		
		// 2.
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Connection con = null;
		// 리턴해야해서 미리 변수선언
		
		try {			
			con = DriverManager.getConnection(url,user,password);
			//DriverManager.getConnection(연결문자열, DB_ID, DB_PW)
			con.setAutoCommit(false);
			
		} catch (SQLException e) {
			System.out.println("2. 에러");
			e.printStackTrace();
		}
		
		return con;
		
	}


	// 5.
	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(Statement stmt) {
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
	public static void close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * PreparedStatement는 Statement를 상속받기 때문에 부모인 Statement stmt가 close될때 자식도 close 되기때문에 쓰지 않아도됨
	 */
	
	
	// commit / rollback
	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
