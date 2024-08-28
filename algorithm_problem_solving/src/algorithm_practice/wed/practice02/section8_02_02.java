package algorithm_practice.wed.practice02;

import java.util.Scanner;

public class section8_02_02 {
    static int n, c, max = 0;
    static int[] arr;
    static void solution(int l, int sum) {
        if(sum > c) return;
        if (l == n) max = Math.max(max, sum);
        else {
            solution(l + 1, sum + arr[l]);
            solution(l + 1, sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(0, 0);
        System.out.println(max);

    }
}
