package algorithm_practice01.wed.practice01;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
미로의 최단거리 통로(BFS)
7*7 격자판 미로를 탈출하는 최단경로의 길이를 출력하는 프로그램을 작성하세요.
경로의 길 이는 출발점에서 도착점까지 가는데 이동한 횟수를 의미한다.
출발점은 격자의 (1, 1) 좌표이고, 탈출 도착점은 (7, 7)좌표이다. 격자판의 1은 벽이고, 0은 도로이다.
격자판의 움직임은 상하좌우로만 움직인다.
 */
class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class section8_11_01 {
    static int[][] miro = new int[7][7], tmp = new int[7][7];
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int solution(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Point p = q.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = dx[j] + p.x;
                    int ny = dy[j] + p.y;
                    if (nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && miro[nx][ny] == 0) {
                        q.offer(new Point(nx, ny));
                        miro[nx][ny] = 1;
                        tmp[nx][ny] = tmp[p.x][p.y] + 1;
                    }
                }
            }
        }

        return tmp[6][6];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                miro[i][j] = sc.nextInt();
            }
        }
        miro[0][0] = 1;
        int answer = solution(0, 0);
        if (answer == 0) System.out.println(-1);
        else System.out.println(answer);
    }
}
/*
0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 1 0 0 0
1 0 0 0 1 0 0
1 0 1 0 0 0 0
 */
