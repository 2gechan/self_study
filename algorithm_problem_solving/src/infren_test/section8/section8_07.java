package infren_test.section8;

import java.util.Scanner;

public class section8_07 {
    static int[][] dy = new int[35][35];
    static int dfs(int n, int r) {
        if (dy[n][r] != 0) return dy[n][r];
        if (r == 0 || n == r) return 1;
        else {
            return dy[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(dfs(n, r));
    }
}
