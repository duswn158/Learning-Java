package com.test01;

public class MTest01 {
	
	public static void prn02() {
		
		int i = 3;
		
		//fall through(구멍으로 떨어지다)
		switch (i) {
		case 1:
		case 3:
			System.out.println("홀수 입니다.");
			break;
		case 2:
		case 4:
			System.out.println("짝수 입니다.");
			break;
		}
		
	} // 다른 메소드들이 main 메소드보다 위에 있으나 아래있으나 관계없음
	
	public static void main(String[] args) {
		
		prn01();
		prn02();
		
	}
	
	public static void prn01() {
		// if는 순차적으로 모든 코드를 읽어드린다.
		// switch는 해당 case로 jumping 하기 때문에 compiler가 작업하기 편하다.
		int i = 2;
		
		switch (i) {
		case 1 : 
			System.out.println("1입니다.");
			break;
		case 2 : 
			System.out.println("2입니다.");
			break;
		case 3 : 
			System.out.println("3입니다.");
			break;
		case 4 : 
			System.out.println("4입니다.");
			break;
		default : // 값의 대응되는 case가 없을때 실행.
			System.out.println("다른 숫자 입니다.");
			break;
		} 
		// switch 안에 변수나 값,식 등이 들어가고 해당 값에 맞는 case를 찾아수행
		// break;를 만나지 않으면 그 다음 명령문도 실행
	}
	
}
