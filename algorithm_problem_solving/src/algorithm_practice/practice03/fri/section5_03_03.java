package algorithm_practice.practice03.fri;

import java.util.Scanner;
import java.util.Stack;

public class section5_03_03 {

    static int solution(int n, int m, int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            int catchLine = moves[i] - 1;

            int tmp = 0;
            for (int j = 0; j < n; j++) {
                if (board[j][catchLine] != 0) {
                    tmp = board[j][catchLine];
                    board[j][catchLine] = 0;
                    break;
                }
            }

            if (tmp != 0) {

                if (stack.size() > 0 && stack.peek() == tmp){
                    stack.pop();
                    answer += 2;
                } else stack.push(tmp);
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
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(solution(n, m, board, moves));
    }
}
