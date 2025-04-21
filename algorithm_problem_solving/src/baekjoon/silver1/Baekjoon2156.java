package baekjoon.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.valueOf(br.readLine());
            // 6 10 13 9 8 1
        }
        dp = new Integer[n + 1];
        dp[0] = 0;
        dp[1] = arr[1];

        if (n > 1) dp[2] = arr[1] + arr[2];

        System.out.println(solution(n));
    }

    static Integer[] dp;
    static int[] arr;
    static int solution(int N) {

        if (dp[N] == null) {
            dp[N] = Math.max(solution(N - 1), Math.max(solution(N - 2), solution(N - 3) + arr[N - 1]) + arr[N]);
        }

        return dp[N];
    }
}
