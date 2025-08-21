package ch06.sec12.hyundai;

import ch06.sec12.hankook.SnowTire;
import ch06.sec12.kumho.AllSeasonTire;

public class Car {
    // 부품 필드 선언
    // 클래스의 전체 이름(패키지 경로를 포함한)을 사용해서 선언 시 import 필요없음
    ch06.sec12.hankook.Tire tire1 = new ch06.sec12.hankook.Tire();
    ch06.sec12.kumho.Tire tire2 = new ch06.sec12.kumho.Tire();

    // 그 외엔 import를 통해 어느 패키지의 클래스인지 명시 후 객체 생성
    SnowTire tire3 = new SnowTire();
    AllSeasonTire tire4 = new AllSeasonTire();

}
