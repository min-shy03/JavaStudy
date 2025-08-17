package ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        // 자바식 구구단
        for (int m = 2; m <= 9; m++) {
            for (int n = 1; n <= 9; n++) {
                System.out.println(m + " X " + n + " = " + m * n);
            }
        }
    }
}
