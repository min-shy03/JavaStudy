package ch04.sec04;

public class PrintFrom1To10Example {
    public static void main(String[] args) {
        // 자바의 for 문의 구성
        // 1. 초기화 식, 2. 조건식 (조건식이 True일 때만 실행) , 3. 증감식
        for (int i = 1; i <= 10; i++) {
            // 반복할 코드
            System.out.print(i + " ");
        }
    }
}
