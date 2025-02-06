package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon15655 {

    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] arr, result;
    static void dfs(int l, int index) {
        if (l == M) {
            for (int x : result) sb.append(x + " ");
            sb.append("\n");
        }
        else {
            for (int i = index; i < N; i++) {
                result[l] = arr[i];
                dfs(l + 1, i + 1);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        N = Integer.valueOf(NM[0]);
        M = Integer.valueOf(NM[1]);

        result = new int[M];
        arr = new int[N];
        String[] line = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.valueOf(line[i]);
        }
        Arrays.sort(arr);
        dfs(0, 0);
        System.out.println(sb.toString());
    }
}
