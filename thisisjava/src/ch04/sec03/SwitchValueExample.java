package ch04.sec03;

public class SwitchValueExample {
    public static void main(String[] args) {
        String grade = "B";

        // Java 11 이전 문법
        int score1 = 0;
        switch (grade) {
            case "A":
                score1 = 100;
                break;
            case "B":
                int result = 100 - 20;
                score1 = result;
                break;
            default:
                score1 = 60;
        }
        System.out.println("score1 : " + score1);
        
        // Java 13부터 가능
        // 스위치된 값을 바로 변수에 대입 가능
        // 중괄호를 사용할 경우에는 yield 키워드로 값을 지정하면 됨
        // 단 이경우에는 무조건 default가 있어야됨. -> 변수 초기화를 위함인듯?
        int score2 = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };

        System.out.println("score2 : " + score2);
    }
}
