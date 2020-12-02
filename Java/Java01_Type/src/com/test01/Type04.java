package com.test01;

public class Type04 {

	// 문자형 char (2)
	// 문자열 string ( 참조타입이지만 기본타입처럼 사용가능 )
	// 논리형 boolean (1)
	
	public static void main(String[] args) {
		
		char c1 = 'a';
		System.out.println(c1);
		int c2 = c1;
		System.out.println(c2); // char는  ASCII 코드의 대응되기 때문에 97이 출력
		
		String s1 = "aa";
		System.out.println(s1);
		String s2 = "bb";
		String sumS = s1 + s2;
		System.out.println(sumS);
		
		char lastName = '\uc720'; //C:\Program Files\Amazon Corretto\jdk1.8.0_242\bin -> native2ascii 에서 글자를 아스키코드로 변환
		System.out.println(lastName);
		
		boolean bl01 = true;
		boolean bl02 = false; // 논리형은 참과 거짓을 의미
		
		System.out.println(bl01);
		System.out.println(bl02);
	
	}
	
}
