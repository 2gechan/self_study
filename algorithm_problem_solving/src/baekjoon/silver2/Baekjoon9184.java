package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon9184 {
    static int[][][] dp = new int[21][21][21];
    static int w(int a, int b, int c) {

        // a, b, c 가 -1보다 작은 경우 exception 발생하기 때문에 범위 체크,
        // 20보다 작은지 체크하는 이유는 a,b,c 가 20 보다 클경우 무조건 w(20,20,20) 재귀 함수를 호출하기 때문
        if (0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20 && dp[a][b][c] != 0) return dp[a][b][c];

        if (a <= 0 || b <= 0 || c <= 0) return 1;

        if (a > 20 || b > 20 || c > 20) return dp[20][20][20] = w(20, 20, 20);

        if (a < b && b < c) return dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);

        return dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.valueOf(st.nextToken());
            int b = Integer.valueOf(st.nextToken());
            int c = Integer.valueOf(st.nextToken());

            if (a == -1 && b == -1 && c == -1) break;
            int result = w(a, b, c);

            sb.append("w(" + a + ", " + b + ", " + c + ") = " + result).append("\n");

        }
        System.out.println(sb.toString());
    }
}
