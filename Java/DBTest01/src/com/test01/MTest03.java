package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MTest03 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//insertSql();
		
		insertPresql();
		
		selectSql();
	}//main

	private static void insertPresql() throws SQLException, ClassNotFoundException {
		// 1. driver 연결
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 2. 계정연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		// 3. query 준비
		String sql = " INSERT INTO MYTEST VALUES (?, ?, ?)";

		Scanner sc = new Scanner(System.in);
		System.out.println("번호 입력 : ");
		int mno = sc.nextInt();
		System.out.println("이름 입력 : ");
		String mname = sc.next();
		System.out.println("별명 입력 : ");
		//sc.nextLine(); 혹시 위에 남은 토큰 다버리고
		//String nickName = sc.nextLine(); 다시 받아서 공백까지 한줄전체 출력
		String nickName = sc.next();
		
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setInt(1, mno);
		pstm.setString(2, mname);
		pstm.setString(3, nickName);
		// 1, 2, 3 번쟤 물음표에 각각 저장 즉 쿼리문 미리 만듬
				
		// 4. query 실행 및 리턴
		int res = pstm.executeUpdate();
		if (res > 0) {
			System.out.println("작성 성공!");
		}
		
		// 5. db 종료
		pstm.close();
		con.close();
		
	}

	private static void selectSql() throws ClassNotFoundException, SQLException {
		// 1. driver 연결
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 2. 계정연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		// 3. query 준비
		Statement stmt = con.createStatement();
		String sql = " SELECT MNO, MNAME, NICKNAME " + " FROM MYTEST ";
		
		
		// 4. query 실행 및 리턴
		ResultSet rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			System.out.println(rs.getInt(1)+ " " + rs.getString("MNAME") + " " + rs.getString(3));
		}
		
		// 5. db종료
		rs.close();
		stmt.close();
		con.close();
		
	}

	private static void insertSql() throws ClassNotFoundException, SQLException {
		// 1. driver 연결
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 2. 계정연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		Connection con = DriverManager.getConnection(url,user,password);
		
		// 3. query 준비
		Statement stmt = con.createStatement();
		// 쿼리 준비하고 결과값 리턴받아올애
		// 이 객체를 통해 요청하고 응답받음
		// 실행해서 결과 리턴받는애
		
		Scanner sc = new Scanner(System.in);
		System.out.println("번호 입력 : ");
		int mno = sc.nextInt();
		System.out.println("이름 입력 : ");
		String mname = sc.next();
		System.out.println("별명 입력 : ");
		String nickName = sc.next();
		
		String sql = " INSERT INTO MYTEST " + " VALUES(" + mno + ", '" + mname + "', '" + nickName + "') ";
		// mname과 nickName은 문자라서 '' 필수 오타 자주나니 주의
		// INSERRT INTO MYTEST VALUES(2, '홍길동', '호부호형')
		
		// 4. query 실행 및 리턴
		int res = stmt.executeUpdate(sql);
		// 즉 위에있는 res는 리턴받을 갯수
		// executeUpdate = insert, delete, update / 몇개의 row가 어떻게 되었는지 적용된 row의 개수를 리턴해주기 때문에 INT값 리턴
		// executeQuery = select / 셀렉트하고 DB에 요청하면 해당 sql 테이블에서 선택된 컬럼들 찾아와서 출력시켜줌 즉 테이블이 리턴됨
		
		if (res > 0) {
			System.out.println("입력 성공");
		}
		
		// 5. db종료
		stmt.close();
		con.close();
	}
	
	
}// class
