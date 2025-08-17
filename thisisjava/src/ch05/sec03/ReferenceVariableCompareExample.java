package ch05.sec03;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        // 참조 변수의 비교

        // 배열 변수 선언
        int[] arr1;
        int[] arr2;
        int[] arr3;
        
        // 변수에 배열 객체 생성 후 대입
        arr1 = new int[] {1,2,3};
        arr2 = new int[] {1,2,3};

        // 배열 변수 arr2 값을 배열 변수 arr3에 대입
        arr3 = arr2;

        // 참조 변수에서의 == 연산은 각 피연산자의 주소를 가지고 비교하는 것이다.
        // 13번, 14번의 배열 arr1, arr2는 내용물은 같지만 서로 가지고 있는 주소값이 달라 false 값이 나온다.
        // arr3은 arr2의 주소값이 그대로 대입되어 같은 주소의 배열을 참조하기 때문에 true가 출력된다.
        System.out.println(arr1 == arr2);
        System.out.println(arr2 == arr3);
    }
}
