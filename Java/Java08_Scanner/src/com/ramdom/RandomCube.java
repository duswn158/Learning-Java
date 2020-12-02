package com.ramdom;

public class RandomCube {
	
	public static void main(String[] args) {
		prn();
	}
	
	private static void prn() {
		
		int sum = 0;
		int count = 0;
		
		//int rand = (int)(Math.random()*9) + 1; //랜덤수 1~9까지 (잘못된 위치 이미 만들어진 수 1개가 5번씩 출력됨)
		
		for(int i = 0; i < 5; i ++) {
			for(int j = 0; j < 5; j ++) {
				
				int rand = (int)(Math.random()*9) + 1;
				System.out.printf("%2d",rand);
				
				if(i == j || i + j == 4) {
					sum += rand;
					count ++; // 평균을 구하기 위한 카운트 sum에 더해질때마다 1씩증가
				}
				
			}
			System.out.println();
		}
		
		
		System.out.println("x의 총합 : " + sum);
		System.out.println("x의 평균 : " + ((double)sum / count)); // 소수점까지 명시하기위해 double로 변환
	}

	/*
	 * 1. 1 ~ 9 사이의 5 * 5 랜덤수로 채워진 큐브 한면을 출력하자
	 * 2. X 형태의 값의 총 합과, X형태의 값의 평균을 구하자. 
	 */

	public static void prnTest() {
		//혼자 짠거
		int sum = 0;
		
		for (int i = 0; i <= 4; i++) {
			
			for (int j = 0; j <= 4; j++) {
				
				//double x = Math.random(); // 랜덤함수 선언 법
				
				//(Math.random()*(max - min +1)) + min;
				int num = (int) (Math.random()*10) + 1; // 인트형으로 명시적 변환 하며 랜덤함수 불러와 선언
								
				if((i == j) || (i + j == 4)) {
					sum += num;
				}
				
				System.out.printf("%3d ", num);			
										
			}
			
			System.out.println();
		}
		
		System.out.println("\n 총 합은 : " + sum);
	}
}
