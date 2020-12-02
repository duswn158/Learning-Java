package com.test02;

public class Gugu {

	public static void main(String[] args) {
		//gugudan();
		gugudan02();
	}
	
	public static void gugudan() {
		/*
		 * 2 * 1 = 2
		 * 2 * 2 =4
		 * ...
		 * 9 * 9 = 81
		 * 
		 * for문을 사용 구구단 출력
		 */
		
		/*
		int res = 0;
		
		for(int i = 2; i <= 9; i ++) {
			
			for(int j = 1; j <= 9; j ++) {
				
				res = i * j;
				System.out.printf("%d * %d = %d \n", i, j, res);
								
			}	
			
			if (i <= 9) {
				System.out.println();
			}
		}*/
		
		for (int i = 2; i < 10; i ++) {
			System.out.println("<<" + i + "단>>");
			
			for (int j = 1; j < 10; j ++) {
				System.out.printf("%d * %d = %d\n", i, j, (i * j));
			}
			
			System.out.println();
		}
		
	}
	
	public static void gugudan02() {
		
		int i = 2;
		//int j = 1; // 10이 되면 초기화 되지 않기때문에 잘못된 변수위치
		
		while(i < 10){
			System.out.println("<<" + i + " 단 >>");
			
			int j = 1;
			while(j < 10) {
				
				System.out.printf("%d * %d = %d\n", i, j, (i*j)); // (i*j) 출력하면서 곱하기값 동시에 받음
				
				j++;
			}
			
			i++;
			System.out.println();
		}
		
	}
	
	public static void gugudan03() {
		// while 사용해서 출력 혼자한거.
		
		int i = 2; // 2단부터 시작
		while(i <= 9) { // 9단까지 출력
			
			System.out.println("<< " + i + "단 >>");
			
			int j = 1; // 2*1 부터 시작이기 때문
			int res = 0; // 곱하기값 초기화
			
			while(j <= 9) { // 2 * 9 까지 출력
				
				res = i * j; // 곱한 값 받음
				
				System.out.printf("%d * %d = %d \n", i, j, res); // 한줄 출력 후 엔터
				j++; // j 증가
			
			}
			
			System.out.println(); // 한 단이 끝나면 한줄 띔
			i ++; // i증가 즉 2단 -> 3단
		}
	}
	
}
