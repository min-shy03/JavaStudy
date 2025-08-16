package ch03.sec07;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        /*
            논리 연산자의 종류
            and == &&, &
            or  == ||, |
            xor == ^
            not == !
            이 때 &보다 &&, |보다 ||가 성능이 좋다.
            &&, ||의 경우 한 쪽 조건이 만족되지 않을 경우 다른 조건은 보지 않기 때문에 효율성인 측면에서 좋다.
         */

        // int charCode = 'A';
        // int charCode = 'a';
        int charCode = '5';
        
        // and 연산자
        if ( (65 <= charCode) & (charCode <= 90)) {
            System.out.println("대문자입니당.");
        }

        if ( (97 <= charCode) && (charCode <= 122)) {
            System.out.println("소문자입니당.");
        }

        if ( (48<= charCode) & (charCode <= 57)) {
            System.out.println("0~9 숫자입니당.");
        }

        // ------------------------------------

        int value = 6;
        // int value = 7;
        
        // or 연산자
        if ( (value%2 == 0 ) | (value%3 == 0) ) {
            System.out.println("2 또는 3의 배수입니당.");
        }
        
        
    }
}
