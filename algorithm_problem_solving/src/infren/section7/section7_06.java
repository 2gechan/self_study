package infren.section7;

import java.util.Scanner;

public class section7_06 {
    static int n;
    static int[] ch;
    static void dfs(int x) {
        if (x == n + 1) {
            for (int i = 0; i < x; i++) {
                if (ch[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        else {
            ch[x] = 1;
            dfs(x + 1);
            ch[x] = 0;
            dfs(x + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ch = new int[n + 1];
        dfs(1);
    }
}
