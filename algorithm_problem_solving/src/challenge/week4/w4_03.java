package challenge.week4;

import java.util.Scanner;

public class w4_03 {

    static int[][] arr;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int n, m;

    static void solution(int x, int y) {

        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;
            if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 1) {
                arr[nx][ny] = 0;
                solution(nx, ny);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            m = sc.nextInt();
            n = sc.nextInt();
            arr = new int[n][m];
            int k = sc.nextInt();
            for (int i = 0; i < k; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                arr[y][x] = 1;
            }

            int answer = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == 1) {
                        solution(i, j);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
            T--;
        }

    }
}
