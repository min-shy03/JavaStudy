package ch03.sec02;

public class ArithmaticOperatorExample {
	public static void main(String[] args) {
		/* 산술 연산의 특징
		 * 1. 피연산자가 정수 타입이면 연산의 결과는 int 타입이다.
		 * 2. 피연산자가 정수 타입이고, 그 중 하나가 long 타입이면 연산의 결과는 long 타입이다.
		 * 3. 피연산자 중 하나가 실수 타입이면 연산의 결과는 실수 타입이다.
		 */
		
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		// 모든 피연산자는 int 타입으로 자동 변환 후 연산
		int result1 = v1 + v2; 
		System.out.println("result1: " + result1);
		
		// 모든 피연산자는 long 타입으로 자동 변환 후 연산
		long result2 = v1 + v2 - v4;
		System.out.println("result2: " + result2);
		
		// double 타입으로 캐스팅(강제 변환) 후 연산
		double result3 = (double) v1 / v2;
		System.out.println("result3: " + result3);
		
		int result4 = v1 % v2;
		System.out.println("result4: " + result4);
	}
}
