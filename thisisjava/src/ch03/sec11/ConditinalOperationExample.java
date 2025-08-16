package ch03.sec11;

public class ConditinalOperationExample {
    public static void main(String[] args) {
        // 자바의 삼항 연산자
        // A ? B : C
        // A가 참이면 B, 거짓이면 C를 선택한다.

        int score = 85;
        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
        System.out.println(score + "점은 " + grade + "등급 입니다.");
    }
}
