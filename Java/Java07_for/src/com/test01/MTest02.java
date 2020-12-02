package com.test01;

public class MTest02 {
	
	public static void main(String[] args) {
		prn();				
	}
	
	public static void prn() {
		
		//int j = 0; //바깥에 둬도 for문 안에서 0으로 초기화 되기때문에 가능. (변수 선언 위치, 초기화 위치따라 다름)
		
		for (int i = 0; i < 10; i ++ ) {
			
			for (int j = 0; j < 10; j ++) { // 해당 블럭 종료후에는 j라는 변수(지역변수) 가 사라짐 따라서 다시 0부터 시작
				System.out.printf("i = %d j = %d\n", i, j);
			} // 큰 반복문 안에서 작은 반복문이 10번 돔
			
			System.out.println();
		}
	}
}
