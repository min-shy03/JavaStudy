package ch06.sec07.exam03;

public class Korean {
    // 필드 선언
    String nation = "대한민국";
    String name;
    String ssn;

    // 생성자 선언
    public Korean(String name, String ssn) {
        // this = 객체 자신을 가리키는 변수, 자신의 객체에 접근할 때 사용
        // 여기선 매개변수와 필드를 구분하기 위해 사용
        this.name = name;
        this.ssn = ssn;
    }
}
