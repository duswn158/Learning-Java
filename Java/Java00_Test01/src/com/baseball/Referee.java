package com.baseball;

// 심판 즉, 게임 결과를 계산함

public class Referee {
	
	/*
	 * int[] output;
	 * output[0] = strike;
	 * output[1] = ball;
	 * output[2] = out;
	 */	
	
	public int[] isStrike(int[] goal, int[] input) {
		
		int[] output = new int[3];
		
		int strikeCount = 0;
		int ballCount = 0;
		
		for(int i = 0; i < goal.length; i++) {
			for(int j = 0; j < input.length; j++) {
				
				// goal[] -> 컴퓨터가 생성한 배열, input[] -> 사용자가 입력한 배열
				if(goal[i] == input[j]) { // 값이 같은게 있을때
					if(i == j) { // 자리수도 같으면 스트라이크
						strikeCount++;
					} else { // 값만 같으면 볼
						ballCount++;
					}
				}//if
			}
		}
		
		if((strikeCount + ballCount == 0)) {
			//out
			output[2] = 1;
		} else {
			output[0] = strikeCount;
			output[1] = ballCount;
		}
		
		return output;
	}

}
