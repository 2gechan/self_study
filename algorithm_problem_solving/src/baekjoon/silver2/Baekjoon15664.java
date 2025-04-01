package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon15664 {

    static int[] arr, result;
    static int N, M;
    static StringBuilder sb = new StringBuilder();

    static void solution(int l, int index) {
        if (l == M) {
            for (int x : result) {
                sb.append(x + " ");
            }
            sb.append("\n");
        }
        else {
            int before = 0;
            for (int i = index; i < N; i++) {
                if (before == arr[i]) continue;
                result[l] = arr[i];
                before = arr[i];
                solution(l + 1, i + 1);
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
        solution(0, 0);
        System.out.println(sb.toString());
    }
}
