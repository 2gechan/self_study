package infren_test.section7;

import java.util.Scanner;

public class section7_03 {
    static int dfs(int n) {
        if (n == 1) return 1;
        else {
            return n * dfs(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(dfs(n));
    }
}
