package infren_test.section2;

import java.util.Scanner;

public class section2_10 {
    static int solution(int n, int[][] arr) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[i][j] > arr[i - 1][j]
                        && arr[i][j] > arr[i][j - 1]
                        && arr[i][j] > arr[i][j + 1]
                        && arr[i][j] > arr[i + 1][j]) {
                    answer++;
                }
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
