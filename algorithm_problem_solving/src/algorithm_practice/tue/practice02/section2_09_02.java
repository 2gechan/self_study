package algorithm_practice.tue.practice02;

import java.util.Map;
import java.util.Scanner;

// 격자판 최대합
public class section2_09_02 {

    static int solution(int n, int[][] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int row = 0;
            int col = 0;
            for (int j = 0; j < n; j++) {
                row += arr[i][j];
                col += arr[j][i];
            }
            answer = Math.max(answer, Math.max(row, col));
        }

        int leftDown = 0;
        int rightDown = 0;
        for (int i = 0; i < n; i++) {
            leftDown += arr[i][i];
            rightDown += arr[i][n - 1 - i];
        }
        answer = Math.max(answer, Math.max(leftDown, rightDown));

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }
}
