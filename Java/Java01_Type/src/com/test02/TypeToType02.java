package com.test02;

public class TypeToType02 {

	public static void main(String[] args) {
		
		int i = 65;
		char c = (char) i;
		System.out.println(c); // 65에 대응되는 ASCII 코드인 A가 출력됨
		
		char c2 = 'B';
		int i2 = (int)c2;
		System.out.println(i2); // B에 대응하는 ASCII코드인 66이 출력
		
		char c3_1 = '9'; // 9의 ASCII코드 57
		char c3_2 = '1'; // 1의 ASCII코드 49
		int i3 = c3_1 + c3_2; // 57 + 49
		System.out.println(i3); // = 106
		
		String str = "65";
		System.out.println(str+1); // 캐릭터와 다르게 그저 문자이기에 ASCII코드와 대응되지 않음
		
		int i4 = Integer.parseInt(str); // 문자열 안에 들어있는 숫자를 숫자로 변경해주는 parseInt
		System.out.println(i4+1);
		
		int i5 = 65;
		String str2 = String.valueOf(i5); // 숫자를 문자열로 바꾸어 주는 valueOF
		System.out.println(str2+1);
		String str3 = Integer.toString(i5);// 숫자를 문자열로 바꾸어 주는 toString
		System.out.println(str3+2);
		
	}
	
}
