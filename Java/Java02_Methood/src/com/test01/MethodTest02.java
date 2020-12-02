package com.test01;

public class MethodTest02 {
	
	// method 호출 방법
	public static void main(String[] args) {
		// 1. static인 경우 : Class.method(); 로 호출함
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodTest01.privateMethod(); 현재 클래스에서만 접근, 참조 가능 하기때문에 사용불가
		
		// 2. non static : class(type) 변수 = new class(); 로 호출
		//					변수.method();
		MethodTest01 myNonStatic = new MethodTest01(); // 만들고
		myNonStatic.nonStaticMethod(); // 호출
	}
	
	// http://www.objectaid.com 에서 다운로드 페이지에 name과 주소를 참조 해서 Help > Install New Software
	// 다이아그램 만드는법 - > 설치 후 패키지 오른쪽 클릭 > new > other > 오브젝트 다이어그램 > 이름 생성 > finish
	// UML (Unified Modeling Language) : 설계때문에 만드는 그림

}
