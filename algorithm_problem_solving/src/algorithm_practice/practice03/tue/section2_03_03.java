package algorithm_practice.practice03.tue;

import java.util.Scanner;

public class section2_03_03 {

    static String solution(int N, int[] A, int[] B) {
        StringBuilder sb = new StringBuilder();

        // 1 : 가위, 2 : 바위, 3 : 보
        for (int i = 0; i < N; i++) {

            if (A[i] == B[i]) sb.append("D" + "\n");
            else if (A[i] == 1 && B[i] == 3) sb.append("A" + "\n");
            else if (A[i] == 2 && B[i] == 1) sb.append("A" + "\n");
            else if (A[i] == 3 && B[i] == 2) sb.append("A" + "\n");
            else sb.append("B" + "\n");
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] =sc.nextInt();
        }
        System.out.println(solution(N, A, B));
    }
}
