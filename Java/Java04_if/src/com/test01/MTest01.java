package com.test01;

public class MTest01 {
	
	public static void main(String[] args) {
		
		prn01();
		prn02(true, false);
		
	}
	
	public static void prn02 (boolean ring, boolean married) {
		
		if (ring) {
			//boolean 타입이기 때문에 ring == true 상단에 조건부분에 쓸필요 없음
			
			if (married) {
				System.out.println("결혼하셨군요!");
			} else {
				System.out.println("연인이 있으시군요!");
			}
		} else {
			if (married) {
				System.out.println("결혼반지 어디...?");
			} else {
				System.out.println("솔로....?");
			}
		}
		
		if (ring && married) {
			System.out.println("결혼하셨군요!"); // 반지도 있고 결혼도 했다
		} else if (ring || married) {
			System.out.println("연인이 있으시군요!"); // 반지는 있는데 결혼은 안했거나 결혼은 했는데 반지가 없거나.
		} else {
			System.out.println("솔로....?");
		}
		
	}
	
	public static void prn01() {
		
		int i = 10;
		int j = 20;
		
		// if
		if (i < j) {
			System.out.println("i가 j보다 작습니다.");
		}
		
		// if ~ else
		if (i > j) {
			System.out.println("i가 j보다 큽니다");
		} else {
			System.out.println("i가 j보다 작거나 같습니다.");
		}
		
		// if ~ else if
		if (i > j) {
			System.out.println("i가 j보다 큽니다.");
		} else if (i < j) {
			System.out.println("i가 j보다 작습니다"); // 해당 조건이 참이면 다음 문장으로 넘어가지 않음
		} else if (i == j) {
			System.out.println("i와 j는 같습니다");
		}
		
		// if ~ else if ~ else
		if (i > j) {
			System.out.println("i가 j보다 큽니다.");
		} else if (j > i) {
			System.out.println("i가 j보다 작습니다.");
		} else { 
			System.out.println("i와 j는 같습니다.");
		}
	}
	
}
