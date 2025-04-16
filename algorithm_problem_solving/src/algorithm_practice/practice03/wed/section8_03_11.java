package algorithm_practice.practice03.wed;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pos {
    int x;
    int y;

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class section8_03_11 {

    static int solution(int[][] board) {
        int answer = Integer.MAX_VALUE;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        Queue<Pos> queue = new LinkedList<>();
        queue.offer(new Pos(0, 0));
        board[0][0] = 1;

        int level = 0;
        while (!queue.isEmpty()) {

            int len = queue.size();

            for (int i = 0; i < len; i++) {
                Pos now = queue.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = now.x + dx[j];
                    int ny = now.y + dy[j];
                    if (nx == 6 && ny == 6 ) return answer = level + 1;
                    if (nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && board[nx][ny] == 0) {
                        board[nx][ny] = 1;
                        queue.offer(new Pos(nx, ny));
                    }
                }

            }

            level++;

        }

        if (answer == Integer.MAX_VALUE) return -1;

        return level;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(board));
    }
}
