package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        // indexOf() 함수
        // 인자값으로 넣은 문자열이 문자열 내에 존재하면 해당 문자열이 시작하는 인덱스 값을 반환하고,
        // 해당 문자열이 존재하지 않는다면 -1을 반환한다.
        int location = subject.indexOf("프로그래밍");
        System.out.println(location);
        String substring = subject.substring(location);
        System.out.println(substring);

        location = subject.indexOf("자바");
        if (location != -1) {
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련 없는 책이군요.");
        }

        // contains() 함수
        // 인자값으로 넣은 문자열이 문자열 내에 존재하면 true를 반환하고,
        // 해당 문자열이 존재하지 않는다면 false를 반환한다.
        boolean result = subject.contains("자바");
        if (result) {
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련 없는 책이군요.");
        }
    }
}
