package baekjoon.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Baekjoon2468 {

    static int n;
    static int[][] arr;
    static boolean[][] visit;


    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static void solution(int x, int y, int maxHeight) {

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n
            && arr[nx][ny] > maxHeight && !visit[nx][ny]) {
                visit[nx][ny] = true;
                solution(nx, ny, maxHeight);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        StringTokenizer st;
        int maxHeight = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight, arr[i][j]);
            }
        }

        int answer = 0;
        for (int height = 0; height < maxHeight + 1; height++) {
            visit = new boolean[n][n];
            int cnt = 0;
            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {
                    if (!visit[i][j] && arr[i][j] > height) {
                        cnt++;
                        visit[i][j] = true;
                        solution(i, j, height);
                    }
                }
            }
            answer = Math.max(answer, cnt);
        }
        System.out.println(answer);



    }
}
