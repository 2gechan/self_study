package challenge2.week2;

import java.util.Scanner;

public class w2_03 {


    static int R, C;
    static boolean[][] tmp;
    static String[][] map;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean search(int x, int y) {
        boolean result = true;

        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= R || ny < 0 || ny >= C || map[nx][ny].equals(".")) {
                cnt++;
            }
        }
        if (cnt < 3) result = false; // 3개 이상의 바다로 둘러쌓여 있지 않을 때
        return result;
    }
    static void solution() {

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if(map[i][j].equals("X")) {
                    if (search(i, j)) {
                        tmp[i][j] = false;
                    }
                }
            }
        }
        resultPrint();
    }

    static void resultPrint() {
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (tmp[i][j]) {
                    minX = Math.min(minX, i);
                    maxX = Math.max(maxX, i);
                    minY = Math.min(minY, j);
                    maxY = Math.max(maxY, j);
                }
            }
        }

        for (int i = minX; i <= maxX; i++) {
            for (int j = minY; j <= maxY; j++) {
                if (tmp[i][j]) {
                    System.out.print("X");
                }
                else System.out.print(".");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        sc.nextLine();
        map = new String[R][C];
        tmp = new boolean[R][C];
        for (int i = 0; i < R; i++) {
            String[] line = sc.nextLine().split("");
            for (int j = 0; j < C; j++) {

                if (line[j].equals("X")) {
                    tmp[i][j] = true;
                }
                map[i][j] = line[j];
            }
        }
        solution();
    }
}
