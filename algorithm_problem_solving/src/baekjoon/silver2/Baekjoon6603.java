package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon6603 {

    static int[] arr, result;
    static boolean[] chk;
    static int k;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int l, int index) {

        if (l == 6) {
            for (int x : result) {
                sb.append(x + " ");
            }
            sb.append("\n");
        }
        else {
            for (int i = index; i < k; i++) {
                if (!chk[i]) {
                    chk[i] = true;
                    result[l] = arr[i];
                    dfs(l + 1, i);
                    chk[i] = false;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            k = Integer.valueOf(st.nextToken());
            if (k == 0) break;

            arr = new int[k];
            for (int i = 0; i < k; i++) {
                arr[i] = Integer.valueOf(st.nextToken());
            }

            result = new int[6];
            chk = new boolean[k];

            dfs(0, 0);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
