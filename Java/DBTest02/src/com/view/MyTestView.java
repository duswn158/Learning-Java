package com.view;

import java.util.List;
import java.util.Scanner;

import com.dao.MyTestDao;
import com.dto.MyTestDto;

public class MyTestView {
	// 컨트롤러와 VIEW가 섞인 클래스
	
	static Scanner sc = new Scanner(System.in);
	
	public static int getMenu() {
		int select = 0;
		StringBuffer sb = new StringBuffer();
		// 추가가 여러개라 객체 여러개 만들어지니까 하나객체만 만드려고 String Buffer를 사용 (메모리 절약)
		sb.append("--Program menu--\n")
			.append("1.전체출력\n")
			.append("2.추      가\n")
			.append("3.수      정\n")
			.append("4.삭      제\n")
			.append("5.종      료\n")
			.append("---------------\n")
			.append("번호 선택 : ");
		
		System.out.println(sb);
		select = sc.nextInt();
		
		return select;
	}
	
	public static void main(String[] args) {
		
		MyTestDao dao = new MyTestDao();
		int no = 0;
		
		do {
			
			no = getMenu();
			
			switch(no) {
			case 1:
				System.out.println("*전체 출력");
				
				List<MyTestDto> list = dao.selectList();
				for (MyTestDto select : list) {
					System.out.println(select);
				}
				
				break;
			case 2:
				System.out.println("*추        가");
				System.out.println("추가할 번호 : ");
				int insertMno = sc.nextInt();
				System.out.println("추가할 이름 : ");
				String insertMname = sc.next();
				System.out.println("추가할 별명 : ");
				String insertNickname = sc.next();
				
				/*
				MyTestDto insertDto = new MyTestDto();
				insertDto.setMno(insertMno);
				insertDto.setMname(insertMname);
				insertDto.setNickname(insertNickname);
				int insertRes = dao.insert(insertDto);
				*/
				
				// 아래는 위 구문을 한줄로 줄여둔것
				int insertRes = dao.insert(new MyTestDto(insertMno, insertMname, insertNickname));
				if (insertRes > 0) {
					System.out.println("추가 성공!");
				} else {
					System.out.println("추가 실패 ㅜ");
				}
				
				break;
			case 3:
				System.out.println("*수        정");
				System.out.println("수정할 번호 : ");
				int updateMno = sc.nextInt();
				System.out.println("수정할 이름 : ");
				String updateMname = sc.next();
				System.out.println("수정할 별명 : ");
				String updateNickname = sc.next();
								
				int updateres = dao.update(new MyTestDto(updateMno, updateNickname,updateMname));
				if (updateres > 0) {
					System.out.println("수정 성공!");
				} else {
					System.out.println("수정 실패");
				}
				
				break;
			case 4:
				System.out.println("*삭        제");
				System.out.println("삭제할 번호 : ");
				int deleteMno = sc.nextInt();
				
				int res = dao.delete(deleteMno);
				if (res > 0) {
					System.out.println("삭제 성공!");
				} else {
					System.out.println("삭제 실패ㅜ");
				}
				
				break;
			case 5:
				System.out.println("*종        료");
				sc.close();
				break;
			}
			
		} while (no != 5);
		
	}

}
