package com.dao;

import java.util.List;

import com.dto.ScoreDto;

public interface ScoreDao {
	// 인터페이스 만드는 이유 : 객체간에 결합도를 낮추기 위해, 가이드역할
	
	String SELECT_LIST_SQL = " SELECT S_NAME, S_KOR, S_ENG, S_MATH, S_SUM, S_AVG, S_GRADE " + " FROM SCORE ";
	
	String SELECT_ONE_SQL = " SELECT S_NAME, S_KOR, S_ENG, S_MATH, S_SUM, S_AVG, S_GRADE " + " FROM SCORE " 
							+ " WHERE S_NAME = ? ";
	
	String INSERT_SQL = " INSERT INTO SCORE " + " VALUES(?, ?, ?, ?, ?, ?, ?) ";
	
	String UPDATE_SQL = " UPDATE SCORE " + " SET S_NAME = ?, S_KOR = ?, S_ENG = ?, S_MATH = ?, S_SUM = ?, S_AVG = ?, S_GRADE =? "
						+ " WHERE S_NAME = ? ";
	
	String DELETE_SQL = " DELETE FROM SCORE " + " WHERE S_NAME = ? ";
	
	
	String TOP_N_SQL = " SELECT R, S_NAME, S_KOR, S_ENG, S_MATH, S_SUM, S_AVG, S_GRADE " + 
			" FROM " + 
			" (SELECT ROWNUM AS R, S_NAME, S_KOR, S_ENG, S_MATH, S_SUM, S_AVG, S_GRADE " + 
			" FROM " + 
			"	(SELECT S_NAME, S_KOR, S_ENG, S_MATH, S_SUM, S_AVG, S_GRADE " + 
			"	FROM SCORE " + 
			"	ORDER BY S_AVG DESC)A " + 
			" )B " + 
			" WHERE R = ? ";

	public List<ScoreDto> SelectList();
	public ScoreDto selectOne(String s_name);
	public int insert(ScoreDto dto);
	public int update(ScoreDto dto);
	public int delete(String s_name);
	
	// n등을 주면 n등에 대한 dto 리턴
	public ScoreDto topNSelect(int n);
	
}