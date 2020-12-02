package com.view;

import java.util.List;
import java.util.Scanner;

import com.biz.MemberBiz;
import com.dao.MemberDao;
import com.dto.MemberDto;

// View : 화면
// Controller : 화면 제어
public class MemberView {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int getMenu() {
		
		int select = 0;
		
		StringBuffer sb = new StringBuffer();
		sb.append("**********\n")
			.append("1.전체출력\n")
			.append("2.선택출력\n")
			.append("3.추      가\n")
			.append("4.수      정\n")
			.append("5.삭      제\n")
			.append("6.종      료\n")
			.append("----------\n")
			.append("번호 입력 : ");
		System.out.println(sb);
		
		select =sc.nextInt();
		
		return select;
	}
	
	
	public static void main(String[] args) {
		
		int select  = 0;
		MemberBiz biz = new MemberBiz();
		
		
		while(select != 6) {
			select = getMenu();
			
			switch(select){
			case 1:
				// 전체출력
				System.out.println("**전 체 출 력**");
				List<MemberDto> selectList = biz.selectList();
				for (MemberDto dto : selectList) {
					System.out.println(dto);
				}
				
				break;
				
			case 2:
				// 선택 출력
				System.out.println("**선택출력**");				
				System.out.println("*출력할 번호*");
				int selectone = sc.nextInt();
				
				MemberDto selectOneDto = biz.selectOne(selectone);
				System.out.println(selectOneDto);				
				
				break;
				
			case 3:
				// 추가
				System.out.println("**추    가**");
				//System.out.println("추가할 번호 : ");
				//int insertM_no = sc.nextInt();
				System.out.println("추가할 이름 : ");
				String insertM_name = sc.next();
				System.out.println("추가할 나이 : ");
				int insertM_age = sc.nextInt();
				System.out.println("추가할 성별 : ");
				String insertM_gender = sc.next();
				//insertM_gender.toUpperCase(); -> biz에서 처리
				System.out.println("추가할 지역 : ");
				sc.nextLine();
				String insertM_location = sc.nextLine();
				System.out.println("추가할 직업 : ");
				String insertM_job = sc.next();
				System.out.println("추가할 전화번호 : ");
				String insertM_tel = sc.next();
				System.out.println("추가할 이메일 : ");
				String insertM_email = sc.next();
				
				// m_no 대신 0을 넣는데 아무값(100이든뭐든...)이나 넣어도 시퀀스가 올라감 db에 값 전달 하지 않았기때문
				MemberDto insertDto = new MemberDto(0,insertM_name,insertM_age,
											insertM_gender,insertM_location,insertM_job,
											insertM_tel,insertM_email);
				
				int insertRes = biz.insert(insertDto);
				if (insertRes > 0) {
					System.out.println("추가 성공!");
				} else {
					System.out.println("추가 실패ㅠ");
				}
				
				break;
				
			case 4:
				// 수정
				System.out.println("**수    정**");
				System.out.println("수정할 번호 : ");
				int updateM_no = sc.nextInt();
				System.out.println("수정할 이름 : ");
				String updateM_name = sc.next();
				System.out.println("수정할 나이 : ");
				int updateM_age = sc.nextInt();
				System.out.println("수정할 성별 : ");
				String updateM_gender = sc.next();
				//insertM_gender.toUpperCase();
				System.out.println("수정할 지역 : ");
				sc.nextLine();
				String updateM_location = sc.nextLine();
				System.out.println("수정할 직업 : ");
				String updateM_job = sc.next();
				System.out.println("수정할 전화번호 : ");
				String updateM_tel = sc.next();
				System.out.println("수정할 이메일 : ");
				String updateM_email = sc.next();
				
				int updateRes = biz.update(new MemberDto(updateM_no,updateM_name,updateM_age,
											updateM_gender,updateM_location,updateM_job,
											updateM_tel,updateM_email));
				if(updateRes > 0) {
					System.out.println("수정성공");
				} else {
					System.out.println("수정 실패...");
				}
				
				break;
			case 5:
				// 삭제
				System.out.println("*삭        제");
				System.out.println("삭제할 번호 : ");
				int deleteM_no = sc.nextInt();
				
				int deleteres = biz.delete(deleteM_no);
				if (deleteres > 0) {
					System.out.println("삭제 성공!");
				} else {
					System.out.println("삭제 실패ㅜ");
				}
				break;
			case 6:
				// 종료
				System.out.println("*종        료");
				sc.close();
				break;
					
			}
		}
		System.out.println("종료되었습니다....");
	}// main
	
}
