package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon4963 {

    static int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
    static int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};
    static int w, h;
    static int[][] arr;

    static void search(int x, int y) {

        for (int i = 0; i < 8; i++) {

            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < h && nx >= 0
                    && ny < w && ny >= 0
                    && arr[nx][ny] == 1) {
                arr[nx][ny] = 0;
                search(nx, ny);
            }
        }
    }
    static int solution(int w, int h, int[][] arr) {
        int answer = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (arr[i][j] == 1) {
                    arr[i][j] = 0;
                    answer++;
                    search(i, j);
                }
            }
        }

        return answer;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.valueOf(st.nextToken());
            h = Integer.valueOf(st.nextToken());
            if (w == 0 && h == 0) break;
            arr = new int[h][w];
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    arr[i][j] = Integer.valueOf(st.nextToken());
                }
            }
            sb.append(solution(w, h, arr)).append("\n");
        }
        System.out.println(sb.toString());
    }
}
