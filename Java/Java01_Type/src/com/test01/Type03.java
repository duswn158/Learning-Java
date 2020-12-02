package com.test01;

public class Type03 {
 
	// 실수형 (소수점이 있는 숫자) : float(4) - 접미사 'f' , double(8) - 접미사 'd'( 생략가능 )
	public static void main(String[] args) {
		
		float f1 = 0.1f;
		float f2 = 9.8F;
		float sumF = f1 + f2; // 약간의 오차가 있을 수 있음
		System.out.println(sumF);
		
		System.out.println("------------------");
		
		double d1 = 100.04d;
		double d2 = 9.06; // 실수형의 기본은 double 따라서 접미사 생략가능
		double sumD = d1 + d2;
		
		System.out.println(sumD + " = " + d1 + " + " + d2);
		
	}
	
}
