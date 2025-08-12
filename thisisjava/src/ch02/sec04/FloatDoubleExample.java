package ch02.sec04;

public class FloatDoubleExample {
	public static void main(String[] args) {
		// 정밀도 확인
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		
		System.out.println("var1: " + var1);
		// double 타입이 float 타입보다 2배정도 유효 자릿수 가짐
		System.out.println("var2: " + var2);
		
		// 10의 거듭제곱 리터럴
		double var3 = 3e6;	// 3.0 * 10의 6승
		float var4 = 3e6F;	// 3.0 * 10의 6승
		double var5 = 2e-3;	// 2.0 * 10의 -3승
		
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
	}
}
