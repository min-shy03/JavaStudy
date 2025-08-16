package ch03.sec05;

public class InfinityAndNaNCheckExample {
    public static void main(String[] args) {
        // 나눗셈(/) 또는 나머지(%) 연산에서 좌측 피연산자가 정수이고 우측 피연산자가 0일 경우 예외가 발생한다.

        int x = 5;
        int y = 0;
        double z = 0.0;
        // double z = x / y;    // -> 오류 발생
        double q = x / z;       // -> Infinity 출력
        double r = x % z;       // -> NaN 출력

        System.out.println(q);
        System.out.println(r);

        // 이 두 결과값에는 어떤 연산을 해도 그대로 Infinity, NaN 출력
        System.out.println(q + 2);
        System.out.println(r + 2);
        
        // 나눗셈 연산 시 이 값이 Infinity, NaN인지 확인하는 법
        System.out.println(Double.isInfinite(q));
        System.out.println(Double.isNaN(r));
    }
}
