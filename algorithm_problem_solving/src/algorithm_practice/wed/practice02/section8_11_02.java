package algorithm_practice.wed.practice02;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
// 미로의 최단거리 통로(BFS)
public class section8_11_02 {
    static int[][] board;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int solution() {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(0, 0));

        int[][] answer = new int[7][7];

        board[0][0] = 1;
        answer[0][0] = 0;

        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Point now = q.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = now.x + dx[j];
                    int ny = now.y + dy[j];
                    if (nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && board[nx][ny] == 0) {
                        board[nx][ny] = 1;
                        answer[nx][ny] = answer[now.x][now.y] + 1;
                        q.offer(new Point(nx, ny));
                    }
                }
            }

        }
        return answer[6][6];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution());
    }
}
