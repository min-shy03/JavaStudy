package ch04.sec03;

public class SwitchCharExample {
    public static void main(String[] args) {
        char grade = 'B';

        // switch 문 괄호에는 정수형 타입과 문자열 타입 변수를 사용할 수 있다.
        // case에 break이 없으면 다음 타입으로 넘어가는 것을 이용해서 대소문자 관계없이 처리하는 방법
        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("우수 회원입니다.");
                break;
            case 'B':
            case 'b':
                System.out.println("일반 회원입니다.");
                break;
            default:
                System.out.println("손님입니다.");
        }
    }
}
