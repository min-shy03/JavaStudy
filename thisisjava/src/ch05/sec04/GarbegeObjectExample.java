package ch05.sec04;

public class GarbegeObjectExample {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null;   // "여행"에 해당하는 String 객체를 쓰레기로 만들어서 자바 내 Garbege Collector 가 제거하게 함.

        String kind1 = "자동차";
        String kind2 = kind1;
        kind1 = null;   // 여기서 "자동차" 객체는 kind2 변수가 참조 하고 있기 때문에 쓰레기가 되지 않음.
        System.out.println(kind2);
    }
}
