package ch02.sec01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		
		System.out.println("x:" + x + ", y:" + y);
		
		// temp 변수에 x의 값을 미리 저장해둠
		int temp = x;
		
		// x에 y값 대입 후 y에 미리 저장해둔 x 값인 temp를 대입
		x = y;
		y = temp;
		
		System.out.println("x:" + x + ", y:" + y);
	}

}
