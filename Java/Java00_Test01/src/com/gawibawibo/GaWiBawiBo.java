package com.gawibawibo;

public class GaWiBawiBo {
	
	private int select;
	// 1 = Gawi, 2 = Bawi, 3 = Bo
	private String[] gawibawibo = {"Gawi", "Bawi", "Bo"};
	
	public int getSelect() {
		return select;
	}
	
	public void setSelect(int select) {
		this.select = select;
	}
	
	public String getHand() {
		return gawibawibo[select];
	}
	
}//class

