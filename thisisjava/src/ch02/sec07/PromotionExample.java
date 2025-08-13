package ch02.sec07;

public class PromotionExample {
	public static void main(String[] args) {
		/* 자바에서는 값의 허용 범위가 작은 타입이 더 큰 허용 범위를 가지는 타입으로 대입될 때
		 * 큰 허용 범위쪽으로 자동 타입 변환이 일어난다.
		 * 
		 * byte < short, char < int < long < float < double 순
		 * 
		 * 예외도 존재한다. 
		 * char 보다 허용 범위가 적은 byte 타입은 char 타입으로 자동 변환 될 수 없다.
		 * char 타입은 음수를 허용하지 않기 때문이다. 
		 * byte = -128 ~ 127, char = 0 ~ 65535 
		 */
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
	}
}
