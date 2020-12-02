package com.test01;

import com.score.*;
//import com.score.Score; //->필요한 Score클래스만 가져다 써도됨

/*
 * - Java00_Hello\com.test01\MTest.java
	- Java00_Hello → (우클릭) Properties → Java Build Path

    → Libraries - Add External JARs... → QClass.jar 추가 → Apply and Close

	- Package Explorer에서 Referenced Libraries로 추가된 걸 확인할 수 있음
 */

public class MTest {
	
	// 내가 만든 .jar 파일로 Score클래스를 저장 후 라이브러리에서 불러와서 Score클래스를 사용하고있음
	// 배포했기 때문에 어떻게 만들어진건지 사용자는 알 수 없음
	public static void main(String[] args) {
		
		Score score = new Score("유연주",100, 100, 100);
		System.out.println(score);
		
	}
	
}
 