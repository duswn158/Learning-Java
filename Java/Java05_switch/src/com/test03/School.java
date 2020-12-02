package com.test03;

public class School {
	public static void main(String[] args) {
		
		String name = "유연주";
		int kor = 100;
		int eng = 80;
		int math = 95;
		
		
		Score score = new Score();
		double avg = score.getAvg(kor,eng,math);
		
		String avg01 = String.format("%.2f", avg); //소수점 두자릿수를 만들기 위한 클래스
		
		System.out.println("평균 : " + avg01);
		
		String grade = score.getGrade(avg);
		System.out.println("등급 : " + grade);
		
		
		/*
		 * Score 클래스에 메서드를 만들자.
		 * 
		 * 1. int (kor,eng,math) 3개를 입력받아 평균을 리턴하는
		 * 	getAvg 메서드를 만들자. 리턴 타입은 double
		 * 	어디서나 접근 가능하고, non-static이다
		 * 
		 * 2. double avg (평균)을 입력받아
		 * 	100 ~ 90 : A
		 * 	89 ~ 80 : B
		 * 	79 ~ 70 : C
		 *  69 ~ 60 : D
		 *  59 ~ : F
		 *  를 리턴하는 getGrade 메서드를 만들자.
		 *  어디서나 접근 가능하고 non-static, 리턴타입은 String
		 *  
		 * 3. School class의 main 메서드에서
		 * 	Score 클래스의 getAvg 메서드를 사용하여 평균을 출력하고
		 * 	Score 클래스의 getGrade 메서드를 사용하여 등급을 출력하자.
		 *  ex)
		 * 	평균 : 60.11  (소수점 둘째자리까지 출력  -> String class 사용해서.)
		 * 	등급 : D 
		 */
		
		/*
		Score get = new Score(); // 앞의 클래스 이름과 동일하게 값을 줘야함  (인스턴스)생성자 를 만들기 위함.

		double avg = get.getAvg(kor,eng,math); // avg값 선언하기 위한 함수호출 선언하며 변수에 값 저장후 아래에 두번 사용
		
		System.out.println("총점 :" + avg);
		System.out.println("평균 : " + get.getGrade(avg)); // 위에서 값을 만들어 줬기 때문에 값을 생성하지 않고 논스테틱 함수 바로 호출
		*/
	}
}
