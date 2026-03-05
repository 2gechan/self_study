package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver13241 {

    static long gcd(long a, long b) {
        long tmp = 0;
        while (b > 0) {
            tmp = a;
            a = b;
            b = tmp % b;
        }

        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long gcd = gcd(Math.max(a, b), Math.min(a, b));

        long lcm = (a * b) / gcd;
        System.out.println(lcm);

    }
}
