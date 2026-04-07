package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon9613 {

    static int gcd(int a, int b) {

        int tmp = 0;
        while (b > 0) {
            tmp = b;
            b = a % b;
            a = tmp;

        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[Integer.parseInt(st.nextToken())];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            long sum = 0;

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    int gcd = gcd(arr[i], arr[j]);
                    sum += gcd;
                }
            }

            sb.append(sum).append("\n");

        }
        System.out.println(sb.toString());
    }
}
