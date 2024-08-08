package algorithm_practice.wed.practice01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
토마토(BFS 활용)
현수의 토마토 농장에서는 토마토를 보관하는 큰 창고를 가지고 있다.
창고에 보관되는 토마토들 중에는 잘 익은 것도 있지만,
아직 익지 않은 토마토들도 있을 수 있다.
보관 후 하루가 지나면,
익은 토마토들의 인접한 곳에 있는 익지 않은 토마토들은 익은 토마토의 영향을 받아 익게 된다.
하나의 토마토의 인접한 곳은 왼쪽, 오른쪽, 앞, 뒤 네 방향 에 있는 토마토를 의미한다.
대각선 방향에 있는 토마토들에게는 영향을 주지 못하며,
토마토가 혼자 저절로 익는 경우는 없다고 가정한다.
현수는 창고에 보관된 토마토들이 며칠이 지나면 다 익게 되는지, 그 최소 일수를 알고 싶어 한다.
토마토를 창고에 보관하는 격자모양의 상자들의 크기와 익은 토마토들과 익지 않은 토마토들의 정보가 주어졌을 때,
며칠이 지나면 토마토들이 모두 익는지, 그 최소 일수를 구하는 프로 그램을 작성하라.
단, 상자의 일부 칸에는 토마토가 들어있지 않을 수도 있다.
첫 줄에는 상자의 크기를 나타내는 두 정수 M, N이 주어진다.
둘째 줄부터는 하나의 상자에 저장된 토마토들의 정보가 주어진다.
즉, 둘째 줄부터 N개의 줄에는 상자에 담긴 토마토의 정보가 주어진다.
하나의 줄에는 상자 가로줄에 들어있는 토마토의 상태가 M개의 정수로 주어진다.
정수 1은 익은 토마토, 정수 0은 익지 않은 토마토, 정수 -1은 토마토가 들어있지 않은 칸을 나타낸다.
토마토가 모두 익을 ㄸ까지의 최소 날짜 출력, 만약, 저장될 때 부터 모든 토마토가 익어있는 상태이면 0을 출력
토마토가 모두 익지 못하는 상황ㅇ리면 -1을 출력
 */
public class section8_12_01 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] dis;
    static int n, m;

    static void solution(Queue<Point> q, int[][] box) {
        while (!q.isEmpty()) {
//            int len = q.size();
//            for (int i = 0; i < len; i++) {
                Point tmp = q.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = tmp.x + dx[j];
                    int ny = tmp.y + dy[j];
                    if (nx >= 0 && ny >= 0 && nx < n && ny < m && box[nx][ny] == 0) {
                        box[nx][ny] = 1;
                        q.offer(new Point(nx, ny));
                        dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                    }
//                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] box = new int[n][m];
        dis = new int[n][m];
        Queue<Point> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                box[i][j] = sc.nextInt();
                if (box[i][j] == 1) q.offer(new Point(i, j));
            }
        }
        solution(q, box);
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0) flag = false;
            }
        }
        if (flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        }
        else System.out.println(-1);

    }
}
/*
0 0 -1 0 0 0
0 0 1 0 -1 0
1 0 -1 0 0 0
0 0 0 0 -1 1
 */