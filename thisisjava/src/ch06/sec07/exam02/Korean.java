package ch06.sec07.exam02;

public class Korean {
    // 필드 선언
    String nation = "대한민국";   // 한국인이면 모든 객체마다 국적이 같기 때문에 선언과 동시에 초기화

    // 그 외 이름과 주민 등록 번호는 각각 다를 수 있기 때문에 생성자에서 필드 초기화
    String name;
    String ssn;
    
    // 생성자 선언
    public Korean(String n, String s) {
        name = n;
        ssn = s;
    }
}
