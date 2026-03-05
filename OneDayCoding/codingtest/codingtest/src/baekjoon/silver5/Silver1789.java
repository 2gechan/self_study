package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver1789 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long num = Long.parseLong(br.readLine());

        long sum = 0;

        long cnt = 0;

        for (long i = 1; ; i++) {
            if (sum > num) break;
            sum += i;
            cnt++;
        }

        System.out.println(cnt - 1);

    }
}
