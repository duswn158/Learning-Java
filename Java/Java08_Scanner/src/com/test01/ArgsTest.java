package com.test01;

public class ArgsTest {
	
	public static void main(String[] args) {
		/*
		 * run as -> run configurations -> arguments -> ${string_prompt} 거의 쓰이지 않음
		 * main : 프로그램의 주 진입점 (jvm이 가장 먼저 호출, 가장먼저 찾아 실행, 따라서 프로젝트에 단 하나만 있어야함)
		 * 어디서든 호출 가능한 public접근제한자, 메모리 영역은 스테틱영역 클래스.메소드();로 호출함, 리턴타입은 없는 main이라는 이름의 스트링 배열 값을 파라미터로 받을수 있는 메소드
		 */
		
		//index = 어떤 데이터가 HDD(하드디스크)의 어디에 있는지 위치 정보를 가진 주소록과 같은 개념 빠르게 쿼리 검색을 하오기 위함임
		String s = args[0]; // 0을 넣는 이유 = index 배열의 번지를 의미하고, index는 0부터 시작
		
		System.out.println(s);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("args : " + args[i]);
		}
	}
	
}
