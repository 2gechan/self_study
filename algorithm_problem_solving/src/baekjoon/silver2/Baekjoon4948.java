package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon4948 {

    static boolean[] arr;
    static void get_prime() {

        for (int i = 2; i < Math.sqrt(arr.length); i++) {
            if (arr[i]) continue;

            for (int j = i; j < arr.length; j += i) {
                arr[j] = true;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.valueOf(br.readLine());
            if (n == 0) break;
            arr = new boolean[2 * n + 1];
            int cnt = 0;

            get_prime();

            for (int i = n + 1; i <= 2 * n; i++) {
                if (!arr[i]) cnt++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb.toString());
    }
}
