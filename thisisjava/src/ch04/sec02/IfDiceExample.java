package ch04.sec02;

public class IfDiceExample {
    public static void main(String[] args) {
        // 자바에서 1 ~ 6 까지 원하는 랜덤 값을 뽑는 방법
        // 파이썬으로 치면 randint(1,6)
        // Math.random() 함수는 0.0 ~ 1.0 까지 랜덤한 double 타입 난수를 반환한다.
        int ran_num = (int) (Math.random() * 6) + 1;

        if (ran_num == 1) {
            System.out.println("You are 1 dice");
        } else if (ran_num == 2) {
            System.out.println("You are 2 dice");
        } else if (ran_num == 3) {
            System.out.println("You are 3 dice");
        } else if (ran_num == 4) {
            System.out.println("You are 4 dice");
        } else if (ran_num == 5) {
            System.out.println("You are 5 dice");
        } else {
            System.out.println("You are 6 dice");
        }
    }
}
