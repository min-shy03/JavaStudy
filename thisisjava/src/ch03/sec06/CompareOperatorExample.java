package ch03.sec06;

public class CompareOperatorExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);

        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 < char2);
        System.out.println("result4 : " + result4);

        // 비교 연산자를 실행할 때는 두 개의 연산자의 타입을 동일하게 일치시킨 후에 실행한다.
        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4);
        System.out.println("result5 : " + result5);

        // float과 double의 비교연산에서는 예외가 발생한다.
        // float과 double의 정밀도 차이로 인해 같은 소수여도 미세하게 값이 다르기 때문이다.
        // 이 경우 double 쪽을 float으로 캐스팅 후 연산하면 된다.
        float num5 = 0.1f;
        double num6 = 0.1;
        boolean result6 = (num5 == num6);
        boolean result7 = (num5 == (float) num6);
        System.out.println("result6 : " + result6);
        System.out.println("result7 : " + result7);

        // 문자열의 비교 연산의 경우 == 가아닌 equals(), !equals()를 사용한다.
        String str1 = "자바";
        String str2 = "Java";
        boolean result8 = (str1.equals(str2));
        boolean result9 = (!str1.equals(str2));
        System.out.println("result8 : " + result8);
        System.out.println("result9 : " + result9);
    }
}
