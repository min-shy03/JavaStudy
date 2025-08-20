package ch06.sec07.exam04;

public class CarExample {
    public static void main(String[] args) {
        // 생성자 호출
        Car car1 = new Car();
        System.out.println("car1.campany : " + car1.company);
        System.out.println();
        
        Car car2 = new Car("그랜저");
        System.out.println("car2.campany : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println();
        
        Car car3 = new Car("소나타", "검정");
        System.out.println("car3.campany : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println();
        
        Car car4 = new Car("아반떼", "흰색", 200);
        System.out.println("car4.campany : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.maxSpeed : " + car4.maxSpeed);
        System.out.println();
        
    }
}
