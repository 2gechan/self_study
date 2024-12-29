package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1018 {

    static int N, M;
    static boolean[][] arr;

    static int find(int x, int y) {
        int maxX = x + 8;
        int maxY = y + 8;
        int count = 0;

        boolean now = arr[x][y];
        for (int i = x; i < maxX; i++) {
            for (int j = y; j < maxY; j++) {

                if (arr[i][j] != now) {
                    count++;
                }
                now = !now;
            }
            now = !now;
        }

        // W로 시작했을 때와 B로 시작했을 때를 한번에 구하는 방법은
        // 8x8판인 64개의 정사각형 개수에서 어느 색으로 시작하든 상관없이 바뀐 횟수를 빼주면
        // 반대 색으로 시작했을 때 바뀐 개수를 구할 수 있다.
        count = Math.min(count, 64 - count);
        return count;
    }
    static int solution() {
        int answer = 64;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                answer = Math.min(answer, find(i, j));
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        N = Integer.valueOf(NM[0]);
        M = Integer.valueOf(NM[1]);
        arr = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                if (line[j].equals("W")) arr[i][j] = true;
                else arr[i][j] = false;
            }
        }
        System.out.println(solution());
    }
}
