package baekjoon.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1149 {


    static int[][] arr;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        arr = new int[n][3];
        dp = new int[n][3];
        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                // 0 r, 1 g, 2 b
                arr[i][j] = Integer.valueOf(st.nextToken());
            }
        }

        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        System.out.println(Math.min(solution(n - 1, 0),
                Math.min(solution(n - 1, 1), solution(n - 1, 2))));

    }


    static int solution(int n, int colorIndex) {

        if (dp[n][colorIndex] == 0) {

            // red
            if (colorIndex == 0) {
                dp[n][0] = Math.min(solution(n - 1, 1), solution(n - 1, 2)) + arr[n][0];
            }
            // green
            else if (colorIndex == 1) {
                dp[n][1] = Math.min(solution(n - 1, 0), solution(n - 1, 2)) + arr[n][1];
            }
            // blue
            else {
                dp[n][2] = Math.min(solution(n - 1, 0), solution(n - 1, 1)) + arr[n][2];
            }
        }

        return dp[n][colorIndex];
    }
}


/*
    static int n, answer = Integer.MAX_VALUE;
    static int[][] arr;

    static void solution(int before, int l, int sum) {

        if (l == n) {
            answer = Math.min(answer, sum);
        }
        else {

            for (int i = 0; i < 3; i++) {
                if (i == before) continue;
                solution(i, l + 1, sum + arr[l][i]);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.valueOf(br.readLine());
        arr = new int[n][3];

        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.valueOf(st.nextToken());
            }

        }
        solution(-1, 0, 0);
        System.out.println(answer);

    }
    */