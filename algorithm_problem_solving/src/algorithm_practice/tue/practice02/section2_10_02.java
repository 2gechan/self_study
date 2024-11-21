package algorithm_practice.tue.practice02;

import java.util.Scanner;

// 봉우리
public class section2_10_02 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int solution(int n, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                int now = arr[i][j];
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (now < arr[nx][ny]) {
                        flag = false;
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
        int[][] arr = new int[n + 2][n + 2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n, arr));
    }
}
