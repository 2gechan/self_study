package algorithm_practice.wed.practice02;

import java.util.Arrays;
import java.util.Scanner;

public class section3_02_02 {
    static String solution(int n, int m, int[] A, int[] B) {
        String answer = "";
        Arrays.sort(A);
        Arrays.sort(B);

        int aP = 0, bP = 0;
        while (aP < n && bP < m) {
            if (A[aP] == B[bP]) {
                answer += A[aP] + " ";
                aP++;
                bP++;
            }
            else if (A[aP] > B[bP]) bP++;
            else aP++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arrB = new int[m];
        for (int i = 0; i < m; i++) {
            arrB[i] = sc.nextInt();
        }
        System.out.println(solution(n, m, arrA, arrB));
    }
}
