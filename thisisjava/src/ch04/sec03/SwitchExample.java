package ch04.sec03;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;
        
        /*
         switch 문법
         if 문과 비슷하지만 다름. if문은 True / False로 구분하지만,
         switch 는 변수의 값에 따라 결과를 조정함.
         case (변수가 나와야 하는 값) 을 지정하여 변수의 값에 따라 흐름 조절 
         각 case 구문에는 break이 들어가야 원하는 결과를 하나만 고를수 있음.
         default는 각 case가 전부 원하는 값이 나오지 않았을 시 실행하는 if로 치면 else 같은 구문
         */
        
        switch (num) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("6");
        }
    }
}
