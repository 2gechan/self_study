package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.valueOf(st.nextToken());
        int b = Integer.valueOf(st.nextToken());
        // A : 65, Z = 90

        StringBuilder sb = new StringBuilder();
        while (n > 0) {

            if (n % b >= 10) {
                sb.append((char) (n % b + 55)); // 나머지가 10일 경우 10 + 55 = 'A'
            } else sb.append(n % b);
            n /= b;
        }
        System.out.println(sb.reverse().toString());
    }
}
