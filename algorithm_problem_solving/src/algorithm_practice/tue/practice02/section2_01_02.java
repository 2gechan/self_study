package algorithm_practice.tue.practice02;

import java.util.Scanner;

public class section2_01_02 {
    static void solution(int[] arr, int n) {
        int prev = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (i == 0 || arr[i] > prev) System.out.print(arr[i] + " ");
            prev = arr[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr, n);
    }
}
