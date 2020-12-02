package com.gawibawibo;

public class Ai extends GaWiBawiBo {
	
	public void setSelect() { // 부모 클래스와 파라미터 값이 달라서 override가 아님
		
		// 가위,바위,보 텍스트가 들어있는 배열의 번지수를 랜덤으로 생성 즉 셋중하나 랜덤 선택
		super.setSelect((int)(Math.random()*3));
	}
	
}
