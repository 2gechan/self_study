package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int testCnt = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.valueOf(st.nextToken());
            int p = Integer.valueOf(st.nextToken());
            int v = Integer.valueOf(st.nextToken());
            if (l == 0 && p == 0 && v == 0) break;

            int sum = 0;
            int tmp = v / p;
            sum += tmp * l;

            int tmp2 = v % p;
            if (tmp2 > l) sum += l;
            else sum += tmp2;

            sb.append("Case ").append(testCnt).append(": ").append(sum).append("\n");
            testCnt++;
        }
        System.out.println(sb.toString());
    }
}
