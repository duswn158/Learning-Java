package com.test01;

public class MTest01 {
	
	public static void prn03() {
		
		int i = 1; // i = 10일때 거짓이더라도 10을 출력하고 종료됨 (한번 실행후 조건 비교,종료)
		
		do {
			System.out.println(i);
			i++;
		} while (i == 10); // i==10으로 조건설정시 i가 10일때만 참
		
		System.out.println("do while이 종료된 후 i = " + i);
	}
	
	public static void prn02() {
		
		int i = 0;
		while (i < 10) { // i가 10이 되었을때는 거짓이기때문에 출력하지 않고 값만 10이됨
			System.out.println(i);
			i++;
		}
		
		System.out.println("while 이 종료된 후의 i = " + i);
	}
	
	public static void prn01() {
		
		while (true) { // 계속 반복
			System.out.println("Hello, World!");
		}
		
	}
	
	public static void main(String[] args) {
		//prn01();
		prn02();
		//prn03();
		//prn04();
	}

	private static void prn04() {
		
		int i = 1;
		while (true) {
			System.out.println(i);
			//i ++; // 여기에 증감연산자 넣을때 9까지 출력 
			if (i == 10) {
				break;
			}
			
			i++; // if break조건문 아래 증감 연산자를 넣을 경우 10까지 출력
		}
		
	}
	
}
