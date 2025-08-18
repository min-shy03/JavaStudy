package ch05.sec06;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        // 배열 변수에 값을 대입할 때 미리 선언된 배열 변수의 값을 바꾸는 거나 대입하는 것은 불가능하다.
        // 만약 미리 선언해둔 배열에 값을 넣을 때는 new int[] {x,y,z} 형태로 대입해야 한다.

        // 배열 변수 선언
        int[] scores;
        
        // 배열 변수에 배열을 대입
        // scores = {10, 20, 30}    -> 불가능 컴파일 에러 발생
        scores = new int[] {10,20,30};
        
        // 배열 항목의 총합을 구하고 출력
        int sum1 = 0;
        for (int i = 0; i < scores.length; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합: " + sum1);

        // 배열을 매개값으로 주고, printItem() 메소드 호출
        printItem(new int[] {10, 20, 30});
    }
    // printItem() 메소드 선언
    public static void printItem(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("score[" + i + "]: " +  scores[i]);
        }
    }
}
