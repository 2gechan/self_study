package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze24416 {

    static int dfsCnt = 0;
    static int dpCnt = 0;
    static int dfs(int n) {

        if (n == 1 || n == 2) {
            dfsCnt++;
            return 1;
        } else return dfs(n - 1) + dfs(n - 2);

    }

    static void dp(int n) {
        int[] dp = new int[n + 1];
        dp[1] = dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
            dpCnt++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine());
        dfs(n);
        dp(n);
        System.out.println(dfsCnt + " " + dpCnt);
    }
}
