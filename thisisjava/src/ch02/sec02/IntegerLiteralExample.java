package ch02.sec02;

public class IntegerLiteralExample {
	public static void main(String[] args) {
		
		// 각 진수별로 표현하는 방법
		int var1 = 0b1011; 	// 2진수
		int var2 = 0206;	// 8진수
		int var3 = 365;		// 10진수
		int var4 = 0xB3;	// 16진수
		
		System.out.println("2진수 : " + var1);
		System.out.println("8진수 : " + var2);
		System.out.println("10진수 : " + var3);
		System.out.println("16진수 : " + var4);
	}
}
