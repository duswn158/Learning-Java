package com.test01;

public class Type02 {
	
	//정수형 : byte(1), short(2), int(4), long(8) - 'L' 접미사
	// 1byte = 8bit

	public static void main(String[] args) {
		// Type 변수 = 값(literal);
		
		byte b01 = 100;
		System.out.println(b01);
		
		byte b02 = (byte) 128;
		System.out.println(b02);
		
		byte sumB = (byte)(b01 + b02); 
		// byte 타입이 저장할수 있는 수의 값은 -128~127 까지 이므로 그 값이 넘어가면 자동으로 최소값부터 값이 올라간다 즉 120+9 를 해도 최소값인 -128에서 양수로 하나 올라간 -127 로 출력 
		System.out.println(sumB);
		
		System.out.println("---------------------");
		
		short s1 = 32767;
		System.out.println(s1);
		
		short s2 = 2;
		System.out.println(s2);
		
		short sumS = (short)(s1 + s2);
		System.out.println(sumS);
		
		System.out.println("---------------------");
		
		// 정수형 리터럴의 기본 타입은 int
		int i = 10;
		int j = 20;
		int sum = i + j; // 연산의 기본도 int
		System.out.println(sum);
		
		System.out.println("---------------------");
		
		long l1 = 300000000l;
		long l2 = 400000000L; // int가 표현할수없는 긴 값을 표현, 소문자 혹은 대문자 L을 붙여 long타입임을 알려줌
		long simL = l1 + l2;
		System.out.println(simL);
		
		// 0b : 2진수
		System.out.println(0b10);
		// 00 : 8진수
		System.out.println(0010);
		// 0x : 16진수
		System.out.println(0x10);
		
	}
}
