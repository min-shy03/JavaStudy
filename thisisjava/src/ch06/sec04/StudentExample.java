package ch06.sec04;

public class StudentExample {
    public static void main(String[] args) {
        // 클래스로부터 객체를 선언하려면 객체 생성 연산자인 new 연산자 필요.
        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조한다.");

        // 똑같은 클래스로부터 또 다른 객체 생성
        Student s2 = new Student();
        System.out.println("s2 변수가 또 다른 Student 객체를 참조한다.");
    }
}
