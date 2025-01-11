package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2579 {

    static int solution(int n, int[] arr) {

        /*
        한번에 한 계단 또는 두 계단
        연속된 세 개의 계단을 밟으면 안된다
        마지막 도착 계단은 반드시 밟기
                                20  dp = 75
                            10  dp = 65
                        25  dp = 55
                    15  dp = 35
                20  dp = 30
            10  dp = 10
         0
         */
        int[] dp = new int[n + 1];
        dp[1] = arr[1];
        if (n > 1) {
            dp[2] = dp[1] + arr[2];
        }
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2], arr[i - 1] + dp[i - 3]) + arr[i];
        }

        return dp[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.valueOf(br.readLine());
        }
        System.out.println(solution(n, arr));
    }
}
