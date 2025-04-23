package algorithm_practice.practice03.wed;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Position_8_12 {

    int x;
    int y;

    public Position_8_12(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class section8_03_12 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] arr, dis;
    static int m, n;

    static void solution(Queue<Position_8_12> queue) {

        while (!queue.isEmpty()) {

            Position_8_12 now = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 0) {
                    arr[nx][ny] = 1;
                    queue.offer(new Position_8_12(nx, ny));
                    dis[nx][ny] = dis[now.x][now.y] + 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt(); // 가로
        n = sc.nextInt(); // 세로
        arr = new int[n][m];
        dis = new int[n][m];

        Queue<Position_8_12> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) queue.offer(new Position_8_12(i, j));
            }
        }

        solution(queue);

        int answer = Integer.MIN_VALUE;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    flag = false;
                }
                answer = Math.max(answer, dis[i][j]);
            }
        }

        if (flag) {
            System.out.println(answer);
        }
        else System.out.println(-1);
    }
}
