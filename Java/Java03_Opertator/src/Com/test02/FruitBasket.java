package Com.test02;

public class FruitBasket {
	
	static int basketSize; // class 변수
	int fruitCount; 		// instance 변수 라고 부름(static의 차이)
	String fruitName;
	
	public FruitBasket() {
		
	}
	
	public void basketSetting(String name,int fruit) {
		
		
		fruitName = name;
		fruitCount = fruit;
		
		basketPrn();
		
	}
	
	private void basketPrn() {
		
		System.out.println("바구니 안의 과일 : " + fruitName);
		
		String res = (basketSize >= fruitCount) ? fruitName +"의 갯수는 "+ fruitCount + "개 입니다." : "바구니가 넘쳤습니다.";
		System.out.println(res);
		
	}
	
}
