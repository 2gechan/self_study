package infren_test.section8;

import java.util.Scanner;

public class section8_01 {
    static int[] arr;
    static int n, total = 0;
    static String answer = "NO";
    static void dfs(int m, int sum) {
        if (answer.equals("YES")) return;
        if (n == m) {
            if (total - sum == sum) {
                answer = "YES";
            }
        }
        else {
                dfs(m + 1, sum + arr[m]);
                dfs(m + 1, sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        dfs(0, 0);
        System.out.println(answer);
    }
}
