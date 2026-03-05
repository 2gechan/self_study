package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.valueOf(br.readLine());
        while (t-- > 0) {
            int k = Integer.valueOf(br.readLine());
            int n = Integer.valueOf(br.readLine());

            int[][] arr = new int[k + 1][n + 1];

            // 1호 주민은 자기 호수만큼만 살면 된다
            for (int i = 0; i <= k; i++) {
                arr[i][1] = 1;
            }

            // 1층 주민은 자기 호수만큼만 살면 된다
            for (int i = 1; i <= n; i++) {
                arr[0][i] = i;
            }


            for (int i = 1; i <= k; i++) {
                // 층

                for (int j = 2; j <= n; j++) {
                    // 호
                    arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
                }
            }

            System.out.println(arr[k][n]);

        }
    }
}
