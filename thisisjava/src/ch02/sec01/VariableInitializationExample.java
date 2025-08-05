package ch02.sec01;

public class VariableInitializationExample {
	public static void main(String[] args) {
		// 변수 value 선언
		int value;
		
		/* 연산 결과를 변수 result의 초기값으로 대입 
		 *  이때 value는 초기값을 주지 않아 초기화가 되지 않았음으로 오류 발생
		 */
		
		// int result = value + 10;
		
		// 변수 초기화
		value = 10;
		
		// 변수 선언과 동시에 초기화
		int result = value + 10;
		
		System.out.println(result);
	}
}
