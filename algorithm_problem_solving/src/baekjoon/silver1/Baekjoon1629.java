package baekjoon.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Baekjoon1629 {

    static long solution(Long a, Long b, Long c) {

        if (b == 0) return 1;

        long half = solution(a, b / 2, c);
        long result = (half * half) % c;

        if (b % 2 == 1) {
            result = (result * a) % c;
        }

        return result;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.valueOf(st.nextToken());
        long b = Long.valueOf(st.nextToken());
        long c = Long.valueOf(st.nextToken());

        long result = solution(a, b, c);
        System.out.println(result);
    }
}
