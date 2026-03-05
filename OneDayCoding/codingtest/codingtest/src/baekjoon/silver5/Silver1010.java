package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver1010 {

    static int[][] arr = new int[30][30];

    static int dfs(int n, int r) {

        if (arr[n][r] > 0) return arr[n][r];

        if (n == r || r == 0) return arr[n][r] = 1;

        return arr[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            sb.append(dfs(m, n)).append("\n");
        }

        System.out.println(sb.toString());

    }
}
