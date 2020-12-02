package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MTest05 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// DELETE
	
		// 1. driver 연결
		Class.forName("oracle.jdbc.driver.OracleDriver");
				
		// 2. 계정연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
				
		Connection con = DriverManager.getConnection(url,user,password);
				
		// 3. query 준비
		
		Scanner sc = new Scanner (System.in);
	    System.out.println("삭제할 번호 :");
	    int mno = sc.nextInt();
	    
	    String sql = " DELETE FROM MYTEST WHERE MNO = ? ";
	    
	    PreparedStatement pstm = con.prepareStatement(sql);
	    // 미리 실행준비한다. (쿼리문에 ? 넣고 ?에 값을 넣어서 미리 쿼리문을 만들어둔다)
	    // statement를 상속받은 객체
	    // 장점 : 
	    
	    pstm.setInt(1, mno);

		// 4. query 실행 및 리턴 
		
		int res = pstm.executeUpdate();
		if(res > 0) {
			System.out.println("삭제 성공");
		}
		
		// 5. db종료
		pstm.close();
		con.close();

	}

}
