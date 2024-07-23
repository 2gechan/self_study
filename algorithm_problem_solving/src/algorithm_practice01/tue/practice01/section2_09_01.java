package algorithm_practice01.tue.practice01;

import java.util.Scanner;

/*
격자판 최대합
5*5 격자판에 숫자가 적혀있습니다.
N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 */
public class section2_09_01 {
    static int solution(int[][] arr) {
        int answer = 0;

        // 가로 세로 통합으로 구하기
        for (int i = 0; i < arr.length; i++) {
            int row = 0;
            int column = 0;
            for (int j = 0; j < arr.length; j++) {
                row += arr[i][j];
                column += arr[j][i];
            }
            int tmp = Math.max(row, column);
            answer = Math.max(answer, tmp);
        }

        int leftCross = 0, rightCross = 0;
        for (int i = 0; i < arr.length; i++) {
            leftCross += arr[i][i];
            rightCross += arr[i][arr.length - i - 1];
        }
        int tmp = Math.max(leftCross, rightCross);
        answer = Math.max(answer, tmp);

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
        System.out.println(solution(arr));
    }
}
