package algorithm_practice.practice03.wed;

import java.util.Arrays;
import java.util.Scanner;

public class section8_03_10 {

    static int[][] arr;
    static boolean[][] chk;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int answer = 0;
    static void solution(int x, int y) {

        if (x == 6 && y == 6) {
            answer++;
        }
        else {

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && arr[nx][ny] == 0) {
                    arr[nx][ny] = 1;
                    solution(nx, ny);
                    arr[nx][ny] = 0;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        arr[0][0] = 1;
        solution(0, 0);
        System.out.println(answer);
    }
}
