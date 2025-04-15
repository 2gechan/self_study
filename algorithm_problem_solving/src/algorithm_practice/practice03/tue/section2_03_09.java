package algorithm_practice.practice03.tue;

import java.util.Scanner;

public class section2_03_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        int row = 0, col = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                row += board[i][j];
                col += board[j][i];
            }
            int cycle = Math.max(row, col);
            max = Math.max(max, cycle);
            row = 0;
            col = 0;
        }
        int lCross = 0, rCross = 0;
        for (int i = 0; i < n; i++) {
            lCross += board[i][i];
            rCross += board[i][n - i - 1];
        }
        int result = Math.max(lCross, rCross);
        max = Math.max(max, result);
        System.out.println(max);
    }
}
