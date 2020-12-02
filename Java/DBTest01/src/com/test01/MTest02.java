package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MTest02 {
	
	
	// 다섯단계 다외우기
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. driver 연결 (ojdbc6.jar)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 2. 계정 연결 (오라클 db랑 연결)
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Connection connection  = DriverManager.getConnection(url, user, password);
		
		// 3. query 준비
		String sql=" SELECT DEPTNO, DNAME, LOC " + " FROM DEPT";
		
		Statement stmt = connection.createStatement();
		
		// 4. query 실행 및 리턴
		ResultSet rs = stmt.executeQuery(sql);
		/*
		while(rs.next()) {
			System.out.printf("%3d %15s %15s \n",
								rs.getInt(1), rs.getString("DNAME"), rs.getString("LOC"));
		}*/
		
		while (rs.next()) {
			System.out.println(rs.getInt("DEPTNO") + " | " + rs.getString(2) + " | " + rs.getString(3));
		}
		// get..문에 ()안에 숫자는 "DEPTNO"라는 이름으로 불러오던가 (숫자) 컬럼 번호로 불러오던가....
		// get 할때 타입 순서대로 받아야하니까... select * 하지말고 전부 지정해주래...
		
		
		// 5. db 종료
		rs.close();
		stmt.close();
		connection.close();
		
	}

}
