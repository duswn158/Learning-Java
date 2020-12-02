package com.test03;

public class PrnTest {
	
	/*
	 * 
	 *  System.out.print() - 줄 바꿈 없음
	 *  System.out.println() - 출력후 줄 바꿈
	 *  System.out.printf() - 'f' = formatter (자리, 형식을 지정)
	 *	-  java.util.Fomatter에서 지정해주는 내용을 찾아볼 수 있음
	 *
	 */
	
	public static void main(String[] args) {
		
		System.out.print("1. abc");
		System.out.println("2. def");
		int i = 100;
		System.out.printf("3.%10d %5d", i, i); // d == 숫자 10d는 10자리, 5d는 5자릿수를 배정
		
		/*
		 *  시험 점수 결과는 100(su)점이고, 학점은 'A(ch)'가 나왔다. 
		 *  나의 오늘 감정지수는 90.50(d)% 이다.
		 *  printf 하나만 사용하자.(java.utill에 fomatter)
		 */
		
		int su = 100; //10칸
		char ch = 'A'; // 5칸
		double d = 90.5; // 5칸에 소수점 둘째자리 까지 표시
		
		System.out.printf("시험 점수 결과 %10d점 이고, 학점은 '%5c'가 나왔다. %n \n나의 오늘 감정지수는  %5.2f %% 이다.", su,ch,d);

		
		
	}

}
