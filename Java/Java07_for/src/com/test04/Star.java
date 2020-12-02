package com.test04;

public class Star {
	
	public void prn01() {
		//*
		//**
		//***
		//****
		//*****
		
		/*
		int count = 1;
		
		while (count <= 5) {
			count ++;			
			for(int i = 1; i < count; i++) {
				System.out.print('*');
			}
			System.out.println();		
		}*/
		
		for (int i = 0; i < 5; i++) { // i = 줄
			// j 는 i+1 번 반복하며 * 찍어줌
			for (int j = 0; j < i+1 ; j++) { // 조건 -> j < i+1 혹은 j <= i 
				System.out.print('*');
			}
			System.out.println();
		}
		
	}
	
	public void prn02() {
		//***** 별 = 5 - 0개
		//****		5 - 1개
		//***		5 - 2개
		//**		5 - 3개
		//*			5 - 4개
		
		/*
		for (int i = 1; i <= 5; i++) {
			
			for(int j = 5; j >= i; j--) {
				System.out.print('*');
			}
			
			System.out.println();
		}*/
		
		for(int i = 0; i < 5; i++) {
			
			// i번 줄에서 5-i번 돌아야함
			for (int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void prn03() {
		//    *
		//   **
		//  ***
		// ****
		//*****
		
		/*
		for (int i = 0; i < 5; i++) { 

			for (int c = 0; c < 5-i; c++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+1 ; j++) { // 조건 -> j < i+1 혹은 j <= i 
				System.out.print('*');
			}
			
			System.out.println();
		}*/
		
		for (int i = 0; i < 5; i++) {
			
			// j는 공백 -> 4-0, 4-1, 4-2, 4-3, 4-4
			for(int j = 0; j < 4 - i; j ++) {
				System.out.print(" ");
			}
			
			// k는 * -> 0+1, 1+1, 2+1, 3+1 , 4+1
			
			for (int k = 0; k < i + 1; k ++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	public void prn04() {
		//			i(줄)  j(공백)	k (별)
		//*****		 0		0		5-0
		// ****		 1		1		5-1
		//  ***		 2		2		5-2
		//   **		 3		3		5-3
		//    *		 4		4		5-4
		
		for (int i = 0; i < 5; i++) { 

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 5-i ; k++) {  
				System.out.print('*');
			}			
			
			System.out.println();
		}
		
		
		/*
		for (int i = 0; i < 5; i++) { 

			for (int c = 0; c < i+1; c++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 5-i ; j++) { // 조건 -> j < i+1 혹은 j <= i 
				System.out.print('*');
			}			
			
			System.out.println();
		}*/
	}
	
	public void prn05() {
		//    *   
		//   ***
		//  *****
		// *******
		//*********
		
		for (int i = 0; i < 5; i++) {
			
			// 공백
			for (int j = 4-i; j > 0 ; j--) {
				System.out.print(" ");
			}
			
			// 별 : 0+1, 2+1, 4+1, 6+1, 8+1
			//	      즉 2*i+1개 라는 식
			for (int k = 0; k < 2*i+1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		/*
		for (int i = 0; i < 5; i++) { 

			for (int c = 0; c < 7-i; c++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i ; j++) {  
				System.out.print('*');
			}
			for (int j = 0; j < i+1 ; j++) { 
				System.out.print('*');
			}			
			
			System.out.println();
		}*/
		
	}
	
}
