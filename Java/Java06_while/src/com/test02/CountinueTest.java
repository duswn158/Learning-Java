package com.test02;

public class CountinueTest {
	
	public static void main(String[] args) {
		prn();		
	}
	
	public static void prn() {
		
		int i = 0;
		
		while (i < 11) {
			
			i ++;
			
			if(i % 2 == 0) {
				continue; // 짝수일때는 continue문 아래있는 명령 더이상 수행하지 않고 제일 상단으로 건너뛰어 다시 돌림 즉 짝수는 출력되지 않음
			}
			
			System.out.println(i); // 홀수가 출력됨
		}
		
	}
	
}
