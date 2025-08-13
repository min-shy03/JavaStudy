package ch02.sec06;

public class StringExample {

	public static void main(String[] args) {
		// 자바에서 큰 따옴표로 묶여있는 문자는 문자열이라고 부른다 이 때는 String 타입을 사용해야 한다.
		// ※ 작은 따옴표, 한 개의 문자만 있으면 Char 타입 전에 써본적 있음! 유니코드 변환되는 타입 
		
		// 문자열 내부에는 이스케이프 문자를 사용할수 있다 \t, \n 등등
		
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업 ";
		System.out.println(str);
		
		// println = 출력시 바로 줄바꿈해줌,  print = 출력후에도 줄바꿈 안함
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다.");
	}

}
