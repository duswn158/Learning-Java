package com.baseball;

// 중복방지, 랜덤한 숫자 3개 생성, 그 숫자를 넣을 goal이라는 배열 생성
public class Ball {
	
	private int[] goal;
	
	public Ball() {
		goal = new int[3];
		makeGoal();
	}
	
	public Ball(int size) { // 확장성
		goal = new int[size];
		makeGoal();
	}
	
	public int[] getGoal() {
		return goal;
	}
	
	private void makeGoal() {
		
		int cnt = 0;
		
		while(cnt < goal.length) {
			int ran = (int)(Math.random()*9)+1;
			if(!isSame(goal,ran)) { //else부분을 굳이 만들지 않고 읽기 편하도록 !isSame함
				
				goal[cnt] = ran;
				cnt++;
				
			}
		}// while
		
	}//makeGoal
	
	private boolean isSame(int[] arr, int input) {
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == input) {
				return true;
			}
		}
		
		return false;
	}

}
