package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1463 {

    static Integer[] dp;
    static int solution(int n) {

        if (dp[n] == null) {

            if (n % 6 == 0) {
                dp[n] = Math.min( Math.min(solution(n / 3), solution(n / 2)), solution(n - 1)) + 1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(solution(n / 3), solution(n - 1)) + 1;
            } else if (n % 2 == 0) {
                dp[n] = Math.min(solution(n / 2), solution(n - 1)) + 1;
            }
            else {
                dp[n] = solution(n - 1) + 1;
            }

        }

        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n + 1];
        // dp[0] = dp[1] = 1;
        System.out.println(solution(n));
    }
}
