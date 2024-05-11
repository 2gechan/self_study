package infren_test.section8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class section8_11 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board, dis;
    static int answer = Integer.MAX_VALUE;

    static void dfs(int x, int y, int cnt) {
        if (cnt > answer) return;
        if (x == 7 && y == 7) {
            answer = Math.min(answer, cnt);
        }
        else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    dfs(nx, ny, cnt + 1);
                    board[nx][ny] = 0;
                }
            }
        }
    }

    static void bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        board[x][y] = 1;
        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        board[1][1] = 1;
        // dfs(1, 1, 0);
        // if (answer == Integer.MAX_VALUE) System.out.println(-1);
        // else System.out.println(answer);
        bfs(1, 1);
        if (board[7][7] == 0) System.out.println(-1);
        else System.out.println(board[7][7]);
    }
}
