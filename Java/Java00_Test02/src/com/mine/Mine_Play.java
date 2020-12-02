package com.mine;

import java.util.Scanner;

public class Mine_Play extends Mine {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇칸짜리 지뢰를 만듭니까? n*n");
		int arrnum = sc.nextInt(); 
		
		new Mine(arrnum); // 지뢰 배열 사이즈 초기화
		
		System.out.println("공백을 기준으로 x,y 좌표를 각각 입력하시오");
		int x  = sc.nextInt();
		int y = sc.nextInt();
		
		//System.out.println(arrnum + "칸 짜리 지뢰를 만들고 "+ x + ","+ y + "좌표로 실행합니다");
		
		play(x,y);
		
	}//main
	
	// 배열 가져온거 "■"로 초기화
	
	
	
	public static void play(int x, int y) {
		// 좌표받아서 해당부분 화면 출력
	}
	
	
	
}//class
