package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Baekjoon10971 {

    static int[][] map;
    static boolean[] visit;
    static int N, answer = Integer.MAX_VALUE;

    static void solution(int l, int start, int now, int sum) {
        if (l == N) {
            if (map[now][start] != 0)
            answer = Math.min(answer, sum + map[now][start]);
        }
        else {

            for (int i = 0; i < N; i++) {
                if (!visit[i]) {
                    if (map[now][i] == 0) continue;
                    visit[i] = true;
                    solution(l + 1, start, i, sum + map[now][i]);
                    visit[i] = false;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.valueOf(br.readLine());
        map = new int[N][N];
        visit = new boolean[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.valueOf(st.nextToken());
            }
        }

        visit[0] = true;
        solution(1, 0, 0, 0);
        System.out.println(answer);
    }
}
