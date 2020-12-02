package com.dao;

import static com.db.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dto.MemberDto;

// 데이터 베이스와 연결하는 Data Access Object

public class MemberDao {

	// 전체 출력
	// 순서 상관없으면 set이나 map도 사용가능
	// 혹은 위를 사용하고 출력할때 정렬해서 출력하라고 추가해주면됨
	public List<MemberDto> selectList(){
		
		Connection con = getConnection();
		Statement stmt = null;
		String sql = " SELECT M_NO, M_NAME, M_AGE, M_GENDER, M_LOCATION, M_JOB, M_TEL, M_EMAIL " + " FROM TB_MEMBER ";
		
		ResultSet rs = null;
		
		List<MemberDto> list = new ArrayList<MemberDto>();
		// 셀렉트에서 나올 결과 담을거
		
		//MemberDto dto = new MemberDto();
		// 얘가 여깄으면 안되는 이유 : 정말정말 중요 ★★★
		// 가장 마지막에 저장된 애로만 주르르륵 나옴
		// 1. 밖에서 주소값이 한번생성되서
		// Stack영역에 list와 dto가 만들어 지는데 밖에 만들면 dto,list가 주소 참조형태로 1개씩 만들어짐
		// while로 테이블에서 가져온 값이 dto값이 하나씩 넣어지며 그걸 list에 넣음
		// 그다음 다시 돌면서 list가에 저장됨 즉 list객체 안에는 dto가 가진 주소값이 저장됨
		// 주소값을 참조하는 형태로 연결이 되어있는것. 바깥에서 객체를 하나만 만들면
		// 모든 주소값이 가장 마지막에 돈 dto객체 하나만을 참조하게됨
		// 따라서 while문을 돌며 dto객체를 list에 값 넣을때마다 생성해서 각각 저장되는 주소값이 다른 객체(즉 다른값)를 참조하도록함
		// row 하나의 값을 저장하고있는 dto가 각각 다른것, 즉 각각 저장되어있는걸 list에 각각 넣어줘야함
		// 즉 dto객체가 1개인가 여러개인가의 차이
		
		try {
			stmt = con.createStatement();

			rs = stmt.executeQuery(sql);
			// stmt가 쿼리를 실행함 즉 쿼리를 db에서 전달받음
			// statement는 객체고 .executeQuery는 메서드 즉 그런 기능을 함
			// db에 연결한 stmt.executeQuery를 통해 쿼리를 실행하고, 결과값을 받고, rs에 전달
			while (rs.next()) {
				MemberDto dto = new MemberDto(); // 에엥 while밖으로 나오면 안대는애
				dto.setM_no(rs.getInt(1));
				dto.setM_name(rs.getString(2));
				dto.setM_age(rs.getInt(3));
				dto.setM_gender(rs.getString(4));
				dto.setM_location(rs.getString(5));
				dto.setM_job(rs.getString(6));
				dto.setM_tel(rs.getString(7));
				dto.setM_email(rs.getString(8));
				
				list.add(dto);
				// 하나하나씩 iterator 처럼 가져온 값을 list에 한묶음으로 저장해서 다시 넘김
				// list에 주소값이 저장되는것
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
			close(con);
		}
		
		return list;
	}
	
	// 선택 출력
	// 프라이머리 키로 유일한 하나를 찾아냄, 그래서 값 하나 들어가고
	// 해당하는 로우 하나만 출력함
	public MemberDto selectOne(int m_no) {
		
		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String sql = " SELECT M_NO, M_NAME, M_AGE, M_GENDER, M_LOCATION, M_JOB, M_TEL, M_EMAIL " +
					 " FROM TB_MEMBER " +
					 " WHERE M_NO = ? ";
		
		MemberDto dto = new MemberDto();
		// 어차피 한줄만 출력할거라 while 밖으로 나옴
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, m_no);
			
			rs = pstm.executeQuery();
			//rs.next();
			// 리턴값이 한개라 rs.next() 해도되지만 자주 까먹으니 while
			// 혹은 없는값을 넣었을때 오류날 확률이 높음
			
			while (rs.next()) {				
				dto.setM_no(rs.getInt(1));
				dto.setM_name(rs.getString(2));
				dto.setM_age(rs.getInt(3));
				dto.setM_gender(rs.getString(4));
				dto.setM_location(rs.getString(5));
				dto.setM_job(rs.getString(6));
				dto.setM_tel(rs.getString(7));
				dto.setM_email(rs.getString(8));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
		}
		
		return dto;
	}
	
	// 추가
	// 하나하나 전달하느니 값 전달 객체를 만들어 전달
	public int insert(MemberDto dto) {
		
		Connection con = getConnection();
		
		PreparedStatement pstm = null;
		
		String sql = " INSERT INTO TB_MEMBER " +
					" VALUES(MEMBERSEQ.NEXTVAL, ?, ?, ?, ?, ?, ?, ?) ";
		// 시퀀스가 자동으로 번호를 올려주기 때문에 맨 첫번째꺼는 저거 써줌
		
		int res = 0;
		
		try {
			pstm = con.prepareStatement(sql);			
			
			// dto에서 값을 받아 sql문을 완성시킴 view에서 전역변수에 생성자가 스캐너로 받은값을
			// 전부 넣어두었기 때문에 setter가 아닌 getter임
			// pstm.setInt(1, dto.getM_no());
			// 오라클 오류로 숫자 2 안나옴...
			pstm.setString(1, dto.getM_name());
			pstm.setInt(2, dto.getM_age());
			pstm.setString(3, dto.getM_gender());
			pstm.setString(4, dto.getM_location());
			pstm.setString(5, dto.getM_job());
			pstm.setString(6, dto.getM_tel());
			pstm.setString(7, dto.getM_email());
			
			// statement 메서드인 executeUpdate로 결과값 즉 적용된 row값 받아오겠다
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
	
	// 수정
	public int update(MemberDto dto) {
		
		Connection con = getConnection();
		PreparedStatement pstm = null;
		
		String sql = " UPDATE TB_MEMBER " + " SET M_NO = ?, M_NAME = ?, M_AGE = ?,M_GENDER = ?,M_LOCATION  = ?, M_JOB  = ?, M_TEL  = ?, M_EMAIL  = ? "
					+ " WHERE M_NO = ? ";
		
		int res = 0;
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, dto.getM_no());
			pstm.setString(2, dto.getM_name());
			pstm.setInt(3, dto.getM_age());
			pstm.setString(4, dto.getM_gender());
			pstm.setString(5, dto.getM_location());
			pstm.setString(6, dto.getM_job());
			pstm.setString(7, dto.getM_tel());
			pstm.setString(8, dto.getM_email());
			pstm.setInt(9, dto.getM_no());
			
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
	
	// 값 자체를 하나만 넘김
	// 그래서 dto.머시기가 아니라 그냥 int값 하나.
	public int delete(int m_no) {
		
		Connection con = getConnection();
		PreparedStatement pstm = null;
		
		String sql = " DELETE FROM TB_MEMBER " + " WHERE M_NO = ? ";
		
		int res = 0;
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, m_no);
			
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
	
}
