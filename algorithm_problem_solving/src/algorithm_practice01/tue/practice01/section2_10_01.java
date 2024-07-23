package algorithm_practice01.tue.practice01;

import java.util.Scanner;

/*
봉우리
지도 정보가 N*N 격자판에 주어집니다.
각 격자에는 그 지역의 높이가 쓰여있습니다.
각 격자 판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다.
봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
격자의 가장자리는 0으로 초기화 되었다고 가정한다.
만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
 */
public class section2_10_01 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int solution(int[][] board) {
        int answer = 0;
        for (int i = 1; i < board.length - 1; i++) {
            for (int j = 1; j < board.length - 1; j++) {
                int tmp = board[i][j];
                boolean flag = true;
                for (int z = 0; z < 4; z++) {
                    int nx = i + dx[z];
                    int ny = j + dy[z];
                    if(tmp <= board[nx][ny]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n + 2][n + 2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(board));
    }
}
