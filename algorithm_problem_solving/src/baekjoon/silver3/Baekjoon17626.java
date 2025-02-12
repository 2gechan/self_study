package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon17626 {
    static int solution(int N) {
        int[] dp = new int[N + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1];
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - (j * j)]);
            }
            dp[i]++;
        }
        return dp[N];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());
        System.out.println(solution(N));
    }
}
