package ch07.sec03.exam01;

public class SmartPhone extends Phone {
    // 자식 생성자 선언
    public SmartPhone(String model, String color) {
        super(); // 생략 가능 기본적으로 자식 클래스를 생성할 때 알아서 컴파일 단계에서 생성됨
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨.");
    }
    
}
