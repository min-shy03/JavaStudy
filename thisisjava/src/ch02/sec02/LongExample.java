package ch02.sec02;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		// 컴파일러는 int로 간주하기 때문에 뒤에 L을 붙여줘야 한다. 밑 코드는 오류
		// long var3 = 100000000000;
		
		long var4 = 10000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
