package ch06.sec15;

public class SingletonExample {
    public static void main(String[] args) {
        /*
        이거 오류 난다. 생성자가 private 타입이라 권한 범위 밖에서는 객체 생성 못하기 때문이다.
        Singleton obj1 = new Singleton();
         */
        
        // 정적 메소드를 호출해서 싱글톤 객체 얻음
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // 동일한 객체인지 확인
        if (obj1 == obj2) {
            System.out.println("동일한 객체입니다.");
        } else {
            System.out.println("다른 객체입니다.");
        }
    }
}
