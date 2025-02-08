package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon15656 {
    static int N, M;
    static int[] arr, result;
    static StringBuilder sb = new StringBuilder();
    static void dfs(int l) {
        if (l == M) {
            for (int x : result) {
                sb.append(x + " ");
            }
            sb.append("\n");
        }
        else {
            for (int i = 0; i < N; i++) {
                result[l] = arr[i];
                dfs(l + 1);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.valueOf(st.nextToken());
        M = Integer.valueOf(st.nextToken());
        arr = new int[N];
        result = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(0);
        System.out.println(sb.toString());
    }
}
