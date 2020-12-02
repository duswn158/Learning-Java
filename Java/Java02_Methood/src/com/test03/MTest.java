package com.test03;

public class MTest {
	
	// return 값이 없을때는 void를 사용
	
	public static void main(String[] args) {
		
		MyCalc.sum(10, 3); // 메소드에 값을 전달하기위한 값,메소드 외부에서 전달되는 값 argument
		
		int subRes = MyCalc.sub(10,3); // MyCalc.sub 메소드를 호출해서 10과3을 넣고 subRes에 int형으로 대입하라
		System.out.println("10 - 3 = " + subRes);
		
		double mulRes = MyCalc.mul(10.2, 3);
		System.out.println(mulRes);
		
		System.out.println(MyCalc.mul(10.3, 2)); // 제일 안쪽에있는 괄호부터 호출해서 결과값으로 바꾸고 그다음것을 처리
		
		MyCalc.div(10, 3);
		
	}


}
