package algorithm_practice.thu.practice02;

import java.util.Scanner;

public class section9_01_02 {
    static int solution(int n, int[][] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    flag = false;
                    break;
                }
            }
            if (flag) answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        System.out.println(solution(n, arr));
    }
}
