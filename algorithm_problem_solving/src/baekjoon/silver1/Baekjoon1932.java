package baekjoon.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1932 {

    static int n;
    static int[][] arr;
    static Integer[][] dp;

    static int solution(int l, int index) {

        if (l == n - 1) return dp[l][index];

        if (dp[l][index] == null) {
            dp[l][index] = Math.max(solution(l + 1, index), solution(l + 1, index + 1)) + arr[l][index];
        }

        return dp[l][index];

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.valueOf(br.readLine());

        arr = new int[n][n];
        dp = new Integer[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = Integer.valueOf(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            dp[n - 1][i] = arr[n - 1][i];
        }

        System.out.println(solution(0, 0));
    }
}
