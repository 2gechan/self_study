package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon9020 {

    static boolean[] prime = new boolean[10001];

    static void make_prime() {
        prime[0] = prime[1] = true;
        for (int i = 2; i < Math.sqrt(10000); i++) {
            if (prime[i]) continue;

            for (int j = i * i; j < 10001; j += i) {
                prime[j] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(br.readLine());
        make_prime();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.valueOf(br.readLine());

            int l = n / 2;
            int r = n / 2;

            while (true) {
                if (prime[l] == false && prime[r] == false) {
                    sb.append(l + " " + r).append("\n");
                    break;
                }
                l--;
                r++;
            }
        }
        System.out.println(sb.toString());
    }
}
