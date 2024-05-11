package infren_test.section8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class section8_12 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int m, n, day = -1;
    static int[][] box;
    static Queue<Point> q = new LinkedList<>();
    static void bfs() {
        while (!q.isEmpty()) {
            day++;
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Point tmp = q.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = tmp.x + dx[j];
                    int ny = tmp.y + dy[j];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && box[nx][ny] == 0) {
                        box[nx][ny] = 1;
                        q.offer(new Point(nx, ny));
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        box = new int[n][m];
        q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int t = sc.nextInt();
                if (t == 1) q.offer(new Point(i, j));
                box[i][j] = t;
            }
        }
        bfs();
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println(day);
        }
        else System.out.println(-1);
    }
}
