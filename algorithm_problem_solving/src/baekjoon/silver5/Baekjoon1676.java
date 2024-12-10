package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1676 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int cnt = 0;
        while (n > 0) {
            cnt += n / 5;
            n = n / 5;
        }

        System.out.println(cnt);

    }
}
