package ch04.sec04;

public class FloatCounterExample {
    public static void main(String[] args) {
        // for 문 사용 시 유의사항
        // 초기화식에서 부동 소수점을 쓰는 float 타입을 사용하지 말아야 한다.
        // 밑 for문은 이론상 10번 돌아야하지만 실제로 실행시 0.1을 정확히 표현할 수 없는 실수 특성상
        // 9번만 반복후 종료하게 된다.
        for (float x=0.1f; x <= 1.0f; x+=0.1f ) {
            System.out.println(x);
        }
    }
}
