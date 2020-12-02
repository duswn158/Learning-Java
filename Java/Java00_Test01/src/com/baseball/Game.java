package com.baseball;

import java.util.Arrays;
import java.util.Scanner;

public class Game extends Print{ // Print 클래스 상속받음
	
	static int stage = 10;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Referee referee = new Referee();
		int[] goal;
		int[] input;
		
		
		do {
			System.out.println(start); // "게임시작" 출력
			goal = new Ball().getGoal();
			//System.out.println("[[[" + Arrays.toString(goal) + "]]]");
			
			User user = new User();
			do { // 게임 반복
				System.out.println(ingPre + (10 - stage + 1) + ingPost); // "* 번째 도전" 출력
				input = user.input(); // 사용자 값 입력받음
				int[] strike = referee.isStrike(goal, input); // 게임 결과 계산
				strikePrn(strike); // 결과 텍스트 출력
				
				if(strike[0] == 3) {
					System.out.println(win);
					break;
				}
				
				stage--; // stage값 1씩 줄임
			}while(stage > 0);
			
			if (stage == 0) {
				System.out.println(losePre + Arrays.toString(goal) + losePost); // "목표 했던 숫자는 * 입니다" 정답 알려주는 텍스트 출력
			}
			// ↓ 다시할까 묻고 게임 진행여부 판단
			System.out.println(end);
			String stop = sc.next();
			if(stop.toUpperCase().equals("N")) {
				break;
			}
			
		} while (true);
		
		System.out.println(bye); // "수고하셨습니다" 출력
	}
	
}
