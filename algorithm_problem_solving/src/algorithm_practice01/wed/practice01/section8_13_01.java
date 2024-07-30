package algorithm_practice01.wed.practice01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
섬나라 아일랜드
N*N의 섬나라 아일랜드의 지도가 격자판의 정보로 주어집니다.
각 섬은 1로 표시되어 상하좌우와 대각선으로 연결되어 있으며, 0은 바다입니다.
섬나라 아일랜드에 몇 개의 섬이 있는지 구하는 프로그램을 작성하세요.
 */
public class section8_13_01 {
    static int n;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int solution(int[][] board) {
        int answer = 0;
        Queue<Point> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    q.offer(new Point(i, j));
                    board[i][j] = 0;
                    while (!q.isEmpty()) {
                        Point tmp = q.poll();
                        for (int z = 0; z < 8; z++) {
                            int nx = tmp.x + dx[z];
                            int ny = tmp.y + dy[z];
                            if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                                q.offer(new Point(nx, ny));
                                board[nx][ny] = 0;
                            }
                        }
                    }
                    answer++;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(board));
    }
}
