package baekjoon.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        dp = new Long[n + 1][10];

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1L;
        }

        long result = 0;

        for (int i = 1; i <= 9; i++) {
            result += solution(n, i);
        }
        System.out.println(result % 1000000000);
    }

    static Long[][] dp;
    static long solution(int index, int val) {

        if (index == 1) {
            return dp[index][val];
        }

        if (dp[index][val] == null) {

            if (val == 0) {
                dp[index][val] = solution(index - 1, 1);
            }
            else if (val == 9) {
                dp[index][val] = solution(index - 1, 8);
            }
            else {
                dp[index][val] = solution(index - 1, val - 1) + solution(index - 1, val + 1);
            }
        }
        return dp[index][val] % 1000000000;
    }
}
