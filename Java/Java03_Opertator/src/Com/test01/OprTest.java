package Com.test01;

public class OprTest {
	
	// field : 객체의 정보(상태),속성
	// 전역변수  : 클래스 전체에서 사용
	public static int I; // I라는 변수
	public static final int TEN = 10; // 10이라는 상수 (final이 붙으면 상수)

	
	// method : 객체의 동작(기능)
	// 프로그램의 주 진입점 하나만 있어야하고 주 진입점이기 때문에 아래의 형태 그대로 사용되어야함 (형태가 다르면 메인이라는 메소드로만 봄)
	public static void main(String[] args) { // public접근 제한자이며 스테틱 메모리에 저장되고 리턴값이 없는 main 메소드

		// 지역변수 : 해당 블록 내에서만 사용할 수 있는 변수 (파라미터 포함)
		// 지역변수가 우선
		
		I = 3; //전역변수
		int I = 3; //지역변수
		
		//String res = op01(TEN, I);
		//System.out.println(res);
		
		System.out.println(op01(TEN,I));
		System.out.println(op02());
		
		op03(TEN, 5);
		op04();
		op05();
		op06();
		op07();
		
	}
	
	public static String op01(int a, int b) {
		// 1.사칙연산
		
		System.out.printf("%d + %d = %d\n", a, b, (a + b));
		System.out.printf("%d + %d = %d\n", a, b, (a - b));
		System.out.printf("%d + %d = %d\n", a, b, (a * b));
		System.out.printf("%d / %d = 몫 : %d, 나머지:%d \n", a, b, (a / b), (a % b));
		
		return "사칙연산 끝!\n";
	}
	
	public static String op02() {
		// 2.대입연산(+=, -=, *=, /=, %=)
		
		int res = 0;
		System.out.println("res = " + res);
		
		res = res + 10; // => res += 10; 과 같음
		System.out.println("res = " + res);
		
		res += 10;
		System.out.println("res = " + res);
		
		res -= 10;
		System.out.println("res = " + res);
		
		
		return "--------------------------------";
	}
	
	public static void op03(int a, int b) {
		// 3. 증감 연산자 (++, --) 
		// 전위 연산자 : 연산자를 변수 앞에 붙여서 연산을 먼저 하게되고, 값을 나중에 리턴
		// 후위 연산자 : 연산자를 변수 뒤에 붙여서 값을 먼저 리턴하고, 연산을 나중에 한다.
		
		System.out.println(a);			// 10
		System.out.println(a++);		// 10 (11)
		System.out.println(--b);		// 4 (4)
		System.out.println(--a + b++);	// 14 (10 + 4 (5))
	}
	
	public static void op04() {
		// 4. 논리연산자 (&&, ||) : true 혹은 false
		
		System.out.println(true & true); // 해당 문단만 참 나머진 모두 거짓
		System.out.println(true & false); // and 연산은 둘다 참일때만 참
		System.out.println(false & true);
		System.out.println(false & false);
		
		System.out.println("--------------------");
		
		System.out.println(true | true);
		System.out.println(true | false); // or 연산은 둘중 하나라도 참이면 참
		System.out.println(true | true);
		System.out.println(false | false); // -> 해당 문단만 거짓 위에 다른건 모두 참
		
		System.out.println("====================");
		
		System.out.println(true && true);
		System.out.println(true && false); //앞이 true면 뒤도 일단 계산함
		System.out.println(false && true); // [Dead code] &&는 앞에가 거짓일 경우 뒤는 계산 하지않음
		System.out.println(false && false);
		
		System.out.println("---------------------");
		
		System.out.println(true || true); // [Dead code] || 앞이 참이면 뒤는 계산 하지않음
		System.out.println(true || false);
		System.out.println(false || true); // 앞이 거짓이면 뒤도 일단 계산함
		System.out.println(false || false);
		
		System.out.println("======================");
		
		I = 11;
		System.out.println((TEN > I) && (TEN < I)); // 거짓일때 뒤를 계산 하지 않기 때문에 메모리 절약이 됨 
	}
	
	public static void op05() {
		// 5. 비교연산자
		
		System.out.println(TEN > I);  // 크다
		System.out.println(TEN >= I); // 크거나 같다
		System.out.println(TEN < I);  // 작다
		System.out.println(TEN <= I); // 작거나 같다
		System.out.println(TEN == I); // 같다
		System.out.println(TEN != I); // 같지 않다
		
		System.out.println("----------------------");
	}
	
	public static void op06() {
		
		// 6. 삼항 연산자 (조건) ? > 참 : 거짓
		
		int a = 5;
		int b = 9;
		int i = (a > b)? a-b : b-a; // 참일때는 앞에 명령을 거짓일때는 뒤의 명령을 실행하고 거짓이든 참이든 리턴되는 값의 형태는 같아야함(따라서 int변수로 받았음)
		
		System.out.println(i);
		
		boolean res = false;
		res = (a < b) ? true : false;
		System.out.println(res); // true 위의 항에서 true값이 대입 됬기 때문에.
		
		String str = (a < b)? "a가 b보다 작다" : "a가 b보다 크거나 같다";
		System.out.println(str);
		
		String result = (a > b) ? "a가 b보다 크다" : (a < b) ? "a가 b보다 작다" : "a와 b가 같다"; // a가 b보다 작다 [앞의 연산을 실행해 거짓이면 거짓에 해당하는 값인 해당하는 삼항 연산을 실행해 다시 비교]
		
		System.out.println("----------------------");
		
	}
	
	public static void op07() {
		// 7. 비트연산 (빠르기 때문에, 게임이나 과학에서 사용.) : &, |(or), ^, ~, <<, >>
		// 0,1 비트 상태에서 연산
		
		int a = 10; // int = 4byte = 32bit
		// 0000 0000 0000 0000 0000 0000 0000 1010;
		int b = 02;
		// 0000 0000 0000 0000 0000 0000 0000 0010;
		
		System.out.println(a & b); //and 교집합
		
		// 0000 0000 0000 0000 0000 0000 0000 1010;
		// 0000 0000 0000 0000 0000 0000 0000 0010;
		//------------------------------------------
		// 각 비트별로 and 연산을 함 두개가 같으면 1 아니면 0
		// 0000 0000 0000 0000 0000 0000 0000 0010;
		
		System.out.println(a | b); //or 합집합
		// 0000 0000 0000 0000 0000 0000 0000 1010;
		
		System.out.println(~a); //not 반전,부정
		// 0000 0000 0000 0000 0000 0000 0000 1010;
		// 1111 1111 1111 1111 1111 1111 1111 0101; (-11) 부호비트, 10의 보수인 -10 -> 1을 더해 -11
		
		System.out.println("----------------------------------");
		
		int c = 10;
		// 0000 0000 0000 0000 0000 0000 0000 1010;
		System.out.println(c >> 2);
		// 0000 0000 0000 0000 0000 0000 0000 1010;
		// 0000 0000 0000 0000 0000 0000 0000 0010; 오른쪽으로 두칸 넘어가며 부족한 부분은 채우고 넘어간 부분을 잘림 즉 2
		
		System.out.println(Integer.toBinaryString(c << 4)); // Integer.toBinaryString == 숫자를 2진수로 출력하라
		// 0000 0000 0000 0000 0000 0000 0000 1010;
		// 0000 0000 0000 0000 0000 0000 1010 0000; 왼쪽으로 네칸. 
		// c*2의 4승(10*2의 4승) == 즉 160
		
		System.out.println(c >> 1);
		// 0000 0000 0000 0000 0000 0000 0000 1010;
		// 0000 0000 0000 0000 0000 0000 0000 0101; 이 됨
		
	}
	
}
