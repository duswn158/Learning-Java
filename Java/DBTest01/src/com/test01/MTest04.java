package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MTest04 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// UPDATE MYTEST SET MNAME = ?, NUCKNAME = ? WHERE MNO =?
		// 번호입력
		// 바꿀 이름 입력
		// 바꿀 별명 입력
		
		// 1. driver 연결
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 2. 계정연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Connection con = DriverManager.getConnection(url,user,password);
		
		// 3. query 준비
		Statement stmt = con.createStatement();
		//실행해서 결과 리턴
		
		Scanner sc = new Scanner(System.in);
		System.out.println("번호 입력 : ");
		int mno = sc.nextInt();
		System.out.println("이름 입력 : ");
		String mname = sc.next();
		System.out.println("별명 입력 : ");
		String nickName = sc.next();
		
		String sql = " UPDATE MYTEST SET MNAME = '" + mname + "', NICKNAME = '" + nickName + "' WHERE MNO = " + mno;
		
		// 4. query 실행 및 리턴
		int res = stmt.executeUpdate(sql);
		if (res > 0) {
			System.out.println("수정 성공");
		}
		
		//5. db 종료
		stmt.close();
		con.close();
	}
	
}
