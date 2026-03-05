package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze1934 {


    static int gcd(int a, int b) {

        while (b != 0) {
            int r = a % b;

            a = b;
            b = r;
        }

        return a;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.valueOf(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.valueOf(st.nextToken());
            int b = Integer.valueOf(st.nextToken());

            int r = gcd(a, b);
            sb.append((a * b) / r).append("\n");
        }
        System.out.println(sb.toString());
    }
}
