package infren_test.section8;

import java.util.Scanner;

public class section8_10 {
    static int[][] miro;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int cnt = 0;
    static void dfs(int x, int y) {
        if (x == 7 && y == 7) {
            cnt++;
        }
        else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && miro[nx][ny] == 0) {
                    miro[nx][ny] = 1;
                    dfs(nx, ny);
                    miro[nx][ny] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        miro = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                miro[i][j] = sc.nextInt();
            }
        }
        miro[1][1] = 1;
        dfs(1, 1);
        System.out.println(cnt);
    }
}
