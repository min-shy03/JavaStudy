package ch06.sec08.exam02;

public class ComputerExample {
    public static void main(String[] args) {
        // Computer 객체 생성
        Computer com = new Computer();
        
        // sum() 메소드 호출 시 매개 값 1, 2, 3 제공
        // 리턴 값 result1에 대입
        int result1 = com.sum(1,2,3);
        System.out.println("result1 = " + result1);

        int result2 = com.sum(1,2,3,4,5);
        System.out.println("result2 = " + result2);
        
        // 배열 객체 리터럴? 대입
        int[] values = {1, 2, 3, 4, 5};
        int result3 = com.sum(values);
        System.out.println("result3 = " + result3);
        
        // 새로운 배열 객체 생성 후 대입
        int result4 = com.sum(new int[]{1, 2, 3, 4, 5});
        System.out.println("result4 = " + result4);
    }
}
