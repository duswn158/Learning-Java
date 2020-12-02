package Com.test02;

public class MTest {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 다음 class diagram을 보고 class를 작성하자.
		 * 
		 * 2. basketSetting 메서드에서는 String name과 int fruit라는 paremeter가 있는데,
		 * 	  name의 값을 전역변수 froutName에 대입하고,
		 * 	  fruit의 값을 fruitCount에 대입하자
		 * 	   
		 * 	    그 후, basketPrn()메서드를 호출하자.
		 * 
		 *  3. basketPrn에서는
		 *  	"바구니 안의 과일 : xx" (과일의 이름)을 출력하고,
		 *  	basketSize의 값이 fruitCount 값보다 더 크거나 같으면,
		 *  	"xx의 갯수는 n개 입니다" (과일의 이름, 과일의 숫자)
		 *  	작으면
		 *  	"바구니가 넘쳤습니다."
		 *  	를 출력하자.
		 *  
		 *  	삼항연산자를 사용하자.
		 * 
		 */
		
		FruitBasket.basketSize = 20;
		
		FruitBasket bananaBasket =
				new FruitBasket();
		bananaBasket.basketSetting("바나나", 10);

		System.out.println(bananaBasket.basketSize); // static은 class(type) 전체에 적용되기 때문에 static방식으로 사용하라는 경고
		System.out.println(bananaBasket.fruitCount);
		//System.out.println(FruitBasket.fruitCount); // static에서 nonstatic으로의 접근이 안된다는 오류 생성됨
		
		FruitBasket.basketSize = 40; // 다시 선언으로 아래는 basketSize 40으로 값을 지정 
		FruitBasket appleBasket = 
				new FruitBasket();
		appleBasket.basketSetting("사과",22);
		
		System.out.println(appleBasket.basketSize); // static이기 때문에 FruitBasket 전체에 적용되는 basketSize
		System.out.println(appleBasket.fruitCount); // nonstatic이기 때문에 해당 바구니에만 적용 되는 fruitCount
		
	}
	
	
}
