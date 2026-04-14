package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon4134 {


    static long prime(long n) {

        long num = n;


        if (num == 0 || num == 1) return 2;
        while (true) {
            int cnt = 0;
            for (int i = 2; i <= Math.sqrt(num); i++) {

                if (num % i == 0) cnt++;

            }
            if (cnt == 0) {
                return num;
            }

            num++;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine());
            long prime = prime(n);
            System.out.println(prime);
        }

    }
}
