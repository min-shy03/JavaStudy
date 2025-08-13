package ch02.sec08;

public class CastingExample {
	public static void main(String[] args) {
		/* 강제 타입 변환 (캐스팅) 이란?
		 * 허용 범위가 더 큰 타입의 수를 허용 범위가 더 작은 타입에 변수에 대입하는 과정이다.
		 */
		
		/* 10진수 10은 1010으로 1바이트만 있어도 표현이 가능하기 때문에 강제 타입 변환이 가능하다.
		 * 하지만 1바이트 허용 범위를 넘어서는 수 ex) 128 부터는 타입 변환이 불가능하다. 
		 */
		
		int var1 = 10;
		byte var2 = (byte) var1;
		System.out.println(var2);
		
		long var3 = 300;
		int var4 = (int) var3;
		System.out.println(var4);
		
		int var5 = 65;
		char var6 = (char) var5;
		System.out.println(var6);
		
		double var7 = 3.14;
		int var8 = (int) var7;
		System.out.println(var8);
	}

}
