package infren_test.section7;

import java.util.Scanner;

public class section7_04 {
    static int[] arr;
    static int dfs(int n) {
        if (n == 1) {
            arr[1] = 1;
            return 1;
        } else if (n == 2) {
            arr[2] = 1;
            return 1;
        } else {
            if (arr[n] > 0) return arr[n];
            else return arr[n] = dfs(n - 1) + dfs(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n + 1];
        dfs(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
