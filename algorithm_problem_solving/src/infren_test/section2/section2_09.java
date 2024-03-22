package infren_test.section2;

import java.util.Scanner;

// 행 합, 열 합 ,양쪽 대각선 한번에 처리 가능
public class section2_09 {

    static int solution(int n, int[][] board) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += board[i][j];
            }
            answer = Math.max(answer, sum);
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += board[j][i];
            }
            answer = Math.max(answer, sum);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < i + 1; j++) {
                sum += board[i][j];
            }
        }
        answer = Math.max(answer, sum);
        sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j >= i; j--) {
                sum += board[i][j];
            }
        }
        answer = Math.max(answer, sum);
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, board));
    }
}
