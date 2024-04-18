package infren_test.section7;

import java.util.Scanner;

public class section7_02 {
    static void dfs(int n) {
        if (n == 0) return;
        else {
            int x = n / 2;
            dfs(x);
            System.out.print(n % 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dfs(n);
    }
}
