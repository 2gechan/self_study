package challenge2.week2;

import java.util.Scanner;

public class w2_02 {

    static int C, R, K, cx, cy, cnt;
    static boolean[][] visit;

    static boolean move(int nx, int ny, int flag) {
        boolean result = true;

        if (flag == 1) { // 위쪽
            int i;
            for (i = nx; i < R; i++) {
                if (visit[i][ny]) break;
                cnt++;
                visit[i][ny] = true;
                if (cnt == K) {
                    cx = i;
                    cy = ny;
                    return false;
                }
            }
            cx = --i;
            cy = ++ny;
        } else if (flag == 2) { // 오른쪽
            int i;
            for (i = ny; i < C; i++) {
                if (visit[nx][i]) break;
                cnt++;
                visit[nx][i] = true;
                if (cnt == K) {
                    cx = nx;
                    cy = i;
                    return false;
                }

            }
            cx = --nx;
            cy = --i;
        } else if (flag == 3) { // 아래쪽
            int i;
            for (i = nx; i >= 0; i--) {
                if (visit[i][ny]) break;
                cnt++;
                visit[i][ny] = true;
                if (cnt == K) {
                    cx = i;
                    cy = ny;
                    return false;
                }
            }
            cx = ++i;
            cy = --ny;
        } else { // 왼쪽
            int i;
            for (i = ny; i >= 0; i--) {
                if (visit[nx][i]) break;
                cnt++;
                visit[nx][i] = true;
                if (cnt == K) {
                    cx = nx;
                    cy = i;
                    return false;
                }
            }
            cx = ++nx;
            cy = ++i;
        }
        return result;
    }

    static void solution() {

        if (C * R < K) {
            System.out.println(0);
            return;
        }
        cx = 0;
        cy = 0;
        int flag = 1;

        while (move(cx, cy, flag)) {
            flag++;
            if (flag == 5) flag = 1;
        }
        cx++;
        cy++;
        System.out.println(cy + " " + cx);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C = sc.nextInt(); // 가로
        R = sc.nextInt(); // 세로
        K = sc.nextInt(); // 대기 순서 K번째 관객
        visit = new boolean[R][C];

        solution();
    }
}
