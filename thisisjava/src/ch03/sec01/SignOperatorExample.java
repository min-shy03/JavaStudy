package ch03.sec01;

public class SignOperatorExample {
	public static void main(String[] args) {
		// 부호 증감 연산자
		// - 연사자는 변수값의 부호를 변경할 때 사용된다. 
		// 이 때 정수 타입(byte, short, int)의 연산 결과는 int 값으로 반환된다.
		
		int x = -100;
		x = -x;
		System.out.println("x: " + x);
		
		// 이 때도 덧셈 연산과 같이 변수 연산 후 대입할 시 int로 변환되기 때문에 int 타입으로 선언해야 함.
		byte b = 100;
		int y = -b;
		System.out.println("y: " + y);
	}
}
