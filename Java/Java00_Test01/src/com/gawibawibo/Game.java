package com.gawibawibo;

import java.util.Scanner;

public class Game {
	
	public static String isWin(int ai, int player) {
		/*
		 * 나 기준에서 이겼는지 졌는지 확인
		 * 
		 * 		0	1	2 (player)
		 * 0	무
		 * 1		무
		 * 2			무
		 * 
		 * (ai) 
		 * 
		 * 같은걸 내면 무승부
		 *
		 */
		
		String[][] winDrawLose = {
				
				{"draw","Win","Lose"},
				{"Lose","draw","Win"},
				{"Win","Lose","draw"}
				
		};
		
		return winDrawLose[ai][player];
	}
	
	public static void main(String[] args) {
		
		Ai ai = new Ai();
		Player player = new Player();
		// Ai가 선택하는 클래스와 Player 선택을 입력받는 클래스 불러옴
		
		System.out.println("GawiBawoBo Game!!!");
		
		boolean res = true; // 계속 돌다가 그만한다고 하면 false로 멈추기 위한 변수
		while(res) {
			ai.setSelect();
			player.setSelect();
			// ai와 player의 Select값 생성
			
			System.out.printf("AI : %s VS player: %s\n",ai.getHand(),player.getHand());
			System.out.println(isWin(ai.getSelect(), player.getSelect()));
			
			// 게임을 더할지 그만할지 선택하게해줌
			// count할 변수를 하나 만들어 몇판이상 하면 메시지가 출력되도록 할수 있겠음
			Scanner sc = new Scanner(System.in);
			System.out.println("1.한판더한다 2.그만한다 ");
			int end = sc.nextInt();
			
			if(end == 2) {
				res = false;
			} else {
				res = true;
			}
			
		}
		
	}
	

}
