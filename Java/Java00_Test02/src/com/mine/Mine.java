package com.mine;

public class Mine {
	
	private int size;
	private String[][] arr;
	
	public Mine() {
		this.size = 10;
	}
	
	public Mine(int size) {
		this.size = size;
	}
	
	public String[][] make(){
		arr = new String[size][size];
		
		// 0으로 초기화 (스트링 기본값은 null이기 때문에)
		fillTheZero();
		
		// 랜덤으로 *(폭탄) 세팅
		randomMine();
		
		// * 카운트
		countMine();
		
		return arr;
	}
	
	private int count(int x, int y) {
		// 좌표 위아래 양옆의 값을 확인해서 지뢰의 갯수를 해당 좌표에 넣어주는 메서드
		
		int cnt = 0;
		
		for(int i = x-1; i<= x+1; i++) {
			for(int j = y-1; j <= y+1; j++ ) {
				
				if(i < 0 || j < 0 || i > arr.length-1 || j > arr.length-1) {
					continue; // outofbounds 오류 않뜨게 가장자리 애들이면 넘김
				}
				
				if(arr[i][j].equals("*")) {
					cnt++; //지뢰면 카운트
				}
			}
		}
		
		return cnt;
		
	}

	private void countMine() {
		// 처음부터 끝까지 돌면서 주위에있는 지뢰 개수를 셈
		
		for ( int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				// arr[i][j] = count(i,j)+""; 별없어져버림 별있으면 세면 안댐
				if(!arr[i][j].equals("*")) {
					arr[i][j] = count(i,j)+"";
				}
			}
		}
		
	}

	private void randomMine() {
		
		int cnt = size;
		while (cnt != 0) {
			
			// X,Y좌표 랜덤생성
			int ranX = (int)(Math.random()* size);
			int ranY = (int)(Math.random()* size);
			
			if(!arr[ranX][ranY].equals("*")) {
				arr[ranX][ranY] = "*";
				cnt--;
			}
		}
		
	}

	private void fillTheZero() {
		
		//배열 0으로 채워줌 (클래스도 있음)
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "0";
			}
		}
		
	}
	
	
	
	// test -----------------------	플레이하는 클래스에 있어야 하는 메인메서드 이지만 테스트를 위해만듬------ 아래는 지울거라고 표시
	/*
	public static void main(String[] args) {
		Mine mine = new Mine();
		//mine.fillTheZero(); -> 출력안됨 출력문 읎엉
		mine.make();
		mine.prn();
		
	}
	
	public void prn() {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3s",arr[i][j]);
			}
		
			System.out.println();
		}
		
	}
	*/
	
	
	
}
