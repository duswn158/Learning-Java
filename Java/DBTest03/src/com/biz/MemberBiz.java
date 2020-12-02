package com.biz;

import java.util.List;

import com.dao.MemberDao;
import com.dto.MemberDto;

// Business Logic = 계산(연산) / 처리
// dao -> biz -> view 혹은 view -> biz -> dao 방향으로 연결됨
public class MemberBiz {
	
	private MemberDao dao = new MemberDao();
	
	public List<MemberDto> selectList(){

		// 계산 연산 처리할게 없어서 바로 리턴.
		return dao.selectList();
		
	}
	
	public MemberDto selectOne(int m_no) {
		return dao.selectOne(m_no);
	}
	
	public int insert(MemberDto dto) {
		//return dao.insert(dto);
		
		//getGender 값이 소문자일경우 대문자로 '처리'
		MemberDto tmp = dto;		
		tmp.setM_gender(dto.getM_gender().toUpperCase());
		
		// tmp없이 가능
		// dto.setM_gender(dto.getM_gender().toUpperCase());
		
		return dao.insert(tmp);
	}
	
	public int update(MemberDto dto) {
		
		dto.setM_gender(dto.getM_gender().toUpperCase());
		return dao.update(dto);
		
	}
	
	public int delete(int m_no) {
		return dao.delete(m_no);
	}

}
