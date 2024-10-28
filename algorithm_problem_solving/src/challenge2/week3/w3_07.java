package challenge2.week3;

import java.util.Scanner;

public class w3_07 {

    // 빨간색 C, 파란색 P, 초록색 Z, 노란색 Y
    static String[][] candy;
    static int n, answer = 0;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static void solution() {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && !(candy[nx][ny].equals(candy[i][j]))) {

                        String change1 = candy[i][j];
                        String change2 = candy[nx][ny];
                        candy[i][j] = change2;
                        candy[nx][ny] = change1;
                        int result = chk();
                        answer = Math.max(answer, result);
                        candy[i][j] = change1;
                        candy[nx][ny] = change2;
                    }
                }
            }
        }
    }

    static int chk() {

        int colResult = 0;
        int rowResult = 0;

        for (int i = 0; i < n; i++) {
            String rowBefore = candy[i][0];
            String colBefore = candy[0][i];
            int rowLen = 1;
            int colLen = 1;

            for (int j = 1; j < n; j++) {
                // row 계산
                if (rowBefore.equals(candy[i][j])) rowLen++;
                else {
                    rowResult = Math.max(rowResult, rowLen);
                    rowLen = 1;
                }

                if (colBefore.equals(candy[j][i])) colLen++;
                else {
                    colResult = Math.max(colResult, colLen);
                    colLen = 1;
                }
                rowBefore = candy[i][j];
                colBefore = candy[j][i];
            }
            rowResult = Math.max(rowResult, rowLen);
            colResult = Math.max(colResult, colLen);

        }
        return Math.max(colResult, rowResult);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        candy = new String[n][n];
        for (int i = 0; i < n; i++) {
            String[] colors = sc.nextLine().split("");
            for (int j = 0; j < n; j++) {
                candy[i][j] = colors[j];
            }
        }
        solution();
        System.out.println(answer);
    }
}
