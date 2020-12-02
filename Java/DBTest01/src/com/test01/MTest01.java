package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 다섯단계 다외우기 별x10개 다외우기
public class MTest01 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Java 코드에서 DataBase 오라클을 연결하고 있음
		// Java DataBase Connection = 자바 데이터베이스 연결
		// 선생님 DB PPT 117p 부터 참고
		// GUI로 할수있는 각 단계를 코드로 작성하는 중임
		// Data Source 탭에 폴더는 않만들어짐 그건 GUI가 생성해주는거임. 코드로 그냥 만들어서 불러와 쓰는거
		// GUI부분은 이클립스와 오라클 연결하기 위한것, 코드는 자바랑 오라클 연결해서 쓰기 위한것
		
		// 1. driver 연결 (ojdbc6.jar) ★핵중요
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 어떤 클래스를 사용할건지.
		
		
		// 2. 계정 연결 (오라클 db랑 연결)
		// 윈도우 -> show view -> other -> Data Management-> Data Source Explorer 추가
		// 이미 추가되있으면 우측상단 Java EE 누르면 Data Source... 콘솔탭 옆에 뜸
		// 1,2번은  커넥션 준비중
		// Database Connection에 New Oracle 우클릭 Properties -> Drover Properties
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Connection connection = DriverManager.getConnection(url, user, password);
		// java.sql 패키지
		// 2번까지가 DB에 접속한것
		
		
		// 3. query 준비
		String sql = " SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO "
				+ " FROM EMP";
		// 공백 없으면 FROM 키워드 없다고 나옴 DEPTNO에 붙어있어서...
		// 쿼리문 쓸때는 앞뒤로 꼭 공백 한칸씩 넣어주기 무조건.
		// ;는 sql 문법이라 여서는 ""안에 쓰면 오류남
		Statement stmt = connection.createStatement();
		// Statement : 실행 객체
		// ""안에 스트링값 제외 대소문자 구분x
		
		
		// 4. query 실행 및 리턴
		// java.sql에 Statement Import
		// connection 객체가 createStatement를 생성
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.printf("%5d %10s %10s %5d %10s %5.2f %5.2f %5d\n",
								rs.getInt(1), rs.getString(2), rs.getString("JOB"), rs.getInt("MGR"),
								rs.getDate(5), rs.getDouble(6), rs.getDouble(7), rs.getInt(8));
			// emp 테이블에 NUMBER 타입 NUMBER(7,2)는 실수값을 받는 컬럼. 따라서 getDouble
		}
		
		
		// 5. db 종료
		rs.close();
		stmt.close();
		connection.close();
		
	}
	
}
