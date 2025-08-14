package ch02.sec09;

public class OperationPromotionExample {
	public static void main(String[] args) {
		// 정수 리터럴이 피연산자로 오는 경우에는 컴파일러가 먼저 계산 후 나온 값을 대입
		byte result1 = 10 + 20;		// 컴파일 단계에서 연산
		System.out.println("result1: " + result1);
		
		// 변수 자체가 피연산자로 오는 경우 byte 타입의 경우,  
		// 연산 시에 자동으로 int 타입으로 변환되기 때문에 타입에 유의해야 한다. 
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2; 		// int 타입으로 변환 후 연산
		System.out.println("result2: " + result2);
		
		// long 타입이 껴있을 경우 int 타입도 long로 타입 변환된다.
		// 허용 범위가 더 큰 쪽으로 형변환된다고 생각하는게 굿
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5;		// long 타입으로 변환 후 연산
		System.out.println("result3: " + result3);
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7; 		// int 타입으로 변환 후 연산
		System.out.println("result4: " + result4);
		// int 타입인 result4를 char 타입으로 캐스팅
		System.out.println("result4: " + (char) result4);
		
		// 정수 연산의 결과는 무조건 정수 파이썬 int() 함수와 동일하다고 보면 됨
		// 밑의 예시로 치면 10/4 = 2.5지만 int(2.5) = 2 
		int v8 = 10;
		int result5 = v8 / 4; 		
		System.out.println("result5: " + result5);
		
		// 위 상황을 방지하기 위해 실수 리터럴 입력하여 double 타입으로 변수에 대입
		int v9 = 10;
		double result6 = v9 / 4.0;
		System.out.println("result6: " + result6);
		
		// int 변수를 대입하고 싶다면 연산 과정 전에 미리 실수 형태로 캐스팅
		// 이 때는 둘 중 하나만 실수 타입이여도 괜찮고 둘 다여도 상관없다.
		int v10 = 1;
		int v11 = 2;
		double result7 = (double) v10 + v11;
		System.out.println("result7: " + result7);
	}
}
