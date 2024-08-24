package challenge.week3;

import java.util.Arrays;
import java.util.Scanner;

public class w3_06 {

    static Integer[] dp;
    static int solution(int x) {

        if (dp[x] == null) {

            if (x % 6 == 0) {
                dp[x] = Math.min(Math.min(solution(x / 2), solution(x / 3)), solution(x - 1)) + 1;
            } else if (x % 3 == 0) {
                dp[x] = Math.min(solution(x / 3), solution(x - 1)) + 1;
            } else if (x % 2 == 0) {
                dp[x] = Math.min(solution(x / 2), solution(x - 1)) + 1;
            } else {
                dp[x] = solution(x - 1) + 1;
            }
        }
        return dp[x];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        dp = new Integer[X + 1];
        dp[0] = dp[1] = 0;
        System.out.println(solution(X));
    }
}
