package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplate {
	// JDBC 공통부분을 만들것
	// 전체를 스테틱으로 만들거나 싱글톤으로 만들어도됨
	
	public static Connection getConnection() {
		// 1. driver 연결
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("[ERROR] 1. dricer 연결");
			e.printStackTrace();
		}
						
		// 2. 계정연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
						
		Connection con = null;
		
		try {
			
			con = DriverManager.getConnection(url,user,password);
			con.setAutoCommit(false);
			// setAutoCommit으로 으로 원할때에만 commit할수있게 함
			
			
		} catch (SQLException e) {
			System.out.println("[ERROR] 2. 계정 연결");
			e.printStackTrace();
		}
		
		return con;
		
	}// 메서드
	
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
	/*
	 * PreparedStatement는 Statement를 상속받기 때문에 부모인 Statement stmt가 close될때 자식도 close 되기때문에 쓰지 않아도됨
	 */
	
	public static void close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}//class
