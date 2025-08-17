package ch04.sec05;

public class PrintFrom1To10Example {
    public static void main(String[] args) {
        // 자바에서 while 문은 파이썬과 크게 다를게 없다. 알던대로 쓰면 됨
        int i = 1;

        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
    }
}
