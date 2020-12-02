package com.dao;

import static com.db.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dto.MyTestDto;

// DAO : Data Access Object
// db와 연결하는 역할 '만' 수행
// DB와 연결해서 값을 저장/수정/가져오기/삭제 등 일련의 작업들만함
// 기능이 연결이기 때문에 다른 기능을 집어넣지 않도록 주의

public class MyTestDao {
	
	public List<MyTestDto> selectList(){
		
		Connection con = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = " SELECT MNO, MNAME, NICKNAME "
					+ " FROM MYTEST "
					+ " ORDER BY MNO ";
		
		List<MyTestDto> list = new ArrayList<MyTestDto>();
		// Dto에 DB에 있는 하나의 Row를 각각 하나씩  dto에 담고 각 dto들을 list에 담음
		
		try {
			
			// 3
			stmt = con.createStatement();
			
			// 4 DB에서 값을 가져옴 [ VIEW <- DTO <- DAO ] 
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
				MyTestDto dto = new MyTestDto();
				//dto.setMno(rs.getInt(1));
				// 컬럼이름, 컬럼순서 둘다로 지정 가능
				dto.setMno(rs.getInt("Mno"));
				dto.setMname(rs.getString(2));
				dto.setNickname(rs.getString(3));
				
				list.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5
			close(rs);
			close(stmt);
			close(con);
		}
		
		return list;
	}
	
	public int insert(MyTestDto dto) {
		
		Connection con = getConnection();
		Statement stmt = null;
		
		String sql = " INSERT INTO MYTEST " + " VALUES (" + dto.getMno() + ", '" + dto.getMname() + "' , '" + dto.getNickname() + "')";
		
		int res = 0;
		
		try {
			stmt = con.createStatement();
			res = stmt.executeUpdate(sql);
			
			if(res > 0) {
				commit(con);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(stmt);
			close(con);
		}
		
		return res;
	}
	
	public int update(MyTestDto dto) {
		
		Connection con = getConnection();
		
		PreparedStatement pstm = null;
		
		String sql = " UPDATE MYTEST " + " SET MNAME = ?, NICKNAME = ? " + " WHERE MNO = ? ";
		
		int res = 0;
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, dto.getMname());
			pstm.setString(2, dto.getNickname());
			pstm.setInt(3, dto.getMno());		
			
			res = pstm.executeUpdate();
			
			if(res > 0) {
				commit(con);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
		}		
		
		return res;
	}
	
	public int delete(int mno) {
		
		// 1. 2.
		Connection con = getConnection();
		
		// 3. 4.에서 필요한 변수들 아래에 미리 만든것
		PreparedStatement pstm = null;
		String sql = " DELETE FROM MYTEST " + " WHERE MNO = ? ";
		
		int res = 0;
		// 위 구문 리턴값을 res에 넣을거  변수 미리 만들어둠
		
		try {
			// 3.
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, mno);
			// 얘는 값이 하나만 있어서 클래스.mno로 하지않음
			
			//4.
			res = pstm.executeUpdate();
			// 삭제된 로우 갯수 리턴됫을것
			// 결과에 대한값 리턴
			
			if (res > 0) {
				// 삭제된 row갯수가 0보다 크다면 삭제 완료이기때문에 commit해줌
				commit(con);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
			// try catch 계속 쓰면 지저분하니까 따로 메서드 만든것
		}
		
		return res;
		// 삭제된 row 갯수 리턴함
		// dao는 '연결만' 하기때문에 다른애들한테 값을 줘야함 따라서 리턴해준것
	}
	
}
