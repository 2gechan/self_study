package infren_test.section7;

import java.util.Scanner;

public class section7_06 {
    static int[] chk;
    static int n;
    static void dfs(int x) {
        if (x == n + 1) {
            for (int i = 1; i <= n; i++) {
                if (chk[i] == 1) System.out.print(i + " ");
            }
            System.out.println();
        }
        else {
            chk[x] = 1;
            dfs(x + 1);
            chk[x] = 0;
            dfs(x + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        chk = new int[n + 1];
        dfs(1);

    }
}
