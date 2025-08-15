package ch03.sec03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        // 변수의 값이 허용 범위를 벗어나면 에러가 나는게 아닌 오버플로우, 언더플로우가 발생한다.
        
        // 최댓값을 벗어나면 최솟값으로 돌아감 = 오버플로우
        byte var1 = 125;
        for (int i = 0; i < 5; i++) {
            var1++;
            System.out.println("var1 : " + var1);
        }
        
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        // 최솟값을 벗어나면 최댓값으로 돌아감 = 언더플로우
        byte var2 = -125;
        for (int i = 0; i < 5; i++) {
            var2--;
            System.out.println("var2 : " + var2);
        }
    }
}
