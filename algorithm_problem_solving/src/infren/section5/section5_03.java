package infren.section5;

import java.util.*;

// stack을 이용한 뽑기 게임
public class section5_03 {
    static int solution(int n, int k, int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < k; i++) {
            int line = moves[i];
            int index = 0;
            int num = 0;
            while (index < n) {
                if (board[index][line - 1] != 0) {
                    num = board[index][line - 1];
                    board[index][line-1] = 0;
                    break;
                }
                index++;
            }
            if (num == 0) continue;
            if (stack.isEmpty()) {
                stack.push(num);
            } else {
                if (stack.peek(기) == num) {
                    stack.pop();
                    count += 2;
                } else {
                    stack.push(num);
                }
            }
        }
        return count;
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
        int k = sc.nextInt();
        int[] moves = new int[k];
        for (int i = 0; i < k; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, board, moves));
    }
}
