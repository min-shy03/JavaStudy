package ch06.sec11.exam01;

public class Korean {
    // 한 번 선언후 값이 바뀌면 안되는 것들은 final 키워드 추가하기
    final String nation = "대한민국";
    final String ssn;
    
    // 인스턴스 필드 선언
    String name;
    
    // 생성자 선언
    public Korean(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
