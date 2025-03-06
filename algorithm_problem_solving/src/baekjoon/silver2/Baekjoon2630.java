package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2630 {

    static int blue = 0, white = 0;
    static int[][] board;

    static boolean check(int row, int col, int size) {

        int color = board[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (board[i][j] != color) return false;
            }
        }

        return true;
    }

    static void solution(int row, int col, int n) {

        // 현재 파티션이 전체 같은 색인지 체크
        if (check(row, col, n)) {
            if (board[row][col] == 1) blue = blue + 1;
            else white = white + 1;
            return;
        }

        int divN = n / 2;

        // 1번 영역
        solution(row, col, divN);

        // 2번 영역
        solution(row , col + divN, divN);

        // 3번 영역
        solution(row + divN, col, divN);

        // 4번 영역
        solution(row + divN, col + divN, divN);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        board = new int[n][n];

        boolean flag = false;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.valueOf(st.nextToken());
            }
        }
        solution(0, 0, n);
        System.out.println(white);
        System.out.println(blue);
    }
}
