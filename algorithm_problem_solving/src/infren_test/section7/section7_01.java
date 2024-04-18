package infren_test.section7;

import java.util.Scanner;

public class section7_01 {
    static int n;
    static void dfs(int x) {
        if (x > n) return;
        else {
            System.out.print(x + " ");
            dfs(x + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dfs(1);
    }
}
