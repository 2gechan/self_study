package algorithm_practice.practice03.wed;

import java.util.Arrays;
import java.util.Scanner;

public class section3_03_02 {

    static String solution(int[] A, int[] B) {
        StringBuilder sb = new StringBuilder();

        Arrays.sort(A);
        Arrays.sort(B);
        int aIndex = 0;
        int bIndex = 0;
        while (aIndex < A.length && bIndex < B.length) {

            if (A[aIndex] == B[bIndex]) {
                sb.append(A[aIndex] + " ");
                aIndex++;
                bIndex++;
            }
            else if (A[aIndex] > B[bIndex]) bIndex++;
            else aIndex++;
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }
        System.out.println(solution(A, B));
    }
}
