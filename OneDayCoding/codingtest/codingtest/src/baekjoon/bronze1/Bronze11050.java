package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bronze11050 {

    static int[][] arr;
    static int solution(int n, int k) {
        if (arr[n][k] != 0) return arr[n][k];
        if (k == 0 || n == k) return arr[n][k] = 1;
        else {
            return arr[n][k] = solution(n - 1, k) + solution(n - 1, k - 1);
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nk = br.readLine();
        StringTokenizer st = new StringTokenizer(nk);
        int n = Integer.valueOf(st.nextToken());
        int k = Integer.valueOf(st.nextToken());
        arr = new int[n + 1][k + 1];

        System.out.println(solution(n, k));
    }
}
