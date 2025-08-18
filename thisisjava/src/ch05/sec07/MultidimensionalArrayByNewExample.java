package ch05.sec07;

public class MultidimensionalArrayByNewExample {
    public static void main(String[] args) {
        // new 연산자를 이용한 다차원 배열 생성 예제
        
        // 각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
        int[][] mathScores = new int[2][3];
        
        // 배열 항목 초기값 출력
        for (int i = 0; i < mathScores.length; i++) {
            for (int j = 0; j < mathScores[i].length; j++) {
                System.out.println("mathScores[" + i + "][" + j + "] : " + mathScores[i][j]);
            }
        }
        
        // 배열 항목 값 변경
        mathScores[0][0] = 80;
        mathScores[0][1] = 90;
        mathScores[0][2] = 70;
        mathScores[1][0] = 80;
        mathScores[1][1] = 90;
        mathScores[1][2] = 70;
        
        // 전체 학생의 수학 평균 구하기
        int totalStudent = 0;
        int totalMathSum = 0;
        for (int i = 0; i < mathScores.length; i++) {
            for (int j = 0; j < mathScores[i].length; j++) {
                totalStudent += 1;
                totalMathSum += mathScores[i][j];
            }
        }
        double totalAvg = (double) totalMathSum / totalStudent;
        System.out.println("Total student: " + totalStudent);
        System.out.println("Total math sum: " + totalMathSum);
        System.out.println("Total avg: " + totalAvg);

        // 각 반의 학생 수가 다를 경우 2차원 배열 생성하는법
        int[][] englishScores = new int[2][];

        englishScores[0] = new int[3];
        englishScores[1] = new int[2];

        for (int i = 0; i < englishScores.length; i++) {
            for (int j = 0; j < englishScores[i].length; j++) {
                System.out.println("englishScores[" + i + "][" + j + "] : " + englishScores[i][j]);
            }
        }
    }
}
