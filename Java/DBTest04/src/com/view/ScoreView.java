package com.view;

import java.util.List;
import java.util.Scanner;

import com.biz.ScoreBiz;
import com.biz.ScoreBizImpl;
import com.dto.ScoreDto;

public class ScoreView {
	
	static Scanner sc = new Scanner(System.in);

	public static int getMenu() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("--------------------\n")
			.append("1.전체출력\n")
			.append("2.선택출력\n")
			.append("3.추       가\n")
			.append("4.수       정\n")
			.append("5.삭       제\n")
			.append("6. 1등출력\n")
			.append("7. 2등출력\n")
			.append("8. n등출력\n")
			.append("9.종        료\n");
		System.out.println(sb);
		System.out.println("번호 선택 : ");
		int select = sc.nextInt();
		
		return select;
	}
	
	public static void main(String[] args) {
		ScoreBiz biz = new ScoreBizImpl();
		// 부모타입으로 자식객체를 만드는 이유는 해당 부모타입의 자식객체들이 다들어갈수 있기 때문에
		// 확장성 때문에 이렇게함 갈아끼우기 편함. 다형성.
		// 결합도가 낮춰지기도함
		
		int select = 0;
		
		do {
			select = getMenu();
			
			switch(select) {
			case 1 :
				System.out.println("** 전체 출력 **");
				List<ScoreDto> selectList = biz.SelectList();
				for(ScoreDto dto : selectList) {
					System.out.println(dto);
				}
				
				break;
			case 2 :
				System.out.println("** 선택 출력 **");
				System.out.println("출력할 사람 이름 : ");
				String selectname = sc.next();
				
				System.out.println(biz.selectOne(selectname));
				// 위와 아래는 같은거. 변수에 담냐 않담냐 차이
				//ScoreDto selectOneDto = biz.selectOne(selectname);
				//System.out.println(selectOneDto);
				
				break;
			case 3 :
				System.out.println("** 추가  **");
				System.out.println("추가할 이름 : ");
				String insertS_name = sc.next();
				System.out.println("추가할 국어점수 : ");
				int insertS_kor = sc.nextInt();
				System.out.println("추가할 영어점수 : ");
				int insertS_eng = sc.nextInt();
				System.out.println("추가할 수학점수 : ");
				int insertS_math = sc.nextInt();
				
				int insertS_sum = 0;
				int insertS_avg = 0;
				String insertS_grade = null;
				
				ScoreDto insertDto = new ScoreDto(insertS_name,insertS_kor,insertS_eng,insertS_math,
													insertS_sum,insertS_avg,insertS_grade);
				
				int insertres = biz.insert(insertDto);
				if(insertres > 0) {
					System.out.println("추가성공");
				} else {
					System.out.println("추가 실패");
				}
				
				break;
				
			case 4 :				
				System.out.println("** 수정  **");
				System.out.println("수정할 이름 : ");
				String updateS_name = sc.next();
				System.out.println("수정할 국어점수 : ");
				int updateS_kor = sc.nextInt();
				System.out.println("수정할 영어점수 : ");
				int updateS_eng = sc.nextInt();
				System.out.println("수정할 수학점수 : ");
				int updateS_math = sc.nextInt();
				
				int updateS_sum = 0;
				int updateS_avg = 0;
				String updateS_grade = null; 
				
				ScoreDto updateDto = new ScoreDto(updateS_name,updateS_kor,updateS_eng,
											updateS_math,updateS_sum,updateS_avg,updateS_grade);
				
				int updateres = biz.update(updateDto);
				if(updateres > 0) {
					System.out.println("수정 성공");
				}else {
					System.out.println("수정 실패");
				}
				
				break;
				
			case 5 :
				System.out.println("** 삭제  **");
				System.out.println("삭제할 이름 : ");
				String deletS_name = sc.next();
				
				int deleteres = biz.delete(deletS_name);
				if (deleteres > 0) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
				
				break;
			case 6 :
				System.out.println("1등");
				System.out.println(biz.topNSelect(1));
				break;
			case 7 :
				System.out.println("2등");
				System.out.println(biz.topNSelect(2));
				break;
			case 8 :
				System.out.println("n등");
				int topN = sc.nextInt();
				System.out.println(biz.topNSelect(topN));
				break;
			case 9 :
				System.out.println("종료...");
				break;				
			}
		} while(select != 9);
		
	}
	
}
