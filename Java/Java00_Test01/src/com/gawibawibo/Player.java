package com.gawibawibo;

import java.util.Scanner;

public class Player extends GaWiBawiBo {

	public void setSelect() {
		System.out.println("input select\n0:Gawi 1:Bawi 2:Bo");
		
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		
		// 부모 클래스에 있는 가위바위보 배열에 번지수를 사용자가 입력함 즉, 가위,바위,보 중에 고름
		super.setSelect(select);
	}
	
}
