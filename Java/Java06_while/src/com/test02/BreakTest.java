package com.test02;

public class BreakTest {
	
	/*
	 *  A B C D E
	 *  F G H I J
	 *  K L M N O 
	 *  P Q R S T
	 *  U V W X Y
	 *  Z
	 *  를 출력
	 */
	
	public static void main(String[] args) {
		
		prn();
		
	}
	
	public static void prn() {
		
		int count = 0;
		char c = 'A';
		boolean stop = false;
		
		while (!stop) { // !stop =  true나 false에 !가 붙으면 not 따라서, 위의 stop변수는 false이기 때문에 true가 됨
			
			while(true) { 
			
				System.out.print(c + " ");
				c ++; // 'A' 에 1을 더하면 아스키 코드로 인해 'B' 가 됨
				count ++;
			
			if (count % 5 == 0) {
					break; // 5의 배수일때 break가 되어 while문 바깥 println을 출력
				}
			if (count == 26) {
				stop = true; // 알파벳 26개 모두 출력됬을때 제일 바깥 while문의 값을 true 즉 !true == false로 바꿔 하단 break문 실행
				break;
			}
			
			}
			
			System.out.println(); // 5개 출력후 다음줄로 띄어주기 위함 명령 실행후 while문이 무한루프 이기 때문에 다시 처음부터 돔 count 26이 될때까지
		}
		
	}
	
}
