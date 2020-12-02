package com.stack;

import java.util.Arrays;
import java.util.Scanner;

public class MyStack {
	/*
	 * push 값을 넣는 메소드
	 * pop 값을 빼는 메소드
	 * 
	 * 아무것도 없는데 pop하면 Underflow
	 * 꽉 찾는데 값을 넣으면 Overflow
	 * 에러가 나는 기능
	 */
	private int top = -1;
	private int size;
	
	// Object는 가장 최상위 이기때문에 모든 형태의 값이 전부 다들어 갈 수 있게 하기위해
	private Object [] arr;
	
	public MyStack() {		
		this.size = 5;
		arr = new Object[size];	
	}
	
	public MyStack(int size){
		this.size = size;
		arr = new Object[size];	
	}
	
	public void push(Object input) {

		top++; // 커서
		
		if (top >= size) {
			System.out.println("OverFlow");
			top--;
		} else {
			arr[top] = input;
		}
		
	}
	

	public Object pop() {
		
		if(top < 0) {
			return "Underflow";
		} else {
			
			Object rtn = arr[top];
			
			arr[top] = null; //top이 가리키고 있던 값은 빼줌
			top --; // top 커서를 밑으로 한칸 내름 즉 값을 빼고 뺀자리는 비워주며 커서는 한칸 내려줌
			
			return rtn;
		}
	}
	
	@Override
	public String toString() {
		return Arrays.toString(arr); // 현재 배열의 남은게 뭔지 보여줌
	}
	
}//class
