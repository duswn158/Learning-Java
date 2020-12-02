package com.test02;

public class Season {
	
	
	public static String prn(int month) {
		
		switch (month) {
		
		case 12:
		case 1:
		case 2:
		/* case 3: case 4: case 5: // --> 위와 동일 가로 세로의 차이
		 * res = "봄"
		 * break;
		 */
			return "겨울"; // return == > 해당 메소드가 값을 리턴하고 종료되기 때문에 break가 필요 없음.
		case 3:
		case 4:
		case 5:
			return "봄";
		case 6:
		case 7:
		case 8:
			return "여름";
		case 9:
		case 10:
		case 11:
			return "가을";
			
		default: // default값을 주지않으면 return되지 않음으로 에러남 (모든 경우의 수를 리턴하는지 확인해야함)
			return "잘못된 월";
		}
		
		/*
		 * String res = "계절";
		 
		switch (month) {
		
		case 12:
		case 1:
		case 2:
			res = "봄";
			break;
			
		case 6:
		case 7:
		case 8:
			res = "여름";
			break;
			
		case 9:
		case 10:
		case 11:
			res = "가을";
			break;
			
		default: // default값을 주지않으면 return되지 않음으로 에러남
			res = "계절이 아닙니다.";
			break;
		}
		return res;
		 */
		
	}
}
