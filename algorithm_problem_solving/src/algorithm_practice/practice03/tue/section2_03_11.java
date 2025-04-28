package algorithm_practice.practice03.tue;

import java.util.Scanner;

public class section2_03_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[] result = new int[n];
        for (int i = 0; i < 5; i++) { // 학년
            for (int j = 0; j < n; j++) { // 기준 학생
                for (int k = 0; k < n; k++) { // 비교 대상
                    if (j == k) continue;
                    if (arr[j][i] == arr[k][i]) {
                        result[j]++;
                        break;
                    }
                }
            }

        }
        for (int x : result) {
            System.out.println(x);
        }
    }
}
