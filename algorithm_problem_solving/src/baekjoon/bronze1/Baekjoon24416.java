package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon24416 {

    static int dfsCnt = 0, dpCnt = 0;
    static int[] arr;
    static int dfs(int n) {

        if (n == 1 || n == 2) {
            dfsCnt++;
            return 1;
        }
        else {
            return dfs(n - 1) + dfs(n - 2);
        }
    }

    static int dp(int n) {
        arr[1] = arr[2] = 1;
        for (int i = 3; i <= n; i++) {
            dpCnt++;
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        arr = new int[n + 1];
        dfs(n);
        dp(n);
        System.out.println(dfsCnt + " " + dpCnt);
    }
}
