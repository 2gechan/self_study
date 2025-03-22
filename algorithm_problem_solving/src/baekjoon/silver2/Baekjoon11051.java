package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon11051 {
    static int[][] dp;

    static int solution(int n, int r) {
        if (dp[n][r] > 0) return dp[n][r];

        if (n == r || r == 0) return dp[n][r] = 1;

        return dp[n][r] = (solution(n - 1, r - 1) + solution(n - 1, r)) % 10007;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int K = Integer.valueOf(st.nextToken());
        dp = new int[N + 1][K + 1];
        System.out.println(solution(N, K));
    }
}
