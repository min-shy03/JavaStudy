package ch05.sec07;

public class MultidimensionalArrayByValueListExample {
    public static void main(String[] args) {
        // 2차원 배열 생성
        int[][] scores = {
            {80, 90, 96},
            {76, 88}
        };
        
        // 배열의 길이
        System.out.println("1차원 배열의 길이 : " + scores.length);
        System.out.println("2차원 배열의 길이 : " + scores[0].length);
        System.out.println("2차원 배열의 길이 : " + scores[1].length);
        
        // 첫 번째 반의 세 번째 학생의 점수 읽기
        System.out.println("1반 3번 학생 점수 : " + scores[0][2]);

        // 첫 번째 반의 평균 점수
        int class1Sum = 0;
        for (int i = 0; i < scores[0].length; i++) {
            class1Sum += scores[0][i];
        }
        double class1Avg = (double) class1Sum / scores[0].length;
        System.out.println("1반의 평균 점수 : " + class1Avg);
    }
}
