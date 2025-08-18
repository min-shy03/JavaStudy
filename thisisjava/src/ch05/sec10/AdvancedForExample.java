package ch05.sec10;

public class AdvancedForExample {
    public static void main(String[] args) {
        // 배열 내의 원소 for문으로 가져오기

        // 배열 변수 선언과 배열 생성
        int[] scores = {95, 71, 84, 93, 87};
        
        // 배열 항목 전체 합 구하기
        int sum = 0;

        // scores의 값을 int score 변수에 하나하나 담아준다. scores의 마지막 원소까지 반복
        for (int score : scores) {
            sum += score;
        }
        System.out.println(sum);

        // 배열 항목 전체 평균 구하기
        double avg = sum / scores.length;
        System.out.println(avg);
    }
}
