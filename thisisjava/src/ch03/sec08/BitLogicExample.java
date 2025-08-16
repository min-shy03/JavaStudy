package ch03.sec08;

public class BitLogicExample {
    public static void main(String[] args) {
        // 비트 연산자도 논리 연산자와 크게 다르지는 않지만 비트 마스킹과 음수 양수 변환, 2의 보수는 꼭 알아두자.

        System.out.println("45 & 25 = " + (45 & 25));
        System.out.println("45 | 25 = " + (45 | 25));
        System.out.println("45 ^ 25 = " + (45 ^ 25));
        System.out.println("~45 = " + (~45));

        System.out.println("----------------------------");
        
        // 비트 허용 범위가 다를 경우 맞춰주는 방법 = 비트 논리 연산자를 사용하는 이유
        // 이럴 경우 원본값 찾는 방법
        int test = 136;
        byte btest = (byte) test;
        System.out.println(btest);

        byte receiveData = -120;

        // 방법 1. 비트 논리곱 연산으로 Unsigned 정수 얻기
        int unsignedInt1 = receiveData & 255;
        System.out.println(unsignedInt1);

        // 방법 2. 자바 API를 이용해서 Unsigned 정수 얻기
        int unsignedInt2 = Byte.toUnsignedInt(receiveData);
        System.out.println(unsignedInt2);


    }
}
