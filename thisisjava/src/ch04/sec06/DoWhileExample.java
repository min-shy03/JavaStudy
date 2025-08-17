package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String inputString;

        // do while문은 먼저 do 안에 있는 실행문을 실행 시키고
        // 다음 실행부터 while의 결과에 따라 실행을 할지 말지 결정한다.
        do {
            System.out.print(">");
            inputString = scanner.nextLine();
            System.out.println(inputString);
        } while (! inputString.equals("q"));
        
        System.out.println();
        System.out.println("프로그램 종료");
    }
}
