package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplate {
	// 공통적인 메서드들 모음 딱 한번 만들어두고 공통 사용
	
	public static Connection getConnection() {
		// 커넥션 객체를 리턴하는 메서드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("1에러");
			e.printStackTrace();
		}
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url,user,password);
			con.setAutoCommit(false);
			/*
			 * con.setAutoCommit(false);
			 * false 설정시 자동으로 컴퓨터가 commit해주지 않는다 그래서 if문으로 다 설정하면 commit(con)으로 커밋 수동으로 해줌
			 * con.commit();인데 저러면 트라이 캐치 해야되서 commit메서드를 템플릿에 트라이케치 해서 만들어놓음
			 */
		} catch (SQLException e) {
			System.out.println("2에러");
			e.printStackTrace();
		}
		
		return con;
		
	}// connection
	
	// 오버로딩된 close메서드들 객체가 들어오면 해당 객체를 닫아줌
	// ResultSet이 들어오면 ResultSet 닫아줌
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
