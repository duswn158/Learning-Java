package com.test01;

import static com.db.JDBCTemplate.*;
//import에 static 이라고 붙이면 static import라고 하는데
//원래는 클래스.메서드 해야하는데 static import때문에 그냥 내거처럼 메서드 바로 불러서 사용가능 
//클래스에 있는 static 메서드를 전부 클래스.메서드 않해도되게 올려주는 애가 static import

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MTest06 {
	
	public static void main(String[] args) {
		
		// update
		
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		String sql = " UPDATE MYTEST SET MNAME = ?, NICKNAME = ? " + " WHERE MNO = ? ";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 번호 : ");
		int mno = sc.nextInt();
		System.out.println("수정될 이름 : ");
		String mname = sc.next();
		System.out.println("수정될 별명 : ");
		String nickName = sc.next();
		
		
		try {
			// 3.
			pstm = con.prepareStatement(sql);
			pstm.setString(1, mname);
			pstm.setString(2, nickName);
			pstm.setInt(3, mno);
			
			// 4.
			res = pstm.executeUpdate();
			if(res > 0) {
				System.out.println("수정 성공!");
				commit(con);
				// Autocommit을 false로 지정해두었기 때문에 commit해줘야함
				// 성공했을때만 comiit하기위해 if문에 둠
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
		}
		
	}
	
}
