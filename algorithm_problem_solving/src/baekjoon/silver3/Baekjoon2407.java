package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Baekjoon2407 {

    static BigInteger[][] arr;
    static BigInteger solution(int n, int r) {
        if (arr[n][r] != null) return arr[n][r];
        if (n == r || r == 0) return arr[n][r] = BigInteger.ONE;
        else {
            return arr[n][r] = solution(n - 1, r - 1).add(solution(n - 1, r));
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());
        arr = new BigInteger[n + 1][m + 1];
        System.out.println(solution(n, m));
    }
}
