package ch06.sec11.exam02;

public class Earth {
    // 상수는 절대 변하지 않는 고정된 값을 가지는 변수를 뜻한다.
    // 상수는 객체마다 저장할 필요가 없고 (static 특성), 여러 개의 값을 가져도 안 된다(final 특성)
    // 상수 이름은 모두 대문자로 작성하는 것이 관례이다. 또한 여러 단어일 경우 언더바(_) 로 연결한다.

    // 상수 선언 및 초기화
    static final double EARTH_RADIUS = 6378.137;
    
    // 상수 선언
    static final double EARTH_SURFACE_AREA;
    
    // 정적 블록에서 상수 초기화
    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}
