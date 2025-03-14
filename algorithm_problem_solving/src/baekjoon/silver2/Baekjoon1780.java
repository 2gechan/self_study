package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1780 {

    static int[][] board;
    static int one = 0, mOne = 0, zero = 0;

    static boolean chk(int x, int y, int size) {

        int num = board[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (board[i][j] != num) return false;
            }
        }
        return true;
    }
    static void solution(int x, int y, int n) {

        if (chk(x, y, n)) {
            if (board[x][y] == 0) zero++;
            else if (board[x][y] == 1) one++;
            else mOne++;

            return;
        }

        int divN = n / 3;

        solution(x, y, divN); // 1
        solution(x, y + divN, divN); // 2
        solution(x, y + 2 * divN, divN); // 3

        solution(x + divN, y, divN); // 4
        solution(x + divN, y + divN, divN); // 5
        solution(x + divN, y + 2 * divN, divN); // 6

        solution(x + 2 * divN, y, divN); // 7
        solution(x + 2 * divN, y + divN, divN); // 8
        solution(x + 2 * divN, y + 2 * divN, divN); // 9
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.valueOf(st.nextToken());
            }
        }
        solution(0, 0, n);
        System.out.println(mOne);
        System.out.println(zero);
        System.out.println(one);
    }
}
