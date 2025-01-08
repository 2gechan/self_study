package algorithm_practice.practice03.wed;

import java.util.Scanner;

public class section8_03_02 {

    static int C, N, answer = 0;
    static int[] arr;
    static void solution(int l, int weight) {
        if (weight > C) return;
        if (l == N) {
            answer = Math.max(answer, weight);
        }
        else {
            solution(l + 1, weight + arr[l]);
            solution(l + 1, weight);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C = sc.nextInt();
        N = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        solution(0, 0);
        System.out.println(answer);
    }
}
