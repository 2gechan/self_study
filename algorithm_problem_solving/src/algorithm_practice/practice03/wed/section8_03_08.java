package algorithm_practice.practice03.wed;

import java.util.Scanner;

public class section8_03_08 {
    static int[] b, p;
    static int[][] dp;
    static boolean[] visit;
    static int n, f;
    static boolean flag = false;
    static int combi(int n, int r) {
        if (dp[n][r] > 0) return dp[n][r];
        if (n == r || r == 0) return 1;
        else {
            return dp[n][r] = combi(n - 1, r) + combi(n - 1, r - 1);
        }
    }

    static void solution(int l, int sum) {
        if (flag) return;
        if (l == n) {
            if (sum == f) {
                flag = true;
                for (int x : p) {
                    System.out.print(x + " ");
                }
            }
        }
        else {
            for (int i = 0; i < n; i++) {
                if (!visit[i]) {
                    visit[i] = true;
                    p[l] = i + 1;
                    solution(l + 1, sum + (b[l] * p[l]));
                    visit[i] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        b = new int[n];
        p = new int[n];
        visit = new boolean[n];
        dp = new int[11][11];
        for (int i = 0; i < n; i++) {
            b[i] = combi(n - 1, i);
        }
        solution(0, 0);
    }
}
