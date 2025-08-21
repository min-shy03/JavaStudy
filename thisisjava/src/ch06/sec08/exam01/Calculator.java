package ch06.sec08.exam01;

public class Calculator {
    // 리턴값이 없는 메소드 선언
    // 함수 이름 앞에 void 명시
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    // 리턴 값이 있는 메소드 선언
    // 리턴할 값의 타입을 함수 이름 앞에 명시
    int plus(int a, int b) {
        int result = a + b;
        // 리턴문으로 리턴값 지정 반드시 필요
        return result;
    }
    
    double divide(int a, int b) {
        double result = (double) a / b;
        return result;
    }
}
