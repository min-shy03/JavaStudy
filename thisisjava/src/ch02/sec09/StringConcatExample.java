package ch02.sec09;

public class StringConcatExample {
	public static void main(String[] args) {
		// 자바에서는 + 연산 시 피연산자 중 하나라도 문자열이 있으면 결합 연산을 실행한다.
		
		// 숫자 연산
		int result1 = 10 + 2 + 8;
		System.out.println("result1: " + result1);
		
		// 결합 연산
		// 이 경우 10 + 2를 먼저 실행 후 결과값 12 + "8"을 실행하여 "128"이 된다.
		String result2 = 10 + 2 + "8";
		System.out.println("result2: " + result2);
		
		String result3 = 10 + "2" + 8;
		System.out.println("result3: " + result3);
		
		String result4 = "10" + 2 + 8;
		System.out.println("result4: " + result4);
		
		String result5 = "10" + (2 + 8);
		System.out.println("result5: " + result5);
	}
}
