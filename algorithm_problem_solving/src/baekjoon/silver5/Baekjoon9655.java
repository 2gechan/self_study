package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        /**
        if (n % 2 == 0) System.out.println("CY");
        else System.out.println("SK");
        */

        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;
        for (int i = 4; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 3]) + 1;
        }
        if (dp[n] % 2 == 1) System.out.println("SK");
        else System.out.println("CY");
    }
}
