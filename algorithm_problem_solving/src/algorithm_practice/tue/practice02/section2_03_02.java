package algorithm_practice.tue.practice02;

import java.util.Scanner;

public class section2_03_02 {
    static String[] solution(int n, int[] A, int[] B) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            if (A[i] == 1 && B[i] == 3) answer[i] = "A";
            else if (A[i] == 2 && B[i] == 1) answer[i] = "A";
            else if (A[i] == 3 && B[i] == 2) answer[i] = "A";
            else if (A[i] == B[i]) answer[i] = "D";
            else answer[i] = "B";
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 가위 : 1, 바위 : 2, 보 : 3

        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        for (String result : solution(n, A, B)) System.out.println(result);
    }
}
