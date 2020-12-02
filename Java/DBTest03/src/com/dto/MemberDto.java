package com.dto;

// Data Transfer Object (데이터 전달 객체)
// Value Object (값 객체)
public class MemberDto {
	
	// 필드를 통해 테이블 row하나를 Dto가 저장할 수 있음
	private int m_no;
	private String m_name;
	private int m_age;
	private String m_gender;
	private String m_location;
	private String m_job;
	private String m_tel;
	private String m_email;
	
	// 기본 생성자
	public MemberDto() {
		
	}
	
	// 파라미터 8개 짜리 생성자
	public MemberDto(int m_no, String m_name, int m_age, String m_gender, String m_location, String m_job, String m_tel, String m_email) {
		
		this.m_no = m_no;
		this.m_name = m_name;
		this.m_age = m_age;
		this.m_gender = m_gender;
		this.m_location = m_location;
		this.m_job = m_job;
		this.m_tel = m_tel;
		this.m_email = m_email;
		
	}

	
	// getter setter
	
	public int getM_no() {
		return m_no;
	}

	public void setM_no(int m_no) {
		this.m_no = m_no;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public int getM_age() {
		return m_age;
	}

	public void setM_age(int m_age) {
		this.m_age = m_age;
	}

	public String getM_gender() {
		return m_gender;
	}

	public void setM_gender(String m_gender) {
		this.m_gender = m_gender;
	}

	public String getM_location() {
		return m_location;
	}

	public void setM_location(String m_location) {
		this.m_location = m_location;
	}

	public String getM_job() {
		return m_job;
	}

	public void setM_job(String m_job) {
		this.m_job = m_job;
	}

	public String getM_tel() {
		return m_tel;
	}

	public void setM_tel(String m_tel) {
		this.m_tel = m_tel;
	}

	public String getM_email() {
		return m_email;
	}

	public void setM_email(String m_email) {
		this.m_email = m_email;
	}
	
	
	// toString
	
	@Override
	public String toString() {
		return m_no + "\t" + m_name + "\t" + m_age + "\t" + m_gender + "\t" + m_location + "\t" + m_job + "\t" + m_tel + "\t" + m_email;
	}
	
	
}
