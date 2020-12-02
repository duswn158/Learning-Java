package com.test01;

public class Type05 {

	/*
	 * - 기본 타입 : 정수형 실수형 문자형 논리형, 값 자체
	 * byte			Byte
	 * short		Short
	 * int			Integer
	 * long			Long
	 * 
	 * float		Float
	 * double		Double
	 * 
	 * char			Character
	 * 
	 * boolean		Boolean
	 * 				<Wrapper Class> - 기본 타입으로 만든 참조타입
	 * 
	 * - 참조 타입 : object를 상속받는 모든 클래스, 주소값(객체) - 기능
	 * 
	 */
	
	public static void main(String[] args) {
		
		System.out.println("byte의 범위 : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("short의 범위 : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println("int의 범위 : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("Long의 범위 : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		System.out.println("Float의 범위 : " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
		System.out.println("double의 범위 : " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
		
		System.out.println("Charater의 크기 : " + Character.SIZE);
	}
	
}
