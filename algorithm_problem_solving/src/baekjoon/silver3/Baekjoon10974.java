package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10974 {
    static int N;
    static int[] chk, result;
    static StringBuilder sb = new StringBuilder();
    static void dfs(int l) {
        if (l == N) {
            for (int x : result) {
                sb.append(x + " ");
            }
            sb.append("\n");
        }
        else {
            for (int i = 0; i < N; i++) {
                if (chk[i] == 0) {
                    chk[i] = 1;
                    result[l] = i + 1;
                    dfs(l + 1);
                    chk[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.valueOf(br.readLine());
        chk = new int[N];
        result = new int[N];
        dfs(0);
        System.out.println(sb.toString());
    }
}
