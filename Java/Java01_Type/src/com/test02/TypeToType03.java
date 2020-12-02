package com.test02;

public class TypeToType03 {

	public static void main(String[] args) {
		
		// boxing : 기본타입 혹은 값을 Wrapper Class로 감싸는것
		Integer i = new Integer(100);
		
		// unboxing : Wrapper Class에서 값으로
		// 명시적
		int j = i.intValue();
		System.out.println(j);
		
		// 묵시적
		int k = i;
		System.out.println(k);
		
	}
	
}
