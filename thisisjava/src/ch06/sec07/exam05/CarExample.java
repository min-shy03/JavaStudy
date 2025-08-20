package ch06.sec07.exam05;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car("그랜저");
        System.out.println("car1.model : " + car1.model);
        System.out.println("car1.color : " + car1.color);
        System.out.println("car1.maxSpeed : " + car1.maxSpeed);
        System.out.println();

        Car car2 = new Car("소나타", "검정");
        System.out.println("car2.model : " + car2.model);
        System.out.println("car2.color : " + car2.color);
        System.out.println("car2.maxSpeed : " + car2.maxSpeed);
        System.out.println();

        Car car3 = new Car("아반떼", "흰색", 200);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println("car3.maxSpeed : " + car3.maxSpeed);
    }
}
