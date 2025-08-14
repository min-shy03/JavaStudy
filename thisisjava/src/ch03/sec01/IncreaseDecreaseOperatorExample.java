package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		// 증감 연산자
		int x = 10;
		int y = 10;
		int z;
			
		// x의 값을 1 증가시킴 단독으로 쓰일 때는 ++가 앞에 있건 뒤에있건 상관 없다.
		x++;
		++x;
		System.out.println("x=" + x);
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		// y의 값을 1 감소시킴 단독으로 쓰일 때는 --가 앞에 있건 뒤에있건 상관 없다.
		y--;
		--y;
		
		System.out.println("y=" + y);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		// 이 때는 대입 연산을 끝낸 후에 x의 값을 1 증가 시킴으로 z에는 원래 x 값인 12가 대입.
		z = x++;
		
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		
		// 이 때는 x의 값을 1 증가 시킨 후 그 뒷 연산 실행, 현재 x 값 (13) + 1 = 14가 대입 됨 
		z = ++x;
		
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		// 현재 x 값 (14) + 1 + 현재 y값 8 = 23이 z에 대입 됨
		// 이후 y값 1 증가
		z = ++x + y++;
		
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}
