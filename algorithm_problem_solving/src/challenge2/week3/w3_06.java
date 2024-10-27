package challenge2.week3;

import java.util.Arrays;
import java.util.Scanner;

public class w3_06 {

    static String[][] room;
    static boolean[][] visit;
    static int[] ways;

    // 1 : 위, 2 : 아래, 3 : 왼쪽, 4 : 오른쪽
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[] mapping = {0, 0, 2, 3, 1};
    static int r, c, curX, curY;

    static void solution(int startX, int startY) {
        int index = 0;
        curX = startX;
        curY = startY;
        visit[curX][curY] = true;
        while (true) {
            int curWay = ways[index % 4]; // 방향 1, 2, 3, 4
            int mappingIndex = mapping[curWay]; // 방향에 맞는 dx, dy 인덱스
            int nx = curX + dx[mappingIndex];
            int ny = curY + dy[mappingIndex];
            if (nx >= 0 && nx < r && ny >= 0 && ny < c && !room[nx][ny].equals("x") && !visit[nx][ny]) {
                System.out.println("이동 : " + nx + ", " + ny);
                visit[nx][ny] = true;
                curX = nx;
                curY = ny;
            }
            else {
                int cnt = 0;
                boolean flag = false;
                for (int i = 0; i < 4; i++) {
                    int chX = curX + dx[i];
                    int chY = curY + dy[i];
                    if (chX >= 0 && chX < r && chY >= 0 && chY < c && !room[chX][chY].equals("x") && !visit[chX][chY]) {
                        // 한 곳이라도 갈 수 있다면
                        flag = true;
                        break;
                    }
                }
                if (flag) index++;
                else break;

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt(); // 세로 길
        c = sc.nextInt(); // 가로 길이
        int k = sc.nextInt(); // 장애물 개수
        room = new String[r][c];
        visit = new boolean[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                room[i][j] = "";
            }
        }
        // 장애물 위치 입력
        for (int i = 0; i < k; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            room[x][y] = "x";
        }

        int startX = sc.nextInt();
        int startY = sc.nextInt();

        ways = new int[4];
        for (int i = 0; i < 4; i++) {
            ways[i] = sc.nextInt();
        }

        solution(startX, startY);
        System.out.println(curX + " " + curY);
    }
}
