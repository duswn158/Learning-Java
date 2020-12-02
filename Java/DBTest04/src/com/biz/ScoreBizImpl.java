package com.biz;

import java.util.List;

import com.dao.ScoreDao;
import com.dao.ScoreDaoImpl;
import com.dto.ScoreDto;

public class ScoreBizImpl implements ScoreBiz {
	
	// sum하고 avg를 메서드로 만들면 dto에서 계산이 되는데
	// biz에서 연상처리가 되야하기 때문에 필드로 선언함
	
	private ScoreDao dao = new ScoreDaoImpl();

	@Override
	public List<ScoreDto> SelectList() {
		
		return dao.SelectList();
	}

	@Override
	public ScoreDto selectOne(String s_name) {
		
		return dao.selectOne(s_name);
	}

	@Override
	public int insert(ScoreDto dto) {
		
		// 따로 처리를 해주지 않아도 view에서 biz로 왔다가 dao로 가기때문에
		// view에서 무슨 값을 넣든 biz에서 초기화한 값이 dao로 가서 db에 전달
		dto.setS_sum(dto.getS_kor() + dto.getS_eng() + dto.getS_math());
		dto.setS_avg(dto.getS_sum()/3);
		dto.setS_grade(grade(dto.getS_avg()));		
		
		return dao.insert(dto);
	}

	@Override
	public int update(ScoreDto dto) {
		
		dto.setS_sum(dto.getS_kor() + dto.getS_eng() + dto.getS_math());
		dto.setS_avg(dto.getS_sum()/3);
		dto.setS_grade(grade(dto.getS_avg()));
		
		return dao.update(dto);
	}

	@Override
	public int delete(String s_name) {
		
		return dao.delete(s_name);
	}

	@Override
	public ScoreDto topNSelect(int n) {
		
		return dao.topNSelect(n);
	}
	
	public static String grade(int avg) {
		
		String res = null;
		
		switch(avg/10) { // 평균을 10으로 나눠 소수를 정수로 변환.
		
		case 10:
		case 9:
			res = "A";
			break;
		case 8:
			res = "B";
			break;
		case 7:
			res = "C";
			break;
		case 6: 
			res = "D";
			break;
		default:
			res = "F";
			break;	
		}
		
		return res;
	}

}
