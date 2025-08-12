package ch02.sec03;

public class CharExample {
	public static void main(String[] args) {
		// 문자 리터럴이 유니코드 0~65535의 숫자로 변환되어 저장되는 것을 이용한 문자열 대입
		// 문자열을 대입해도 되고 유니코드 숫자를 대입해도 됨
		
		char c1 = 'A'; 		// 문자 저장
		char c2 = 65;		// 유니코드 직접 저장
		
		char c3 = '가';		// 문자 저장
		char c4 = 44032;	// 유니코드 직접 저장
		
		// 따옴표 안에 어떠한 문자도 넣지 않으면 오류 발생함으로 공백을 넣어주어 초기화
		// char c5 = '';
		
		char c6 = ' ';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c6);
	}
}
