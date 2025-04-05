package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon17103 {

    static boolean[] prime = new boolean[1000001];
    static void make_prime() {

        prime[0] = prime[1] = true;

        for (int i = 2; i < prime.length; i++) {

            if (!prime[i]) {

                for (int j = 2; i * j < prime.length; j++) {
                    prime[i * j] = true;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(br.readLine());

        make_prime();
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {

            int n = Integer.valueOf(br.readLine());
            int answer = 0;
            if (n % 2 == 0 && n > 1) {

                for (int i = 2; i <= n / 2; i++) {

                    if (!prime[i]) {

                        if (!prime[n - i]) answer++;
                    }
                }
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb.toString());
    }
}
