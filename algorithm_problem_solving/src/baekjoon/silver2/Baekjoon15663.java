package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon15663 {

    static int[] arr, result;
    static boolean[] visit;
    static int n, m;
    static StringBuilder sb = new StringBuilder();
    static void solution(int l) {
        if (l == m) {
            for (int x : result) {
                sb.append(x + " ");
            }
            sb.append("\n");
        }
        else {
            int before = 0;
            for (int i = 0; i < n; i++) {
                if (visit[i]) continue;

                if (before != arr[i]) {
                    visit[i] = true;
                    before = arr[i];
                    result[l] = arr[i];
                    solution(l + 1);
                    visit[i] = false;
                }

            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.valueOf(st.nextToken());
        m = Integer.valueOf(st.nextToken());
        arr = new int[n];
        result = new int[m];
        visit = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }
        Arrays.sort(arr);
        solution(0);
        System.out.println(sb.toString());
    }
}
