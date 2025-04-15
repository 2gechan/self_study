package baekjoon.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Pos_2667 {
    int x;
    int y;

    public Pos_2667(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Baekjoon2667 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    static int n;
    static int solution(int x, int y) {

        int answer = 0;
        Queue<Pos_2667> queue = new LinkedList<>();
        queue.offer(new Pos_2667(x, y));
        map[x][y] = 0;
        answer++;

        while (!queue.isEmpty()) {

            Pos_2667 now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && map[nx][ny] == 1) {
                    queue.offer(new Pos_2667(nx, ny));
                    map[nx][ny] = 0;
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.valueOf(br.readLine());

        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.valueOf(line[j]);
            }
        }
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    int answer = solution(i, j);
                    result.add(answer);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (int x : result) System.out.println(x);
    }
}
