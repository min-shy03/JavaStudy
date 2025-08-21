package ch06.sec11.exam01;

public class KoreanExample {
    public static void main(String[] args) {
        // 객체 생성 시 주민등록번호와 이름 전달
        Korean k1 = new Korean("123456-1234567", "홍길동");

        // 필드값 읽기
        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);

        // final 필드는 값을 변경할 수 ㅓㅄ음
        // k1.nation = "미국";        -> 컴파일 에러 발생
        // k1.ssn = "234567-3456789" -> 컴파일 에러 발생
        
        // 비 final 필드는 값 변경 가능
        k1.name = "홍길순";
    }
}
