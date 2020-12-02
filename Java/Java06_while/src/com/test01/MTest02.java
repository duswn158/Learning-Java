package com.test01;

public class MTest02 {
	
	public static void main(String[] args) {
	
		//1. 1 ~ 100까지의 숫자를 거꾸로 출력하자.
		//prn01();
		
		//2. 1 ~ 100까지의 숫자 중 2의 배수만 출력.
		//prn02();
		
		//3. 1 ~ 100 까지의 숫자 중 7의 배수의 갯수와, 총 합을 출력
		prn03();
		
	}
	
	public static void prn01() {
		
		int i = 100;
		while (i >= 1) {
			System.out.println(i);
			i--;		
		}		
	}
	
	public static void prn02() {
		
		int i = 1;
		
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i ++;
		}
		
	}
	
	public static void prn03() {
		
		int i = 1;
		int sum = 0; // 7의 배수의 갯수를 카운트
		int result = 0; // 7의 배수의 총합을 출력 하기 위한 변수
		
		while (i <= 100) {
			
			if (i % 7 == 0) {
			sum++;
			//result = i + result; // 지역변수는 블럭 안에서만 작용, 해당문장 result 앞에 int를 붙이면 선언을 한번 더하는것으로 간주 따라서 중복.
			result += i; // 위 형태를 단축
			}
			
			i ++;
			
		}
		
		System.out.println("7의 배수의 갯수 : " + sum);
		System.out.println("7의 배수의 총 합 : " + result);
	}
	
}
