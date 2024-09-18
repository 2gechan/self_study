package algorithm_practice.tue.practice02;

import java.util.Scanner;

public class section7_04_02 {
    static int n;
    static int[] arr;
    static int solution(int v) {
        if (v == 0 || v == 1) return arr[v] = 1;
        else {
            return arr[v] = solution(v - 1) + solution(v - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n + 1];
        solution(n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
