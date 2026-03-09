package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver2839 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        // 3, 5

        int[] arr = new int[n + 1];

        int[] col = {3, 5};

        for (int i = 0; i < col.length; i++) {

            int kg = col[i];
            for (int j = col[i]; j <= n; j++) {
                int num = j - kg;

                if (j % kg == 0) arr[j] = j / kg;
                else {
                    if (arr[num] > 0 && (j - num) % kg == 0) {
                        arr[j] = arr[num] + 1;
                    }
                }
            }
        }
        System.out.println(arr[n] == 0 ? -1 : arr[n]);

    }
}
