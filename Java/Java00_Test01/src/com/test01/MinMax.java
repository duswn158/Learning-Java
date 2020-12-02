package com.test01;

public class MinMax {

	//static int ONE;
	//static int TWO;
	
	public static void main(String[] args) {
		
		/*
		 * 1. 어디서나 접근 가능,
		 * 모든 기능을 수행한 후에는 정수 하나가 리턴되는
		 * min이라는 이름의 메소드 생성
		 * 해당 메소드는 정수값 두개를 입력받아서
		 * 둘 중 더 작은 숫자를 리턴해주는 기능을 한다.
		 * - 삼항 연산자 사용
		 * 
		 * 2. 위와 같은 방법으로, 둥 줄 더 큰 숫자를 리턴해주는 기능을 하는
		 * max라는 메소드를 만들자.
		 * 
		 * 3. main 메소드에서
		 * 임의의 숫자 두개를 넣어서, min메소드와 max 메소드에서
		 * 리턴되는 값을 출력하자.
		 */
		
		//min(2,3);
		//max(2,4);
		System.out.println(min(2,3));
		System.out.println(max(2,4));
		
	}
	
	public static int min(int a,int b) {
		
		/*ONE = a;
		TWO = b;
		
		int Result = (a > b) ? b : a;
		System.out.println(Result);
		
		return Result;*/
		
		int Result = (a > b) ? b : a;
		return Result;
		
		//return (a > b) ? b : a; ->> 연산값을 바로 리턴
	}
	
	public static int max(int c, int d) {
		
		/*ONE = c;
		TWO = d;
		
		int Result = (c > d) ? c : d;
		System.out.println(Result);
		
		return Result;*/
		
		return (c > d) ? c : d;
	}
	
}
