package com.baseball;

import java.util.Scanner;

// 확장성, 문자 입력 받아서 잘라서 배열에 넣고, int형으로 변환해 리턴해줌 

public class User {
	
	private int[] inputArr;
	private int size;
	
	public User() {
		size = 3;
		inputArr = new int[size];
		
	}
	
	public User(int size) {
		this.size = size;
		inputArr = new int[size]; // 나중에 숫자 3개가 아닌 다른 숫자를 받을때 다시만들지 않기 위해 즉 확장성을 위해 만듬
	}
	
	public int[] input() {
		
		System.out.println(size + " 자리수의 숫자를 입력해 주세요");
		System.out.println("(각 숫자는 공백으로 구분, 1 ~ 9 사이의 숫자)");
		
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		
		for(int i = 0; i < inputArr.length; i++) {
			// parseInt -> 숫자만으로 이뤄진 문자열이라면 그걸 숫자로 바꾸어줌
			inputArr[i] = Integer.parseInt(input[i]);
		}
		
		return inputArr;
	}
	
	
	
	
}
