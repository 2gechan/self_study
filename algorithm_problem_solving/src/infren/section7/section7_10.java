package infren.section7;

import java.util.Scanner;

public class section7_10 {
    static int n, m, answer = 0;
    static int[][] arr;
    static int[] ch;
    static void dfs(int v) {
        if (v == n) answer++;
        else {
            for (int i = 1; i <= n; i++) {
                if (arr[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    dfs(i);
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n + 1][n + 1];
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x][y] = 1;
        }
        ch[1] = 1;
        dfs(1);
    }
}
