package com.test02;

public class TypeToType01 {

	public static void main(String[] args) {
		
		byte b1 = 100;
		int i1 = b1;	// 묵시적 형 변환(upCastin, promotion), 작은타입 -> 큰 타입 일때 형을 표기하지 않아도 됨 
		System.out.println(i1);
		
		int i2 = 100;
		byte b2 = (byte)i2; // 명시적 형 변환(downcasting, casting), 큰 타입 -> 작은 타입 일때 형을 명시해주어야 함
		System.out.println(b2);
		
	}
	
}
