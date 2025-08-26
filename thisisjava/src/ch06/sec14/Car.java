package ch06.sec14;

public class Car {
    // 필드 선언
    private int speed;
    private boolean stop;

    // speed 필드의 Getter/Setter 선언
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0 ) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    // stop 필드의 Getter/Setter 선언
    // 필드 타입이 boolean 형일 경우 is로 시작한다.
    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        if (stop) {
            this.speed = 0;
        }
    }

}
