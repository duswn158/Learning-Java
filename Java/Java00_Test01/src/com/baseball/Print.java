package com.baseball;

// 출력담당, 텍스트 변수화, 이겼을때와 졌을때 출력문

public class Print {
	
	static String start = "게임 쉬작";
	static String ingPre = "[";
	static String ingPost = "번째 도전]";

	static String win = "맞추셨습니다!";
	static String losePre = "목표했던 숫자는 ";
	static String losePost = " 입니다...";
	
	static String end = "게임 끝났다. \n 다시 할까요? (y/n)";
	static String bye = "수고하셨습니다.";
	
	static void strikePrn(int[] game) {
		if (game[2] == 1) {
			System.out.println("out 입니다");
		} else {
			System.out.printf("%d strike %d ball 입니다.\n", game[0], game[1]);
		}
	}
	
	
	
}
