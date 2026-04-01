package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver1748 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int len = 0;
        int cnt = 1;
        int base = 10;

        for (int i = 1; i <= n; i++) {

            if (i % base == 0) {
                cnt += 1;
                base *= 10;
            }
            len += cnt;
        }
        System.out.println(len);
    }
}
