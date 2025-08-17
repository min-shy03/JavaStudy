package ch04.sec04;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;
        int i;

        for (i = 1; i <= 100; i++) {
            sum += i;
        }

        // for문 괄호 내에서 선언된 변수는 지역 변수 취급이기 때문에 중괄호 밖에서는 사용할 수 없다.
        // 그래서 미리 선언 후 괄호에서 초기화 시켜야 한다.
        // for문 조건식은 첫 실행 이후 증감식 이후에 실행된다.
        // 그래서 for문 마지막에 i++ 실행 후 조건식에서 걸려 101에서 끝났기 때문에 -1 해줌.
        System.out.println("i : " + (i-1) + " sum : " + sum);
    }
}
