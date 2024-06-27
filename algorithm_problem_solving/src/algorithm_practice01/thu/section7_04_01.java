package algorithm_practice01.thu;

import java.util.Scanner;

public class section7_04_01 {
    static int[] arr;

    static void solution(int v, int n) {
        if (v == n + 1) return;

        if (v == 1 || v == 2) {
            arr[v] = 1;
            solution(v + 1, n);
        }
        else {
            arr[v] = arr[v - 1] + arr[v - 2];
            solution(v + 1, n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n + 1];
        solution(1, n);
        for (int i = 1; i <= n; i++) System.out.print(arr[i] + " ");
    }
}
