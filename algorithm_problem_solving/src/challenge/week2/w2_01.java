package challenge.week2;

import java.util.Scanner;

public class w2_01 {

    static int lineCheck(int[][] board) {
        int cnt = 0;

        for (int i = 0; i < 5; i++) {
            boolean row = true, column = true;
            for (int j = 0; j < 5; j++) {
                if (board[i][j] != 0) row = false;
                if (board[j][i] != 0) column = false;
            }
            if (row) cnt++;
            if (column) cnt++;
        }

        boolean leftDownCross = true, rightDownCross = true;
        for (int i = 0; i < 5; i++) {
            if (board[i][i] != 0) leftDownCross = false;
            if (board[i][5 - i - 1] != 0) rightDownCross = false;
        }
        if (leftDownCross) cnt++;
        if (rightDownCross) cnt++;

        return cnt;
    }
    static int solution(int[][] board, int[] nums) {
        int answer = 0, index = 0;
        boolean flag = true;

        while (flag) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (board[i][j] == nums[index]) {
                        board[i][j] = 0;
                    }
                }
            }
            index++;

            // 3줄이 그어질 수 있는 최소한의 숫자 개수
            if (index > 11) {
                int lineCnt = lineCheck(board);
                if (lineCnt >= 3) {
                    flag = false;
                    answer = index;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int[] nums = new int[25];
        for (int i = 0; i < 25; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(solution(board, nums));
    }
}
