package ch04.sec03;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = (int) (Math.random() * 4) + 8;
        System.out.println("현재 시간 : " + time + "시");

        // 만일 switch 문법을 쓰는데 case마다 break이 없다면 해당 case 종료 후,
        // case 값과 상관없이 다음 case문을 계속 실행한다.
        switch (time) {
            case 8:
                System.out.println("출근을 합니다.");
            case 9:
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            default:
                System.out.println("외근을 나갑니다.");
        }
    }
}
