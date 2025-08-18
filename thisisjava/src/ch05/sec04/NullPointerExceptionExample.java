package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        // 참조 변수는 null 값을 가질 수도 있다.
        // 이 때 참조 변수를 사용하려하면 Exception이 발생한다.
        int[] intArray = null;
        // intArray[0] = 10;

        String str = null;
        // System.out.println(str.length());
    }
}
