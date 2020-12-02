package com.test02;

import com.test01.MethodTest01; // 다른패키지이기 때문에 불러와야함 (선언)

public class MethodTest03 {
	
	public static void main(String[] args) {
		
		MethodTest01.publicMethod();
		//MethodTest01.protectedMethod(); 상속아님 같은패키지 아님
		//MethodTest01.defaultMethod(); 같은 패키지 아님
		//MethodTest01.privateMethod(); 같은 클래스 아님
		
		MethodTest01 method = new MethodTest01();
		method.nonStaticMethod();
		
		
	}

}
