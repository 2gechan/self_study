package infren_test.section7;

import java.util.Scanner;

public class section7_10 {
    static int[] chk;
    static int[][] graph;
    static int count = 0;
    static int n;
    static void dfs(int p) {
        if (p == n) count++;
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[p][i] == 1 && chk[i] == 0) {
                    chk[i] = 1;
                    dfs(i);
                    chk[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        graph = new int[n + 1][n + 1];
        chk = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        chk[1] = 1;
        dfs(1);
        System.out.println(count);
    }
    /*
5 9
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5
     */
}
