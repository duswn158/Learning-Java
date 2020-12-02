package com.test03;

public class SumX {
	
	/*
	 * 1. 다음과 같이 출력
	 *  1  2  3  4  5 
	 *  6  7  8  9 10
	 * 11 12 13 14 15
	 * 16 17 18 19 20
	 * 21 22 24 25 25
	 * 
	 * 2. X 모양의 해당하는 숫자 합계를 출력
	 */
	
	public static void main(String[] args) {
		//prn01();
		prn();
	}
	
	public static void prn() {
		int cnt = 1; // 숫자
		int sum = 0;
		
		for (int i = 0; i < 5; i++) { // 한줄에 5개의 글자가 찍히면 엔터키가 되는 조건문 즉, 줄 만들기
			for(int j = 0; j < 5; j++) { 
				
				if((i == j ) || ( i + j == 4)) {
					sum += cnt; // 공통점 i + j =4, i ==j
				}// 총합 구해주는 조건문
				
				System.out.print(cnt++ + " "); // j가 5보다 작을때 까지 cnt를 출력
				
			}
			
			System.out.println();
		}
		
		System.out.println("\n X의 총 합 : " + sum);
	}
	
	/*
	public static void prn01() {
		
		int sum = 0;
		int count = 0;
		for (int i = 1; i < 26; i ++) {
			
			if (i % 5 == 1) {
				count ++;
				System.out.println();
			}						
			
			System.out.printf("%4d",i);
			
		}
		
		
		System.out.println();
		System.out.println("\n X모양의 총합 :" + sum);
	}
	*/
}
