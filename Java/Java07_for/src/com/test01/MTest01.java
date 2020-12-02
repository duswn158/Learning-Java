package com.test01;

public class MTest01 {
	
	public static void prn01() {
		// for (초기값; 조건식; 증감식)
		for (int i = 0 ; i < 10 ; i ++) { // int i 가 10보다 작을때까지 i 를 1씩 더하며 아래 명령 수행
			System.out.println(i);
		}
		
	}
	
	public static void prn02() {
		
		for(int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
		
	}
	
	/*
	 * 100 99 98 97 96 95 94 93 92 91
	 * 90 ...
	 * .
	 * .
	 * .
	 * 10 9 8 7 6 5 4 3 2 1
	 */
	
	public static void prn03() {
		
		/*
		for (int i = 100; i >= 1; i--) {
			
			System.out.printf("%4d",i); // printf(" %4d", i)로 자릿수를 4자리로 맞춰 마지막 한자리수 숫자들을 정렬하고 앞의 공백(띄어쓰기)을 줌
			
			
			if (i % 10 == 1) { // 혹은 변수를 따로 줘서 카운트해 10마다 줄을 내려줄 수 있음.
				System.out.println();				
			}
		}*/
		
		
		for (int i = 100; i > 0; i--) {		 
						
			if (i % 10 == 0) { // 혹은 (i != 100 && i % 10 == 0) 즉 100이 아니고 10으로 나눴을때 0인것
				System.out.println(); // 100부터 엔터 한번 입력되고 시작됨	
			}
			
			System.out.printf("%4d",i); // if문의 위로 가면 100 도 if문 조건의 해당하기 때문에 100에서도 줄바꿈이 됨.
		}
		
	}
	
	public static void main(String[] args) {
		//prn01();
		//prn02();
		prn03();
	}

}
