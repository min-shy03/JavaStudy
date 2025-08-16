package ch03.sec04;

public class AccuracyExample {
    public static void main(String[] args) {
        // 실수는 부동 소수점 방식을 사용 해 표현하기 때문에 정확한 산술 연산을 위해서는 정수 연산을 하는 것이 낫다.

        int apple = 1;
        double Pieces = 0.1;
        int number = 7;

        double result = apple - number*Pieces;

        System.out.println("사과 남은 양 : " + result);

        System.out.println("==========================");
        int totalPieces = apple * 10;
        result = totalPieces - number;
        System.out.println("10조각에서 남은 조각 : " + result);
        System.out.println("사과 1개에서 남은 양 : " + result / 10.0);
    }
}
