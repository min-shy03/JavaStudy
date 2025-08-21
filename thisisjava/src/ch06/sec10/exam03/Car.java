package ch06.sec10.exam03;

public class Car {
    // 인스턴스 필드 선언
    int speed;

    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    // 정적 메소드와 정적 블록은 객체가 없어도 실행된다는 특징 때문에 인스턴스 필드나 인스턴스 메소드를 사용할 수 없다.
    // 또한 this도 사용할 수 없다.
    // 인스턴스 멤버를 사용하기 위해서는 객체를 생성한 후에 사용해야 한다.
    static void simulate() {
        // 객체 생성
        Car myCar = new Car();
        // 인스턴스 멤버 사용
        myCar.speed = 200;
        myCar.run();
    }

    // main 메소드 또한 정적 메소드기 때문에 인스턴스 멤버를 사용하기 위해선 객체부터 생성해야 한다.
    public static void main(String[] args) {
        // 정적 메소드 호출
        simulate();

        // 객체 생성
        Car myCar = new Car();
        // 인스턴스 멤버 사용
        myCar.speed = 60;
        myCar.run();
    }
}
