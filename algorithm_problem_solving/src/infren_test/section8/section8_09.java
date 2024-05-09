package infren_test.section8;

import java.util.Scanner;

public class section8_09 {
    static int n, m;
    static int[] result, ch;

    static void dfs(int l, int prev) {
        if (l == m) {
            for (int x : result) System.out.print(x + " ");
            System.out.println();
        }
        else {
            for (int i = prev; i <= n; i++) {
                result[l] = i;
                dfs(l + 1, i + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ch = new int[n];
        result = new int[m];
        dfs(0, 1);
    }
}
