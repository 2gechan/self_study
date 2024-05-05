package infren_test.section8;

import java.util.Scanner;

public class section8_04 {
    static int n, m;
    static int[] ch;
    static void dfs(int l) {
        if (l == m) {
            for (int x : ch) System.out.print(x + " ");
            System.out.println();
        }
        else {
            for (int i = 1; i <= n; i++) {
                ch[l] = i;
                dfs(l + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ch = new int[m];
        dfs(0);
    }
}
