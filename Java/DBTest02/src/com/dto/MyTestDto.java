package com.dto;

// Data Transfer Object
// 테이블에 ROW 하나의 값이 Dto에 들어감
public class MyTestDto {
	
	// MMO NUMBER
	private int mno;
	
	// MNAME CARCHAR2(20)
	private String mname;
	
	// NICKNAME VARCHAR2(20)
	private String nickname;
	
	
	
	// 기본생성자
	public MyTestDto() {
		
	}
	
	public MyTestDto(int mno, String mname, String nickname) {
		this.mno = mno;
		this.mname = mname;
		this.nickname = nickname;
	}
	
	// geter seter
	public int getMno() {
		return mno;
	}
	
	public void setMno(int mno) {
		this.mno = mno;
	}
	
	public String getMname() {
		return mname;
	}
	
	public void setMname(String mname) {
		this.mname = mname;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	@Override
	public String toString() {
		return mno + " " + mname + " " + nickname;
	}
	// System.out.println(); 하면 안에있는 값들 출력시켜줌
	
}
