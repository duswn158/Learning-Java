package com.ramdom;

import java.util.Random;

public class MTest {
	
	public static void main(String[] args) {
		mathClass();
		minMax();
		randomClass();
	}
	
	public static void mathClass() {
		
		// 0.0 <= X < 1.0 [0.0보다 크거나 같고 1.0보다 작은 값 즉, 0.0 ~ 0.9 까지의 값을 리턴해주는 메소드] Math클래스는 수학적인 왠만한건 다 만들어져있는 클래스
		double ran = Math.random();
		System.out.println(ran);
		
		// Math.random(); - > 0.0~1.0 까지만 나오기 때문에 (Math.random()*(max - min +1)) + min; 즉 *(9-0+1)+0
		int i = (int)(Math.random()*10); // int 로 형변환 했기 때문에 0 ~ 9까지의 수가 랜덤으로 나옴
		System.out.println(i);
		
	}
	
	public static void minMax() {
		
		// 10 ~ 100사이의 난수 발생시켜 출력
		int min = 10;
		int max = 100;
		int rd = (int)(Math.random()*(max - min + 1)) + min;
		
		System.out.println(rd);
		
		//int i = (int)(Math.random()*91)+10;// 10부터 시작하기 때문에 *91 해야 100까지 출력됨, 뒤에 min값 즉 +10 = 10부터 시작하라
		//System.out.println(i);
		
	}
	
	public static void randomClass() {
		
		Random rd = new Random(); // import java.util.Random; 필요
		System.out.println(rd.nextInt(100)); // 최대 100까지 즉 0 ~ 100까지
		
	}
	
	
}
