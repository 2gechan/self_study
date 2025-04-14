package baekjoon.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pos {
    int x;
    int y;

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Baekjoon2178 {
    static int[][] miro;

    static int solution(int N, int M) {

        boolean[][] bMiro = new boolean[N][M];

        Queue<Pos> queue = new LinkedList<>();
        queue.offer(new Pos(0, 0));
        bMiro[0][0] = true;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        int level = 1;

        while (!queue.isEmpty()) {

            int len = queue.size();

            for (int i = 0; i < len; i++) {
                Pos now = queue.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = now.x + dx[j];
                    int ny = now.y + dy[j];
                    if (nx + 1 == N && ny + 1 == M) return level + 1;
                    if (nx >= 0 && nx < N && ny >= 0 && ny < M
                            && !bMiro[nx][ny] && miro[nx][ny] == 1) {
                        bMiro[nx][ny] = true;
                        queue.offer(new Pos(nx, ny));
                    }
                }
            }
            level++;
        }

        return level;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());
        miro = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                miro[i][j] = Integer.valueOf(line[j]);
            }
        }
        System.out.println(solution(N, M));
    }
}
