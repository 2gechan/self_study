package infren_test.section5;

import java.util.Scanner;
import java.util.Stack;

public class section5_03 {
    static int solution(int n, int[][] board, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            int p = moves[i] - 1;
            int num = 0;
            for (int j = 0; j < n; j++) {
                if (board[j][p] != 0) {
                    num = board[j][p];
                    board[j][p] = 0;
                    if (!stack.isEmpty() && stack.peek() == num) {
                        stack.pop();
                        answer += 2;
                    } else stack.push(num);
                    break;
                }
            }
        }

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
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) moves[i] = sc.nextInt();
        System.out.println(solution(n, board, m, moves));
    }
}
