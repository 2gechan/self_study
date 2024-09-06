package algorithm_practice.fri.practice02;

import java.util.Scanner;
import java.util.Stack;

public class section5_03_02 {

    static int solution(int n, int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            int line = moves[i] - 1;
            for (int j = 0; j < n; j++) {
                int num = board[j][line];
                if (num != 0) {
                    board[j][line] = 0;
                    if (stack.size() > 0 && stack.peek() == num) {
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
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(solution(n, board, moves));
    }
}
/*
5
0 0 0 0 0
0 0 1 0 3
0 2 5 0 1
4 2 4 4 2
3 5 1 3 1
8
1 5 3 5 1 2 1 4
 */