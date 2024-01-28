package infren.section8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// bfs 알고리즘을 이용한 토마토 익기 유무 확인, 전역 탐색 레벨 탐색
public class section8_11 {
    static int[][] board, dis;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int m, n;

    static void bfs(Queue<Point> q) {

        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < n && ny >=0 && ny < m && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        board = new int[n][m];
        dis = new int[n][m];
        Queue<Point> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int num = sc.nextInt();
                board[i][j] = num;
                if (num == 1) q.offer(new Point(i, j));

            }
        }
        bfs(q);

        boolean flag = true;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0) flag = false;
            }
        }
        if (flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    max = Math.max(max, dis[i][j]);
                }
            }
            System.out.println(max);
        }
        else System.out.println(-1);
    }
}
