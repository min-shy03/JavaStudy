package ch05.sec05;

public class ReplaceExample {
    public static void main(String[] args) {
        // replace 함수는 해당 문자열의 앞 인자 값을 뒤 인자 값으로 변환해서 새로운 문자열로 반환한다.
        // 그 이유는 String 객체의 문자열은 변경이 불가하기 때문이다.
        // 그러기에 newStr은 새로운 생성된 객체를 참조한다.

        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String 입니다.";
        String newStr = oldStr.replace("자바", "Java");

        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
