package algorithm_practice.fri.practice01;

import java.util.Scanner;
import java.util.Stack;

/*
크레인 인형뽑기
게임 화면은 1 x 1 크기의 칸들로 이루어진 N x N 크기의 정사각 격자이며
위쪽에는 크레인 이 있고 오른쪽에는 바구니가 있습니다.
각 격자 칸에 는 다양한 인형이 들어 있으며 인형이 없는 칸은 빈칸입니다.
모든 인형은 1 x 1 크기의 격자 한 칸을 차지하며 격자의 가장 아래 칸부터 차곡차곡 쌓여 있습니다.
게임 사용자는 크레인을 좌우로 움직여서 멈춘 위치에서 가장 위에 있는 인형을 집어 올릴 수 있습니다.
집어 올린 인형은 바구니에 쌓이게 되는데,
이때 바구니의 가장 아래 칸부터 인형이 순서대로 쌓이게 됩니다.
만약 같은 모양의 인형 두 개가 바구니에 연속해서 쌓이게 되면
두 인형은 터뜨려지면서 바구니에서 사라지게 됩니다.
크레인 작동 시 인형이 집어지지 않는 경우는 없으나
만약 인형이 없는 곳에서 크레인을 작동 시키는 경우에는 아무런 일도 일어나지 않습니다.
또한 바구니는 모든 인형이 들어갈 수 있을 만큼 충분히 크다고 가정합니다.
임 화면의 격자의 상태가 담긴 2차원 배열 board와
인형을 집기 위해 크레인을 작동시킨 위 치가 담긴 배열 moves가 매개변수로 주어질 때,
크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 구하는 프로그램을 작성하세요.
board의 각 칸에는 0 이상 100 이하인 정수가 담겨있습니다. 0은 빈 칸을 나타냅니다.
1 ~ 100의 각 숫자는 각기 다른 인형의 모양을 의미하며 같은 숫자는 같은 모양의 인형을 나타냅니다.
5
0 0 0 0 0
0 0 1 0 3
0 2 5 0 1
4 2 4 4 2
3 5 1 3 1
8
1 5 3 5 1 2 1 4
 */
public class section5_03_01 {
    static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            int m = moves[i];
            for (int j = 0; j < board.length; j++) {
                if (board[j][m] != 0) {
                    if (!stack.isEmpty() && stack.peek() == board[j][m]) {
                        stack.pop();
                        answer += 2;
                    } else stack.push(board[j][m]);
                    board[j][m] = 0;
                    break;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(solution(board, moves));
    }
}
