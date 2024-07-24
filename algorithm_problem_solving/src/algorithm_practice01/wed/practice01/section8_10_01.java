package algorithm_practice01.wed.practice01;

import java.util.Scanner;

/*
미로탐색(DFS)
7*7 격자판 미로를 탈출하는 경로의 가지수를 출력하는 프로그램을 작성하세요.
출발점은 격 자의 (1, 1) 좌표이고, 탈출 도착점은 (7, 7)좌표이다.
격자판의 1은 벽이고, 0은 통로이다. 격 자판의 움직임은 상하좌우로만 움직인다.
0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 0 0 0 1
1 1 0 1 1 0 0
1 0 0 0 0 0 0
 */
public class section8_10_01 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] miro;
    static int cnt = 0;

    static void solution(int x, int y) {
        if (x == 7 && y == 7) cnt++;
        else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && miro[nx][ny] == 0) {
                    miro[nx][ny] = 1;
                    solution(nx, ny);
                    miro[nx][ny] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        miro = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                miro[i][j] = sc.nextInt();
            }
        }
        miro[1][1] = 1;
        solution(1, 1);
        System.out.println(cnt);
    }
}
