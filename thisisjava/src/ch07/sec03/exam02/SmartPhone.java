package ch07.sec03.exam02;

public class SmartPhone extends Phone {
    public SmartPhone(String model, String color) {
        super(model, color); // 부모 생성자에 매개변수가 포함 될 때는 때는 무조건 작성해야 함
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}
