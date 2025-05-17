package baekjoon.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon9465 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            arr = new int[2][n + 1];
            dp = new int[2][n + 1];
            for (int i = 0; i < 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int result = makeDy();
            sb.append(result).append("\n");
        }
        System.out.println(sb.toString());
    }
    static int[][] arr, dp;
    static int n;
    static int makeDy() {

        int answer = 0;

        dp[0][1] = arr[0][1];
        dp[1][1] = arr[1][1];

        for (int i = 2; i <= n; i++) {
            dp[0][i] = arr[0][i] + Math.max(dp[1][i - 1], dp[1][i - 2]);
            dp[1][i] = arr[1][i] + Math.max(dp[0][i - 1], dp[0][i - 2]);
        }

        answer = Math.max(dp[0][n], dp[1][n]);

        return answer;
    }
}
