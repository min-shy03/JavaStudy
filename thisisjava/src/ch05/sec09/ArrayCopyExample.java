package ch05.sec09;

public class ArrayCopyExample {
    public static void main(String[] args) {
        // arraycopy() 함수
        // 말 그대로 배열 복사 함수다.
        
        // 길이 3인 배열
        String[] oldStrArray = {"Java", "array", "copy"};
        
        // 길이 5인 배열을 새로 생성
        String[] newStrArray = new String[5];

        // 배열 항목 복사
        // arraycopy(a,b,c,d,e) 각 인덱스 별 항목 
        // a = 원본 배열
        // b = 원본 배열의 어디서부터 복사를 시작할 건지 인덱스 값
        // c = 새 배열
        // d = 새 배열에 어디서부터 붙여넣을건지 인덱스 값
        // e = 복사 항목 수
        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
        
        // 배열 항목 출력
        for (int i = 0; i < newStrArray.length; i++) {
            System.out.println(newStrArray[i]);
        }
    }
}
