package ch02.sec06;

public class TextBlockExample {
	public static void main(String[] args) {
		// 자바 13부터는 문자열을 큰 따옴표 3개로 감싸 귀찮게 이스케이프 문자나 라인피드를 할 필요 없게 해준다.
		
		// 텍스트 블록 사용하지 않고 작성한 모습. 가독성도 떨어지고 매우 불편하다.
		String str1 = "" +
		"{\n" +
		"\t\"id\":\"winter\",\n" +
		"\t\"name\":\"눈송이\"\n" +
		"}";
		
		// 텍스트 블록을 사용한 모습. 가독성도 좋고 간결하다.
		String str2 = """
		{
			"id":"winter",
			"name:"눈송이"
		
		}			
		""";
		
		System.out.println(str1);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println(str2);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		String str = """
		나는 자바를 \
		학습합니다.
		나는 자바 고수가 될 겁니다.
		""";
		
		System.out.println(str);
	}
}
