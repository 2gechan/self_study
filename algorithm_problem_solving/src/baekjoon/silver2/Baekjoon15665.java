package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon15665 {
    static int[] arr, result;
    static int n, m;
    static StringBuilder sb = new StringBuilder();
    static void solution(int l) {
        if (l == m) {
            for (int x : result) sb.append(x + " ");
            sb.append("\n");
        }
        else {
            int before = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == before) continue;
                before = arr[i];
                result[l] = arr[i];
                solution(l + 1);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.valueOf(st.nextToken());
        m = Integer.valueOf(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        result = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }
        Arrays.sort(arr);
        solution(0);
        System.out.println(sb.toString());
    }
}
