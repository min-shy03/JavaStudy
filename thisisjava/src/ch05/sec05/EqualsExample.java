package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        // 문자열 변수에 문자열 리터럴을 바로 대입 시 둘의 참조값은 같음
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";
        
        if (strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }
        
        if (strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

        // 문자열 변수에 new 연산자를 이용해 직접 String 객체를 생성 후 대입하면 서로 다른 객체의 번지를 가지게 됨
        // 다른 번지를 참조, == 연산 시 False
        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if (strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4는 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar4는 참조가 다름");
        }

        if (strVar3.equals(strVar4)) {
            System.out.println("strVar3과 strVar4는 문자열이 같음");
        }
    }
}
