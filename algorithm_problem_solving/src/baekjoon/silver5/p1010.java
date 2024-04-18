package baekjoon.silver5;

import java.util.Scanner;

public class p1010 {
    static int[][] chk = new int[30][30];
    static int dfs(int n, int r) {
        if (chk[n][r] > 0) return chk[n][r];
        else if (n == r || r == 0) {
            return chk[n][r] = 1;
        }
        else {
            return chk[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(dfs(m, n));
        }
    }
}
