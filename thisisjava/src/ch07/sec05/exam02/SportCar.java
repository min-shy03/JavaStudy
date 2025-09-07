package ch07.sec05.exam02;

public class SportCar extends Car{
    @Override
    public void speedUp() {
        speed += 10;
    }

    // Car 메소드의 stop 메소드가 final 메소드로 정의되었기 때문에 메소드 오버라이딩 불가
    // @Override
    // public void stop() {
    //    System.out.println("차를 멈춤");
    //    speed = 0;
    // }
}
