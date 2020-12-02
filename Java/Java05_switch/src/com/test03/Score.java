package com.test03;

public class Score {
	
	
	public double getAvg(int kor,int eng, int math) {
		
		double res = (double)(kor + eng + math) / 3; // double로 형 변환  혹은 /3이 아닌 /3.0으로해도 가능
		
		return res;
		
	}
	
	public String getGrade(double avg) {
		
		String res = null; // 아무것도 없는 값으로 초기화
		
		// switch 는 정수형,문자형, 문자열(1.7버젼 이후)만 들어갈 수 있음
		switch((int)avg/10) { // 평균을 10으로 나눠 소수를 정수로 변환.
		
		case 10:
		case 9:
			res = "A";
			break;
		case 8:
			res = "B";
			break;
		case 7:
			res = "C";
			break;
		case 6: 
			res = "D";
			break;
		default:
			res = "F";
			break;	
		}
		
		return res;
		
		
		/*
		if (avg >= 90) {
			return "A";
		} else if(avg >= 80) {
			return "B";
		} else if(avg >= 70) {
			return "C";
		} else if(avg >= 60) {
			return "D";
		} else {
			return "F";
		}
		*/
		
		// 소수점 두자리수로 나오도록.
		
	}

}
