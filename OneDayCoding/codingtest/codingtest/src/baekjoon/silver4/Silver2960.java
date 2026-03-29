package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver2960 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[n + 1];
        Arrays.fill(arr, true);
        int cnt = 0;
        boolean flag = false;
        int result = 0;

        for (int i = 2; i <= n; i++) {

            if (arr[i]) {
                for (int j = i; j <= n; j += i) {
                    if (arr[j]) {
                        arr[j] = false;
                        cnt++;
                        if (cnt == k) {
                            result = j;
                            flag = true;
                            break;
                        }
                    }

                }
            }
            if (flag) break;
        }

        System.out.println(result);

    }
    // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
    // 2 4 6 8 10 12 14
    // 3 6 9
}
