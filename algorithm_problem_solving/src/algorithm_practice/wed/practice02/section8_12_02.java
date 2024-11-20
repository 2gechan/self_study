package algorithm_practice.wed.practice02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



// 토마토(BFS)
public class section8_12_02 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int[][] box;
    static int solution(int m, int n, Queue<Point> q) {

        int cnt = -1;
        while (!q.isEmpty()) {
            int len = q.size();
            cnt++;
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

        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0) {
                    cnt = -1;
                    flag = true;
                    break;
                }
            }
            if (flag) break;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        box = new int[n][m];
        Queue<Point> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int yn = sc.nextInt();
                box[i][j] = yn;
                if (yn == 1) q.offer(new Point(i, j));
            }
        }
        System.out.println(solution(m, n, q));
    }
}
