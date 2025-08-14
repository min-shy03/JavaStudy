package ch02.sec11;

public class VariableScopeExample {
	public static void main(String[] args) {
		// 중괄호 안의 있는 변수는 그 중괄호 안에서만 사용할 수 있다
		// 파이썬으로 치면 함수 내에 지역 변수인 느낌.
		// 자바에서는 if, for문 같은 중괄호에서도 똑같이 적용된다.
		
		int v1 = 15;
		
		if (v1 > 10) {
			int v2 = v1 - 5;
			System.out.println(v2);
		}
		
		// 여기서 v2는 if문 내에서 선언된 변수이기 때문에 if 문 밖에서는 사용할 수 없다.
		// int v3 = v1 + v2 + 10;   => 컴파일 에러 발생
		
	}
}
