package infren_test;

import java.util.Scanner;

public class section8_02 {
    static int max = 0, n, w;
    static int[] arr;

    static void dfs(int t, int sum) {
        if (n == t) {
            if (sum <= w) {
                max = Math.max(max, sum);
            }
        }
        else {
            dfs(t + 1, sum + arr[t]);
            dfs(t + 1, sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        w = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        dfs(0, 0);
        System.out.println(max);
    }
}
