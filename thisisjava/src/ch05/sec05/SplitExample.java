package ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

        // 문자열 분리
        // 파이썬의 split과 크게 다르지 않다. 실행 시 분리 된 문자열로 구성 된 배열을 반환한다.
        String[] tokens = board.split(",");

        // 인덱스별로 읽기
        System.out.println("번호: " + tokens[0]);
        System.out.println("제목: " + tokens[1]);
        System.out.println("내용: " + tokens[2]);
        System.out.println("성명: " + tokens[3]);
        System.out.println();

        // for 문을 활용한 읽기
        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }
}
