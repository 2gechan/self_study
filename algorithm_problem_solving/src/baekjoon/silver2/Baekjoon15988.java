package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon15988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(br.readLine());
        long[] dp = new long[1000001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i <= 1000000; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1000000009;
        }
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int n = Integer.valueOf(br.readLine());
            sb.append(dp[n]).append("\n");
        }
        System.out.println(sb.toString());
        /*
        1
        1 1, 2
        1 1 1, 1 2, 2 1, 3
        1 3, 1 1 2, 2 2, 1 1 1 1, 1 2 1, 2 1 1, 3 1
         */
    }
}
