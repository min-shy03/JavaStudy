package ch02.sec10;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		// 자바에서의 타입 변환 함수 문자열을 해당 타입으로 바꾸는 법
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		// 반대로 기본 리터럴을 문자열로 바꾸는법
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
	}
}
