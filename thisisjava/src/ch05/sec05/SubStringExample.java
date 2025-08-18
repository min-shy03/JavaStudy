package ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {
        String ssn = "030925-0123456";
        
        /*
         substring() 함수

         1. substring(i) 로 쓰는 경우.
         문자열의 i번째 부터 끝까지 잘라서 새 문자열로 반환한다.

         2. substring(i, j) 로 쓰는 경우.
         문자열의 i번째 인덱스부터 (j-1) 번째 인덱스까지 자른다.
         */

        String firstNum = ssn.substring(0,6);
        String secondNum = ssn.substring(7);
        System.out.println(firstNum);
        System.out.println(secondNum);
    }
}
