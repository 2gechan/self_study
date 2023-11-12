package swea.d2;

import java.io.IOException;
import java.util.Scanner;

// 테스트 케이스는 다 통과했지만 런타임에러로 나와서 실패함
public class d2_1954 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int testCaseCount = sc.nextInt();
        sc.nextLine();
        int testCase = 0;
        while (testCase < testCaseCount) {
            int T = sc.nextInt();
            sc.nextLine();
            int[][] snail = new int[T][T];

            int minRow = 0;
            int maxRow = T - 1;
            int minCol = 0;
            int maxCol = T - 1;
            int num = 1;
            while (num <= T * T) {
                for (int i = minCol; i <= maxCol; i++) {
                    snail[minRow][i] = num;
                    num++;
                }
                minRow++;
                for (int i = minRow; i <= maxRow; i++) {
                    snail[i][maxCol] = num;
                    num++;
                }
                maxCol--;
                for (int i = maxCol; i >= minCol; i--) {
                    snail[maxRow][i] = num;
                    num++;
                }
                maxRow--;
                for (int i = maxRow; i >= minRow; i--) {
                    snail[i][minCol] = num;
                    num++;
                }
                minCol++;

            }
            testCase++;
            System.out.printf("#%d\n", testCase);
            for (int i = 0; i < T; i++) {

                for (int j = 0; j < T; j++) {
                    System.out.print(snail[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
